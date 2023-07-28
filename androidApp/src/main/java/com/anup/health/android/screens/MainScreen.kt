package com.anup.health.android.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anup.health.android.Routes

@Composable
fun MainScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.route){
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
        composable(Routes.GetOTP.route) {
            //GetOTP(navController = navController)
            GetOTP(navController = navController, value = "45678", length = 5, onValueChange = { it }, scrName = "" )
        }

        composable(Routes.SignUp.route) {
            SignUp(navController = navController)
        }

        composable(Routes.Registration.route) {
            Registration(navController = navController)
        }
        
        composable(Routes.Home.route) {
            Home(navController = navController)
        }

        composable(Routes.ForgotPassword.route) { navBackStack ->
            ForgotPassword(navController = navController)
        }

    }
}