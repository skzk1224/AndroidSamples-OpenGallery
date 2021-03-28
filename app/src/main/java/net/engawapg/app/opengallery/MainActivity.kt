package net.engawapg.app.opengallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val launcher = registerForActivityResult(ActivityResultContracts.OpenDocument()) {
        imageView.setImageURI(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            launcher.launch(arrayOf("image/*"))
        }
    }
}