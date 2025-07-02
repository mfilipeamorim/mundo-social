package com.github.mfilipeamorim.mundosocial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.mfilipeamorim.mundosocial.data.model.CenarioEntity
import com.github.mfilipeamorim.mundosocial.databinding.ItemCenarioBinding

class CenarioAdapter(
    private val onClick: (CenarioEntity) -> Unit
) : RecyclerView.Adapter<CenarioAdapter.ViewHolder>() {

    private val itens = mutableListOf<CenarioEntity>()

    fun submitList(novos: List<CenarioEntity>) {
        itens.clear()
        itens.addAll(novos)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemCenarioBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(cenario: CenarioEntity) {
            binding.tituloCenario.text = cenario.titulo
            binding.root.setOnClickListener { onClick(cenario) }
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