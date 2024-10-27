package com.example.appestudos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appestudos.databinding.FilmeItemBinding
import com.example.appestudos.model.Filme

class AdapterFilme(private val context: Context, private val listaFilme: MutableList<Filme>): RecyclerView.Adapter<AdapterFilme.FilmeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemLista = FilmeItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return FilmeViewHolder(itemLista)
    }
                 /* config padrão adapter recycleview sem receber dados de API */
    override fun getItemCount() = listaFilme.size

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.txtTitleMovie.text = listaFilme[position].Title
    }

    inner class FilmeViewHolder(binding: FilmeItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtTitleMovie = binding.txtTitleFilm
    }
}