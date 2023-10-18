package com.example.projectbp2662

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //instance
        val call:ImageView = findViewById(R.id.call)
        val web:ImageView = findViewById(R.id.website)
        val location:ImageView = findViewById(R.id.maps)

        call.setOnClickListener{
            val callIntent: Intent= Uri.parse("tel:085802705913").let{
                number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        web.setOnClickListener{
            val webIntent: Intent= Uri.parse("https://home.amikom.ac.id/").let{
                    webpage-> Intent(Intent.ACTION_VIEW,webpage)
            }
            startActivity(webIntent)
        }

        location.setOnClickListener{
            val gmmIntentUri = Uri.parse("geo:47.6,-122,3?z=11")
            val mapIntent= Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if(mapIntent.resolveActivity(packageManager) !=null){
                startActivity(mapIntent)
            }
        }
    }
}