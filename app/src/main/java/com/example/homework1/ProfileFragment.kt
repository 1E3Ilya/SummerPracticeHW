package com.example.homework1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework1.databinding.FragmentProfileBinding

class ProfileFragment  : Fragment(R.layout.fragment_profile) {

    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}