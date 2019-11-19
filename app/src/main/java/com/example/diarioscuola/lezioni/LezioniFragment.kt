package com.example.diarioscuola.lezioni

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diarioscuola.R


class LezioniFragment : Fragment() {

    companion object {
        fun newInstance() = LezioniFragment()
    }

    private lateinit var viewModel: LezioniViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.lezioni_fragment, container, false)
    }
    

}
