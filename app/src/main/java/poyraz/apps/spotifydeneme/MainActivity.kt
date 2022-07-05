package poyraz.apps.spotifydeneme

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import poyraz.apps.spotifydeneme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anasayfa = findViewById<ConstraintLayout>(R.id.anasayfa)
        val arama = findViewById<ConstraintLayout>(R.id.arama)
        val kitaplik = findViewById<ConstraintLayout>(R.id.kitaplik)


        anasayfa.setOnClickListener{
        findViewById<TextView>(R.id.t1).setTextColor(R.color.arkaplan_siyah)
        }
        arama.setOnClickListener{

        }
        kitaplik.setOnClickListener{

        }

    }
}