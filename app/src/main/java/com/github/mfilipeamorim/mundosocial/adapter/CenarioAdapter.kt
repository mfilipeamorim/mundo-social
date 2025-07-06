package com.github.mfilipeamorim.mundosocial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.mfilipeamorim.mundosocial.R
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.databinding.ItemCenarioBinding

class CenarioAdapter(
    private val onClick: (CenarioEntity) -> Unit
) : RecyclerView.Adapter<CenarioAdapter.ViewHolder>() {

    private val itens = mutableListOf<CenarioEntity>()
    private var nivelUsuario: Int = 0

    fun submitList(novos: List<CenarioEntity>) {
        itens.clear()
        itens.addAll(novos)
        notifyDataSetChanged()
    }

    fun setNivelUsuario(nivel: Int) {
        nivelUsuario = nivel
    }

    inner class ViewHolder(val binding: ItemCenarioBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(cenario: CenarioEntity) {
            val desbloqueado = nivelUsuario >= cenario.nivel

            val imagemResId = when (cenario.titulo.lowercase()) {
                "metáforas" -> R.drawable.cenario_metaforas
                "indiretas" -> R.drawable.cenario_indiretas
                "irônias" -> R.drawable.cenario_ironias
                else -> R.drawable.placeholder
            }

            binding.imagemCenario.setImageResource(imagemResId)

            // Título com bloqueio
            binding.tituloCenario.text = if (desbloqueado) {
                cenario.titulo
            } else {
                "🔒 ${cenario.titulo}\n(Nível ${cenario.nivel})"
            }

            // Visual bloqueado
            binding.root.alpha = if (desbloqueado) 1f else 0.5f
            binding.root.isEnabled = desbloqueado

            // Clique só se desbloqueado
            binding.root.setOnClickListener {
                if (desbloqueado) {
                    onClick(cenario)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCenarioBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = itens.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itens[position])
    }
}
