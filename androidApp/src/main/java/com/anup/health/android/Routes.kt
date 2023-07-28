package com.anup.health.android

sealed class Routes(val route: String){
    object SignUp : Routes("SignUp")
    object ForgotPassword : Routes("ForgotPassword")
    object Login : Routes("Login")
    object GetOTP : Routes("OTP")
    object Registration : Routes("Register")
    object Home : Routes("Home")

}