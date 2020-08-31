package com.example.atry

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b=supportActionBar
        if (b != null) {
            b.hide()
        }
    }
    var a =" "
    fun b1(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"1"
        textid.setText(a)
    }
    fun b2(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"2"
        textid.setText(a)
    }
    fun b3(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"3"
        textid.setText(a)
    }
    fun b4(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"4"
        textid.setText(a)
    }
    fun b5(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"5"
        textid.setText(a)
    }
    fun b6(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"6"
        textid.setText(a)
    }
    fun b7(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"7"
        textid.setText(a)
    }
    fun b8(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"8"
        textid.setText(a)
    }
    fun b9(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"9"
        textid.setText(a)
    }
    fun b0(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"0"
        textid.setText(a)
    }
    fun plus(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"+"
        textid.setText(a)
    }
    fun minus(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"-"
        textid.setText(a)
    }
    fun multiply(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"*"
        textid.setText(a)
    }
    fun div(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"/"
        textid.setText(a)
    }
    fun bracket(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a="("+textid.text.toString()+")"
        textid.setText(a)
    }
    fun dot(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"."
        textid.setText(a)
    }
    fun pm(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a="-"+textid.text.toString()
        textid.setText(a)
    }
    fun cancel(v: View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=""
        textid.setText(a)
    }
    fun percent(v:View){
        MediaPlayer.create(this,R.raw.pop).start()
        a=textid.text.toString()+"%"
        textid.setText(a)
    }
    fun equal(v:View){


//        try{
//            a=textid.text.toString()
//            val b= ExpressionBuilder(a).build()
//            b.evaluate()
//            textid.setText(b.toString())
//        }catch (e:ArithmeticException) {
//            Log.d("ArithmeticException",e.message)
//        }
        try {
            val b = ExpressionBuilder(a).build().evaluate()
            textid.setText(b.toString())
        }
        catch(e:Exception){
            textid.setText(e.message)
            MediaPlayer.create(this,R.raw.block).start()
        }

    }



}