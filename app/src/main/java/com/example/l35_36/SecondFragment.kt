package com.example.l35_36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.example.l35_36.databinding.FragmentSecondBinding

class SecondFragment : Fragment(){

    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSecondBinding.inflate(layoutInflater,container,false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentThree.setOnClickListener{
            val navController = Navigation.findNavController(requireView())
            navController.navigate(R.id.thirdFragment)
        }
        binding.buttonBackToFirst.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}
