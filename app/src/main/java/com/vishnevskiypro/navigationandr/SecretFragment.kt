package com.vishnevskiypro.navigationandr

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vishnevskiypro.navigationandr.databinding.FragmentSecretBinding

class SecretFragment : Fragment(R.layout.fragment_secret) {

    private lateinit var binding: FragmentSecretBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecretBinding.bind(view)

        binding.closeAllBoxButton.setOnClickListener {
            findNavController().popBackStack(R.id.rootFragment, false)
        }

        binding.goBackButtonSecret.setOnClickListener {
            findNavController().popBackStack()
        }

    }




}