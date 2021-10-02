package com.app.clothing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class LoginActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    val MIN_PASSWORD_LENGTH = 6

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val ttp = AnimationUtils.loadAnimation(this,R.anim.ttp)
        val header = findViewById<ImageView>(R.id.imageViewAppIcon)

        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        val bt = findViewById<ImageButton>(R.id.LoginBtn)
        val te = findViewById<TextView>(R.id.textView6)
        val te2 = findViewById<TextView>(R.id.textView5)


        //set anim
        header.startAnimation(ttp)
        bt.startAnimation(stb)
        te.startAnimation(stb)
        te2.startAnimation(stb)


        viewInitializations()
        validateInput()


        val login = findViewById<ImageButton>(R.id.LoginBtn)
        // set on-click listener
        login.setOnClickListener {
            if (validateInput()) {
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }
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