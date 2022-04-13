package com.codepath.discotunery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.parse.ParseUser

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        findViewById<Button>(R.id.ToLogInButton).setOnClickListener {
            goToLoginUpActivity()
        }

        findViewById<Button>(R.id.SignUpButton).setOnClickListener {
            val username = findViewById<EditText>(R.id.et_username).text.toString()
            val password = findViewById<EditText>(R.id.et_password).text.toString()
            signUpUser(username, password)
        }

    }



    private fun goToLoginUpActivity() {
        val intent = Intent (this@SignUpActivity, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun goToMainActivity() {
        val intent = Intent (this@SignUpActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun signUpUser (username: String, password: String){
        // Create the ParseUser
        val user = ParseUser()

        // Set fields for the user to be created
        user.setUsername(username)
        user.setPassword(password)

        user.signUpInBackground { e ->
            if (e == null) {
                goToMainActivity()
                Log.i(TAG, "Successfully Signed Up")
            } else {
                // Sign up didn't succeed. Look at the ParseException
                // to figure out what went wrong
                e.printStackTrace()
                Toast.makeText(this, "Error Signing Up", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object{
        const val TAG = "SignUpActivity"
    }
}