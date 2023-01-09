package es.ua.eps.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.sqlite.databinding.ActivityUpdateUserBinding

class UpdateUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUpdateUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnUpBack.setOnClickListener {
                this@UpdateUser.finish()
            }
        }
    }
}