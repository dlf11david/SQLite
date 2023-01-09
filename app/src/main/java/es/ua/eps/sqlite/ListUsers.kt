package es.ua.eps.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.sqlite.databinding.ActivityListUsersBinding

class ListUsers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityListUsersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnList.setOnClickListener {
                this@ListUsers.finish()
            }
        }
    }
}