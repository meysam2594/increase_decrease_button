package com.huynn109.increase_decrease_button_demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.huynn109.IncreaseDecreaseButton
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<IncreaseDecreaseButton>(R.id.inDeButton)
        btn.onChangeListener {
            Toast.makeText(this.applicationContext, "$it", Toast.LENGTH_SHORT).show()
            Timber.d("onCreate: ${btn.getCurrentNumber()}")
        }
    }
}