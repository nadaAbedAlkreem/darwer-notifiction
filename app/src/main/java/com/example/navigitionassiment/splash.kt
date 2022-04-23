package com.example.navigitionassiment

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
 import com.example.navigitionassiment.databinding.FragmentSplashBinding

class splash : Fragment() {
    private  lateinit var binding: FragmentSplashBinding
    lateinit var  handler : Handler
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater,  container, false)
        handler = Handler()
        handler.postDelayed({
           requireActivity().supportFragmentManager.beginTransaction().replace(R.id.mainContert , home()).commit()

        } , 2000 )
        return binding.root
    }
}