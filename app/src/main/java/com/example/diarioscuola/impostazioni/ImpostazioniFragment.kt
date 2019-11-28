package com.example.diarioscuola.impostazioni

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diarioscuola.R


class ImpostazioniFragment : Fragment() {

    companion object {
        fun newInstance() = ImpostazioniFragment()
    }

    private lateinit var viewModel: ImpostazioniViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.impostazioni_fragment, container, false)
    }


}
