package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class OTP : AppCompatActivity() {

    lateinit var etOTP: EditText
    lateinit var etPassword: EditText
    lateinit var etRepeatPassword: EditText
    val MIN_PASSWORD_LENGTH = 6;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        viewInitializations()
        validateInput()

        val submit = findViewById<Button>(R.id.SubBtn)
        // set on-click listener
        submit.setOnClickListener {
            if (validateInput()) {
                Toast.makeText(this, "Password reset success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun viewInitializations() {

        etOTP = findViewById(R.id.OTPet)
        etPassword = findViewById(R.id.passwordEt)
        etRepeatPassword= findViewById(R.id.ConfirmEt)
    }
    private fun validateInput(): Boolean {
        if (etOTP.text.toString().equals("")) {
            etOTP.setError("Please Enter the OTP")
            return false
        }
        if (etPassword.text.toString().equals("")) {
            etPassword.setError("Please Enter Password")
            return false
        }
        if (etRepeatPassword.text.toString().equals("")) {
            etRepeatPassword.setError("Please Enter Repeat Password")
            return false
        }
        // checking minimum password Length
        if (etPassword.text.length < MIN_PASSWORD_LENGTH) {
            etPassword.setError("Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters")
            return false
        }
        // Checking if repeat password is same
        if (!etPassword.text.toString().equals(etRepeatPassword.text.toString())) {
            etRepeatPassword.setError("Password does not match")
            return false
        }
        return true
    }
}