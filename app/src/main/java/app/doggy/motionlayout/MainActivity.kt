package app.doggy.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var flag: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        red.setOnClickListener {
            changeColorAnimation(flag)
        }

        blue.setOnClickListener {
            changeColorAnimation(flag)
        }
    }

    fun changeColorAnimation(nowFlag: Boolean) {
        if(nowFlag){
            root.transitionToEnd()
        } else {
            root.transitionToStart()
        }
        flag = !nowFlag
    }
}