package com.github.mfilipeamorim.mundosocial

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.mfilipeamorim.mundosocial.data.db.AppDatabase
import com.github.mfilipeamorim.mundosocial.data.model.UsuarioEntity
import com.github.mfilipeamorim.mundosocial.databinding.ActivityCadastroUsuarioBinding
import kotlinx.coroutines.launch

class CadastroUsuarioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroUsuarioBinding
    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityCadastroUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = AppDatabase.getInstance(this)

        binding.botaoSalvar.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val idade = binding.editIdade.text.toString().toIntOrNull()

            // Verificações
            if (nome.isBlank()) {
                Toast.makeText(this, "O nome não pode estar em branco.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (idade == null || idade < 3 || idade > 90) {
                Toast.makeText(this, "Informe uma idade válida/", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Salvamento
            lifecycleScope.launch {
                db.usuarioDao().desativarTodos()
                db.usuarioDao().inserir(UsuarioEntity(nome = nome, idade = idade, ativo = true))

                runOnUiThread {
                    Toast.makeText(this@CadastroUsuarioActivity, "Usuário criado com sucesso!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@CadastroUsuarioActivity, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}
