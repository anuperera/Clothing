package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ResetPw : AppCompatActivity() {

    lateinit var emailEt: EditText
    lateinit var etMobile: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pw)

        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //actionBar!!.title = "Reset Password"

        viewInitializations()
        validateInput()

        val next = findViewById<Button>(R.id.NextBtn)
        // set on-click listener
        next.setOnClickListener {
            if (validateInput()) {
                val intent = Intent(this, OTP::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "please fill all the required fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    //back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun viewInitializations() {
        emailEt = findViewById(R.id.emailEt3)
        etMobile = findViewById(R.id.Mobile2)



    }

    private fun validateInput(): Boolean {
        if (emailEt.text.toString() == "") {
            emailEt.error = "Please Enter Email"
            return false
        }
        if (etMobile.text.toString() == "") {
            etMobile.error = "Please Enter Mobile Number"
            return false
        }
        // checking the proper email format
        if (!isEmailValid(emailEt.text.toString())) {
            emailEt.error = "Please Enter Valid Email"
            return false
        }
        // checking minimum mobile number Length
        val MIN_MOBILE_LENGTH = 9;

        if (etMobile.text.length <= MIN_MOBILE_LENGTH) {
                etMobile.error =
                    "Not a valid mobile number"
                return false
            }

        return true
    }

    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

}