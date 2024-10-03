package com.example.cp2_mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cp2_mobile.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {

    private var _binding: FragmentDisplayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val input1 = arguments?.getString("input1")
        val input2 = arguments?.getString("input2")
        val input3 = arguments?.getString("input3")

        binding.txtInput1.text = input1
        binding.txtInput2.text = input2
        binding.txtInput3.text = input3
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
