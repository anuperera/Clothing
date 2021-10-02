package com.app.clothing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.*

class OTP : AppCompatActivity() {

    lateinit var etOTP: EditText
    lateinit var etPassword: EditText
    lateinit var etRepeatPassword: EditText
    val MIN_PASSWORD_LENGTH = 6;

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val ttp = AnimationUtils.loadAnimation(this,R.anim.ttp)
        val header = findViewById<ImageView>(R.id.imageViewAppIcon)

        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        val bt = findViewById<ImageButton>(R.id.SubBtn)
        val tx = findViewById<TextView>(R.id.textView6)
        val tx2 = findViewById<TextView>(R.id.textView5)

        //set anim
        header.startAnimation(ttp)
        bt.startAnimation(stb)
        tx.startAnimation(stb)
        tx2.startAnimation(stb)

        viewInitializations()
        validateInput()

        val submit = findViewById<ImageButton>(R.id.SubBtn)
        // set on-click listener
        submit.setOnClickListener {
            if (validateInput()) {
                Toast.makeText(this, "Password reset success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "please fill all the required fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun viewInitializations() {

        etOTP = findViewById(R.id.OTPet)
        etPassword = findViewById(R.id.passwordEt)
        etRepeatPassword= findViewById(R.id.ConfirmEt)
    }
    private fun validateInput(): Boolean {
        if (etOTP.text.toString() == "") {
            etOTP.error = "Please Enter the OTP"
            return false
        }
        if (etPassword.text.toString() == "") {
            etPassword.error = "Please Enter Password"
            return false
        }
        if (etRepeatPassword.text.toString() == "") {
            etRepeatPassword.error = "Please Enter Repeat Password"
            return false
        }
        // checking minimum password Length
        if (etPassword.text.length < MIN_PASSWORD_LENGTH) {
            etPassword.error = "Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters"
            return false
        }
        // Checking if repeat password is same
        if (etPassword.text.toString() != etRepeatPassword.text.toString()) {
            etRepeatPassword.error = "Password does not match"
            return false
        }
        return true
    }
}