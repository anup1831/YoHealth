package com.anup.health.android.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.anup.health.android.R
import com.anup.health.android.Routes

@SuppressLint("SuspiciousIndentation")
@Composable
fun SignUp(navController: NavHostController) {

    val context = LocalContext.current
    var phoneNumber = remember { mutableStateOf(TextFieldValue()) }
    var phoneNumberErrorState = remember { mutableStateOf(false) }
    val maxChar = 10
    val password = remember { mutableStateOf(TextFieldValue()) }
    var showBranding by remember { mutableStateOf(true) }

    Box(modifier = Modifier.fillMaxSize()) {
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        Spacer(
            modifier = Modifier
                .weight(1f, fill = showBranding)
                .animateContentSize()
        )

        AnimatedVisibility(
            showBranding,
            Modifier.fillMaxWidth()
        ) {
            Branding()
        }
        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //val username = remember { mutableStateOf(TextFieldValue()) }


            Text(
                text = stringResource(id = R.string.signup_message), style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Monospace
                )
            )
            Spacer(modifier = Modifier.height(20.dp))

            //Username password field
            //Number field
            Column(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    placeholder = { Text(text = stringResource(id = R.string.mobile_number)) },
                    value = phoneNumber.value,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    onValueChange = {

                        if (phoneNumberErrorState.value) {
                            phoneNumberErrorState.value = false
                        } else if (it.text.length <= maxChar)
                            phoneNumber.value = it

                    },
                    isError = phoneNumberErrorState.value,
                    modifier = Modifier.fillMaxWidth()

                )
                Text(text = "${phoneNumber.value.text.length} / $maxChar",
                    textAlign = TextAlign.End,
                    style = MaterialTheme.typography.caption,
                    modifier = Modifier.fillMaxSize().padding(end = 16.dp))

            }
            if (phoneNumberErrorState.value) {
                Text(text = stringResource(id = R.string.required), color = Color.Red)
            }
            Spacer(modifier = Modifier.height(20.dp))

            //Login button
            Box(modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 0.dp)) {
                Button(
                    shape = RoundedCornerShape(50.dp),
                    onClick = {
                        when {
                            phoneNumber.value.text.isEmpty() -> {
                                phoneNumberErrorState.value= true
                            }
                            else -> {

                                phoneNumberErrorState.value = false
                                Toast.makeText(
                                    context,
                                    phoneNumber.value.text,
                                    Toast.LENGTH_SHORT
                                ).show()
                                navController.navigate(Routes.GetOTP.route)
                            }
                        }
                    },
                    content = {
                        Text(text = stringResource(id = R.string.get_OTP), color = Color.White,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
                )
            }
        }

    }

}

/*

fun Branding() {
    Column(modifier = Modifier.wrapContentHeight(align = Alignment.CenterVertically)) {
        logo(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Text(
            text = stringResource(id = R.string.app_tagline),
            style = MaterialTheme.typography.subtitle2,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 24.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun logo(
    modifier: Modifier = Modifier,
    lightTheme: Boolean = LocalContentColor.current.luminance() < 0.5f,
) {


    val assetId = if (lightTheme) {
        R.drawable.ic_logo
    } else {
        R.drawable.ic_logo
    }
    Image(
        painter = painterResource(id = assetId),
        modifier = modifier.padding(top = 24.dp),
        contentDescription = null
    )
}*/
