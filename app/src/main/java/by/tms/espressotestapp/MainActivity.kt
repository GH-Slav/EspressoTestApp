package by.tms.espressotestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener {
            if (inputName.text.isNotEmpty() && inputLastName.text.isNotEmpty()) {
                outputText.text = inputName.text.append(" ").append(inputLastName.text)
            }
        }
    }
}
