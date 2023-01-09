package es.ua.eps.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.sqlite.databinding.ActivityNewUserBinding

class NewUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNewUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnNewBack.setOnClickListener {
                this@NewUser.finish()
            }
        }
    }
}