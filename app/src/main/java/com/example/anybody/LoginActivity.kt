package com.example.anybody

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.reflect.KClass

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button : Button = findViewById(R.id.buttin)
        button.setOnClickListener{
            val intent = Intent(this, PhotoAlbumActivity::class.java)
            Toast.makeText(this@LoginActivity, "로그인되었습니다.", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }

    private fun Intent(activity: LoginActivity, kClass: KClass<PhotoAlbumActivity>): Intent? {
        TODO("Not yet implemented")
    }

}