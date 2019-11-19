package com.example.diarioscuola

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.diarioscuola.lezioni.Lezioni
import kotlinx.android.synthetic.main.lezioni_fragment.*
import kotlinx.android.synthetic.main.main_avtivity_fragment.*


class MainActivityFragment : Fragment() {

    companion object {
        fun newInstance() = MainActivityFragment()
    }

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.main_avtivity_fragment, container, false)

        root.findViewById<Button>(R.id.button1)
            .setOnClickListener {
                findNavController().navigate(R.id.lezioniFragment)
            }

        root.findViewById<Button>(R.id.button2)
            .setOnClickListener {
                findNavController().navigate(R.id.compitiFragment)
            }


        root.findViewById<Button>(R.id.button3)
            .setOnClickListener {
                findNavController().navigate(R.id.appuntiFragment)
            }



        root.findViewById<Button>(R.id.button4)
            .setOnClickListener {
                findNavController().navigate(R.id.calendarioFragment)
            }


        root.findViewById<Button>(R.id.button5)
            .setOnClickListener {
                findNavController().navigate(R.id.impostazioniFragment)
            }

        root.findViewById<Button>(R.id.button6)
            .setOnClickListener {
                findNavController().navigate(R.id.notizieFragment)
            }

        return root
    }
}