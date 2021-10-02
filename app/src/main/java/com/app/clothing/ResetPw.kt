package com.app.clothing

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.animation.AnimationUtils
import android.widget.*

class ResetPw : AppCompatActivity() {

    lateinit var emailEt: EditText
    lateinit var etMobile: EditText

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pw)

        val ttp = AnimationUtils.loadAnimation(this,R.anim.ttp)
        val header = findViewById<ImageView>(R.id.imageViewAppIcon)

        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        val bt = findViewById<ImageButton>(R.id.NextBtn)
        val tx = findViewById<TextView>(R.id.textView6)
        val tx2 = findViewById<TextView>(R.id.textView5)

        //set anim
        header.startAnimation(ttp)
        bt.startAnimation(stb)
        tx.startAnimation(stb)
        tx2.startAnimation(stb)

        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        viewInitializations()
        validateInput()

        val next = findViewById<ImageButton>(R.id.NextBtn)
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