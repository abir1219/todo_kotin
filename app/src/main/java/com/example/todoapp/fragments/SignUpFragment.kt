package com.example.todoapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todoapp.R
import com.example.todoapp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment(),View.OnClickListener{
    private var _binding : FragmentSignUpBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(layoutInflater,container,false)
        binding?.tvSignIn?.setOnClickListener(this)
        return binding?.root
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tvSignIn->{
                findNavController().navigate(R.id.signUp_to_signIn)
            }
        }
    }

}