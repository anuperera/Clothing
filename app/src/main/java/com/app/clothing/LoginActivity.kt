package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    val MIN_PASSWORD_LENGTH = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewInitializations()
        validateInput()

        val login = findViewById<Button>(R.id.LoginBtn)
        // set on-click listener
        login.setOnClickListener {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
        }
        val signup = findViewById<Button>(R.id.bt_signup)
        // set on-click listener
        signup.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        val forgot = findViewById<Button>(R.id.forgotPw)
        // set on-click listener
        forgot.setOnClickListener {
            val intent = Intent(this, ResetPw::class.java)
            startActivity(intent)
        }


    }

    private fun viewInitializations() {
        etEmail = findViewById(R.id.emailEt)
        etPassword = findViewById(R.id.passwordEt)
    }


    // Checking if the input in form is valid
    private fun validateInput(): Boolean {
        if (etEmail.text.toString() == "") {
            etEmail.error = "Please Enter the Email"
            return false
        }
        if (etPassword.text.toString() == "") {
            etPassword.error = "Please Enter the Password"
            return false
        }
        // checking the proper email format
        if (!isEmailValid(etEmail.text.toString())) {
            etEmail.error = "Please Enter a Valid Email"
            return false
        }
        // checking minimum password Length
        if (etPassword.text.length < MIN_PASSWORD_LENGTH) {
            etPassword.error = "Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters"
            return false
        }
        return true
    }

    private fun isEmailValid(email: String?): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}