package com.maltaisn.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import com.maltaisn.notes.ui.main.MainActivity
import kotlinx.coroutines.handleCoroutineException

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(this@SplashScreenActivity,
                    MainActivity::class.java)
            )
            finish()
        },4000)
    }
}