package com.charles.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.charles.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var myMusicAdapter: MusicAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val songs : List<MusicModel> = listOf (
        MusicModel(
            "Abule","Pato",false
        ),
        MusicModel(
            "Don Dada","Timaya",false
        )
        )
        myMusicAdapter=MusicAdapter(songs)
        binding.recyclerView.adapter= myMusicAdapter
    }
}