package es.ua.eps.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.ua.eps.sqlite.databinding.ActivityUserManagementBinding

class UserManagement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUserManagementBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnNuevo.setOnClickListener {
                Intent(this@UserManagement,NewUser::class.java).also {
                    startActivity(it)
                }
            }
            btnActualizar.setOnClickListener {
                Intent(this@UserManagement,UpdateUser::class.java).also {
                    startActivity(it)
                }
            }
            btnEliminar.setOnClickListener {
                Toast.makeText(this@UserManagement,"Todo", Toast.LENGTH_SHORT).show()
            }
            btnLista.setOnClickListener {
                Intent(this@UserManagement,ListUsers::class.java).also {
                    startActivity(it)
                }
            }
            btnVolver.setOnClickListener {
                this@UserManagement.finish()
            }
        }
    }
}