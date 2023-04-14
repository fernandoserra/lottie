package com.code.demo_lottie

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.TextDelegate

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //private val binding: DynamicTextActivityBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var like =false
        //val textDelegate = TextDelegate(binding.dynamicTextView)
        imgShow.setOnClickListener {
            like = runAnimation(imgShow,R.raw.material_wave_loading,like)
        }
    }


    private fun runAnimation(imageView: LottieAnimationView, animation:Int,like:Boolean):Boolean{
        if (!like){
            imageView.setAnimation(animation)
            //imageView.setTextDelegate()
            imageView.playAnimation()
        }else{
                imageView.setImageResource(R.drawable.ic_launcher_background)
        }
        return !like
    }
}