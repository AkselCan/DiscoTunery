package com.codepath.discotunery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.parse.ParseUser

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        if (ParseUser.getCurrentUser() != null){
//            goToMainActivity()
//        }

        findViewById<Button>(R.id.ToSignUpButton).setOnClickListener {
            goToSignUpActivity()
        }

        findViewById<Button>(R.id.LogInButton).setOnClickListener {
            val username = findViewById<EditText>(R.id.et_username).text.toString()
            val password = findViewById<EditText>(R.id.et_password).text.toString()
            loginUser(username, password)
        }


    }

    private fun loginUser (username: String, password: String){
        ParseUser.logInInBackground(username, password, ({ user, e ->
            if (user != null) {
                Log.i(TAG, "Successfully Logged In")
                goToMainActivity()
            } else {
                e.printStackTrace()
                Toast.makeText(this, "Error Logging in", Toast.LENGTH_SHORT).show()
            }})
        )
    }

    private fun goToMainActivity() {
        val intent = Intent (this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun goToSignUpActivity() {
        val intent = Intent (this@LoginActivity, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }

    companion object {
        const val TAG = "LoginActivity"
    }
}

