package com.github.mfilipeamorim.mundosocial.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.HistoricoEntity
import com.github.mfilipeamorim.mundosocial.databinding.ItemHistoricoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HistoricoAdapter(private val db: AppDatabase) :
    RecyclerView.Adapter<HistoricoAdapter.ViewHolder>() {

    private val lista = mutableListOf<HistoricoEntity>()

    fun submitList(novaLista: List<HistoricoEntity>) {
        lista.clear()
        lista.addAll(novaLista)
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: ItemHistoricoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(historico: HistoricoEntity) {
            CoroutineScope(Dispatchers.Main).launch {
                val historia = db.historiaDao().buscarPorId(historico.historiaId)
                val cenario = db.cenarioDao().buscarPorId(historico.cenarioId)

                // Título do cenário
                binding.textCenario.text = cenario?.titulo ?: "Cenário desconhecido"

                // Descrição da história
                binding.textDescricao.text = historia?.descricao ?: "História não encontrada"

                // Opção escolhida
                val opcaoTexto = when (historico.opcaoEscolhida) {
                    1 -> historia?.opcao1
                    2 -> historia?.opcao2
                    3 -> historia?.opcao3
                    else -> "Opção inválida"
                }
                val explicacaoTexto = when (historico.opcaoEscolhida) {
                    1 -> historia?.explicacao1
                    2 -> historia?.explicacao2
                    3 -> historia?.explicacao3
                    else -> ""
                }

                binding.textEscolha.text = "Sua escolha: $opcaoTexto"

                binding.textResultado.text =
                    if (historico.acertou) "✅ Acertou!\n\n$explicacaoTexto"
                    else "❌ Errou!\n\n$explicacaoTexto"

                binding.textResultado.setTextColor(
                    if (historico.acertou) Color.parseColor("#3FB950")
                    else Color.parseColor("#DA3633")
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHistoricoBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }
}
