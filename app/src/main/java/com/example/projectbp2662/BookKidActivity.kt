package com.example.projectbp2662

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.projectbp2662.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding: ActivityBookKidBinding

    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //event saat button fairy diklik
        binding.buttonFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }

        //event saat button fable diklik
        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        //event saat button science diklik
        binding.buttonScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }
}