package com.example.projectbp2662

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //instance
        val btnMore:Button = findViewById(R.id.button0)
        val btnBookKid:Button = findViewById(R.id.button7)
        val btnSpace:Button = findViewById(R.id.button9)
        val rvBuku:RecyclerView = findViewById(R.id.recyclerViewBuku)

        //set layout manager di RecyclerView
        rvBuku.layoutManager = LinearLayoutManager(this)

        //list data buku
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4, "Mermaid to Rescue", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book2, "Ade's Adventure", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))
        data.add(BukuModel(R.drawable.book4, "Mermaid to Rescue", "Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet Lorem Ipsum Dolor Sit Amet"))

        //set adapter
        val adapter = AdapterHome(data)

        //set adapter ke recycler view
        rvBuku.adapter = adapter

        //event button more click
        btnMore.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        btnSpace.setOnClickListener{
            val intent = Intent(this, ResponsiActivity::class.java)
            startActivity(intent)
        }

        btnBookKid.setOnClickListener{
            val intent = Intent(this, BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}