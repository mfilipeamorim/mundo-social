import android.content.Context
import android.widget.Toast
import com.github.mfilipeamorim.mundosocial.data.db.ConquistaDao
import com.github.mfilipeamorim.mundosocial.data.db.UsuarioDao
import com.github.mfilipeamorim.mundosocial.data.model.UsuarioEntity

class GamificacaoUtils {
    companion object {

        suspend fun adicionarXp(
            context: Context, // 👈 necessário para mostrar Toast
            usuarioDao: UsuarioDao,
            conquistaDao: ConquistaDao,
            usuario: UsuarioEntity,
            xpGanho: Int,
            historicoCount: Int
        ) {
            val novoXpTotal = usuario.xp + xpGanho
            var novoNivel = usuario.nivel
            var xpRestante = novoXpTotal

            while (xpRestante >= 100) {
                novoNivel++
                xpRestante -= 100
            }

            val usuarioAtualizado = usuario.copy(
                xp = xpRestante,
                nivel = novoNivel
            )

            usuarioDao.atualizar(usuarioAtualizado)

            verificarConquistas(context, usuarioAtualizado, historicoCount, conquistaDao)
        }

        private suspend fun verificarConquistas(
            context: Context,
            usuario: UsuarioEntity,
            historicoCount: Int,
            conquistaDao: ConquistaDao
        ) {
            val conquistas = conquistaDao.listarTodas()

            for (conquista in conquistas) {
                when (conquista.titulo) {
                    "Primeiro Acerto!" -> {
                        if (historicoCount >= 1 && !conquista.desbloqueada) {
                            conquistaDao.desbloquear(conquista.id)
                            Toast.makeText(
                                context,
                                "🏅 Conquista desbloqueada: ${conquista.titulo}",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                    "Pequeno Sociológo" -> {
                        if (usuario.nivel >= 3 && !conquista.desbloqueada) {
                            conquistaDao.desbloquear(conquista.id)
                            Toast.makeText(
                                context,
                                "🏅 Conquista desbloqueada: ${conquista.titulo}",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                }
            }
        }
    }
}
