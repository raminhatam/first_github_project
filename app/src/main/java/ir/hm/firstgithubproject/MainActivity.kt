package ir.hm.firstgithubproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "fist guthub project", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "second guthub project", Toast.LENGTH_SHORT).show()


    }
}