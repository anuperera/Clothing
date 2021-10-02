package com.app.clothing

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {

    lateinit var etName: EditText
    lateinit var emailEt: EditText
    lateinit var etMobile: EditText
    lateinit var passwordEt: EditText
    lateinit var etRepeatPassword: EditText
    lateinit var etAddress: EditText
    val MIN_PASSWORD_LENGTH = 6;
    val MIN_MOBILE_LENGTH = 9;




    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val stb = AnimationUtils.loadAnimation(this,R.anim.stb)
        val btt = findViewById<ImageButton>(R.id.RegBtn)
        val btw = findViewById<TextView>(R.id.textView)


        btt.startAnimation(stb)
        btw.startAnimation(stb)



        viewInitializations()
        validateInput()

        val register = findViewById<ImageButton>(R.id.RegBtn)
        // set on-click listener
        register.setOnClickListener {
            if (validateInput()) {
                Toast.makeText(this, "Register Success", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginActivity::class.java)
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
            etName = findViewById(R.id.Name)
            emailEt = findViewById(R.id.emailEt2)
            etMobile = findViewById(R.id.Mobile)
            etAddress = findViewById(R.id.Location)
            passwordEt = findViewById(R.id.passwordEt)
            etRepeatPassword = findViewById(R.id.ConfirmEt)
            // To show back button in actionbar



         }

        // Checking if the input in form is valid
        private fun validateInput(): Boolean {
            if (etName.text.toString() == "") {
                etName.error = "Please Enter Name"
                return false
            }
            if (emailEt.text.toString() == "") {
                emailEt.error = "Please Enter Email"
                return false
            }
            if (etMobile.text.toString() == "") {
                etMobile.error = "Please Enter Mobile Number"
                return false
            }

            if (etAddress.text.toString() == "") {
                etAddress.error = "Please Enter the address"
                return false
            }
            if (passwordEt.text.toString() == "") {
                passwordEt.error = "Please Enter a valid password"
                return false
            }

            if (etRepeatPassword.text.toString() == "") {
                etRepeatPassword.error = "password does not match"
                return false
            }

            // checking the proper email format
            if (!isEmailValid(emailEt.text.toString())) {
                emailEt.error = "Please Enter Valid Email"
                return false
            }
            // checking minimum password Length
            if (passwordEt.text.length < MIN_PASSWORD_LENGTH) {
                passwordEt.error =
                    "Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters"
                return false
            }
            // checking minimum mobile number Length
            if (etMobile.text.length <= MIN_MOBILE_LENGTH) {
                etMobile.error =
                    "Not a valid mobile number"
                return false
            }

            // Checking if repeat password is same
            if (passwordEt.text.toString() != etRepeatPassword.text.toString()) {
                etRepeatPassword.error = "Password does not match"
                return false
            }
            return true
        }

         private fun isEmailValid(email: String): Boolean {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }



}

