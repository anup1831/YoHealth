package com.anup.health.android.component


import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CustomTopAppbar(navController: NavHostController, title: String, showBackIcon: Boolean){
    TopAppBar(
        title = { Text(text = title, style = TextStyle(
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.White
        )
        )
        },
        navigationIcon = if(showBackIcon && navController.previousBackStackEntry != null) {
            {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
            }
        } else {
            null
        }, backgroundColor = Color.DarkGray
    )
}