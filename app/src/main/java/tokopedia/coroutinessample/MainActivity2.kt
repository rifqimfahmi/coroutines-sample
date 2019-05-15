package tokopedia.coroutinessample;

/**
 * @author ricoharisin .
 */

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity2 : AppCompatActivity() {

    private lateinit var tv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tv) as TextView
        execute()
    }

    fun showTextDelay() {
        Handler().postDelayed({
            tv.setText("Hello may friend")
        }, 2000)
    }

    fun execute() = GlobalScope.launch(Dispatchers.Main) {
        showTextDelay()
    }

}