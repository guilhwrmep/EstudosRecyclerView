package com.example.appestudos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appestudos.adapter.AdapterFilme
import com.example.appestudos.databinding.ActivityMainBinding
import com.example.appestudos.model.Filme

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterFilme: AdapterFilme
    private val listaFilmes: MutableList<Filme> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFilme = binding.recyclerViewFilme
        recyclerViewFilme.layoutManager = LinearLayoutManager(this)
        recyclerViewFilme.setHasFixedSize(true)
        adapterFilme = AdapterFilme(this, listaFilmes)
        recyclerViewFilme.adapter = adapterFilme
        filmes()
    }

    private fun filmes() {       /* passa dados para a list e retorna na recycleview */
        val filme1 = Filme("Os Vingadores")
        listaFilmes.add(filme1)

        val filme2 = Filme("Os Incriveis")
        listaFilmes.add(filme2)

        val filme3 = Filme("O Protetor")
        listaFilmes.add(filme3)

        val filme4 = Filme("O Protetor 2")
        listaFilmes.add(filme4)

        val filme5 = Filme("O Protetor 3")
        listaFilmes.add(filme5)

        val filme6 = Filme("Busca Implacavel")
        listaFilmes.add(filme6)

        val filme7 = Filme("Busca Implacavel 2")
        listaFilmes.add(filme7)

        val filme8 = Filme("Busca Implacavel 3")
        listaFilmes.add(filme8)

        val filme9 = Filme("Batman Begins")
        listaFilmes.add(filme9)

        val filme10 = Filme("Batman: O Cavaleiro das Trevas")
        listaFilmes.add(filme10)
    }
}