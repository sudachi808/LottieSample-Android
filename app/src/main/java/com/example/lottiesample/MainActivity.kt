package com.example.lottiesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ToggleButton
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.favorite.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button.setOnClickListener {
            this.lottieView.setAnimation(R.raw.lottie_milk)
            this.lottieView.playAnimation()
        }

        this.favoriteView.apply {
            findViewById<ToggleButton>(R.id.toggleButton).setOnClickListener {
                findViewById<LottieAnimationView>(R.id.lottieView).also { lottie ->
                    lottie.setAnimation(R.raw.lottie_milk)
                    lottie.playAnimation()
                }
            }
        }
    }
}
