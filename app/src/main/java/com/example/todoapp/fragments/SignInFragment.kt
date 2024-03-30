package com.example.todoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentSignInBinding

class SignInFragment : Fragment(), View.OnClickListener {
    private var _binding : FragmentSignInBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignInBinding.inflate(layoutInflater,container,false)
        binding?.tvSignUp?.setOnClickListener(this)
        return binding?.root
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tvSignUp -> {
                findNavController().navigate(R.id.sign_in_to_signUp)
            }
        }
    }

}