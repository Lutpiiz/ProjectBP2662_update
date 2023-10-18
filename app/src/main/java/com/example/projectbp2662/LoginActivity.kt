package com.example.projectbp2662

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.username)
        val txtPassword:EditText = findViewById(R.id.password)

        //event saat button Login click
        btnLogin.setOnClickListener{
            //login cek
            if (txtUsername.text.toString().equals("luthfi") &&
                txtPassword.text.toString().equals("1234")) {
                //call homepage
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Login gagal, cek username dan password",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}