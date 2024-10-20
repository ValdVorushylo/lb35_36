package com.example.l35_36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.example.l35_36.databinding.FragmentFirstBinding

class FirstFragment : Fragment(){

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding=FragmentFirstBinding.inflate(layoutInflater,container,false)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToFragmentTwo.setOnClickListener{
            val navController = Navigation.findNavController(requireView())
            navController.navigate(R.id.secondFragment)
        }
    }

}
