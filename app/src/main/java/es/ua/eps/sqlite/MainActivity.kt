package es.ua.eps.sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import es.ua.eps.sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnLogin.setOnClickListener{
                Intent(this@MainActivity,UserData::class.java).also {
                    startActivity(it)
                }
            }
            btnClose.setOnClickListener{
                this@MainActivity.finish()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val sqlUsers = SQLiteCode(this)
        when(item.itemId) {
            R.id.itCreate -> sqlUsers.backTable()
            R.id.itRestore -> sqlUsers.deleteTable(this)
            R.id.itManage -> Intent(this@MainActivity,UserManagement::class.java).also {
                startActivity(it)
            }
        }
        return true
    }
}