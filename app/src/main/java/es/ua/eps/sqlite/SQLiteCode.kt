package es.ua.eps.sqlite

import android.content.ContentValues
import android.database.sqlite.SQLiteOpenHelper
import android.content.Context
import android.database.sqlite.SQLiteDatabase

var selectedUser = ""

class SQLiteCode(context: Context): SQLiteOpenHelper(
    context, "usuarios.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = "CREATE TABLE usuarios" +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_usuario TEXT," +
                "password TEXT," +
                "nombre_completo TEXT," +
                "email TEXT)"
        db!!.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        val deleteTable = "DROP TABLE IF EXISTS usuarios"
        db!!.execSQL(deleteTable)
        onCreate(db)
    }

    fun addData(nombre_usuario: String, password: String, nombre_completo: String, email: String) {
        val data = ContentValues()
        data.put("nombre_usuario", nombre_usuario)
        data.put("password", password)
        data.put("nombre_completo", nombre_completo)
        data.put("email", email)
        val db = this.writableDatabase
        db.insert("usuarios", null, data)
        db.close()
    }

    fun deleteData(nombre_usuario: String) {
        val db = this.writableDatabase
        db.delete("usuarios", "nombre_usuario = ?", arrayOf(nombre_usuario))
        db.close()
    }

    fun updateData(
        nombre_usuario_old: String, nombre_usuario: String, password: String, nombre_completo: String, email: String
    ) {
        val data = ContentValues()
        data.put("nombre_usuario", nombre_usuario)
        data.put("password", password)
        data.put("nombre_completo", nombre_completo)
        data.put("email", email)
        val db = this.writableDatabase
        db.update("usuarios", data, "nombre_usuario = ?", arrayOf(nombre_usuario_old))
        db.close()
    }

}