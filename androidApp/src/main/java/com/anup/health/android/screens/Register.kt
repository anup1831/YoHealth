package com.anup.health.android.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.anup.health.android.R
import com.anup.health.android.Routes
import com.anup.health.android.component.CustomTopAppbar

@Composable
fun  Registration(navController: NavHostController){
    Box( modifier = Modifier.fillMaxSize()) {
        ScaffoldWithTopBar(navController)
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldWithTopBar(navController: NavHostController) {
    val context = LocalContext.current
    val name = remember { mutableStateOf(TextFieldValue()) }
    val nameErrorState = remember { mutableStateOf(false) }
    val age = remember { mutableStateOf(TextFieldValue()) }
    val ageErrorState = remember { mutableStateOf(false) }
    val height = remember { mutableStateOf(TextFieldValue()) }
    val heightErrorState = remember { mutableStateOf(false) }
    val weight = remember { mutableStateOf(TextFieldValue()) }
    val weightErrorState = remember { mutableStateOf(false) }
    val phoneNumber = remember { mutableStateOf(TextFieldValue()) }
    val phoneErrorState = remember { mutableStateOf(false) }
    val location = remember { mutableStateOf(TextFieldValue()) }
    val locationErrorState = remember { mutableStateOf(false) }
    val knownMedicalCondition = remember { mutableStateOf(TextFieldValue()) }
    val medicalConditionErrorState = remember { mutableStateOf(false) }
    val knownLanguage = remember { mutableStateOf(TextFieldValue()) }
    val languageErrorState = remember { mutableStateOf(false) }
    val foodAllergie = remember { mutableStateOf(TextFieldValue()) }
    val foodAllergieErrorState = remember { mutableStateOf(false) }
    val socialHabits = remember { mutableStateOf(TextFieldValue()) }
    val socialHabitsErrorState = remember { mutableStateOf(false) }
    val physicalHabits = remember { mutableStateOf(TextFieldValue()) }
    val physicalHabitErrorState = remember { mutableStateOf(false) }
    val bedTime = remember { mutableStateOf(TextFieldValue()) }
    val bedTimeErrorState = remember { mutableStateOf(false) }
    val wakeTime = remember { mutableStateOf(TextFieldValue()) }
    val wakeTimeErrorState = remember { mutableStateOf(false) }
    val sleepDuration = remember { mutableStateOf(TextFieldValue()) }
    val waterIntake = remember { mutableStateOf(TextFieldValue()) }
    val waterIntakeErrorState = remember { mutableStateOf(false) }
    val foodPreferences = remember { mutableStateOf(TextFieldValue()) }
    val foodPrefErrorState = remember { mutableStateOf(false) }
    val dyfunctionalState = remember { mutableStateOf(TextFieldValue()) }
    val scrollState = rememberScrollState()


    Scaffold(
        topBar = {
                CustomTopAppbar(navController = navController, title = stringResource(id = R.string.txt_sign_up), showBackIcon = true)
        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(5.dp)
                    .verticalScroll(scrollState)
            ) {
                Spacer(Modifier.size(16.dp))
                OutlinedTextField(
                    value = name.value,
                    onValueChange = {
                        if (nameErrorState.value) {
                            nameErrorState.value = false
                        }
                        name.value = it
                    },

                    modifier = Modifier.fillMaxWidth().align(Alignment.Start),
                    isError = nameErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_name)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (nameErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = age.value,
                    onValueChange = {
                        if (ageErrorState.value) {
                            ageErrorState.value = false
                        }
                        age.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = ageErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_age)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (ageErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))


                OutlinedTextField(
                    value = height.value,
                    onValueChange = {
                        if (heightErrorState.value) {
                            heightErrorState.value = false
                        }
                        height.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = heightErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_height)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (heightErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = weight.value,
                    onValueChange = {
                        if (weightErrorState.value) {
                            weightErrorState.value = false
                        }
                        weight.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = weightErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_weight)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (weightErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = phoneNumber.value,
                    onValueChange = {
                        if (phoneErrorState.value) {
                            phoneErrorState.value = false
                        }
                        weight.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = phoneErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_phone)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (phoneErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = location.value,
                    onValueChange = {
                        if (locationErrorState.value) {
                            locationErrorState.value = false
                        }
                        location.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = locationErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_location)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (locationErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = knownMedicalCondition.value,
                    onValueChange = {
                        if (medicalConditionErrorState.value) {
                            medicalConditionErrorState.value = false
                        }
                        knownMedicalCondition.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = medicalConditionErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_known_medical)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (medicalConditionErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = knownLanguage.value,
                    onValueChange = {
                        if (languageErrorState.value) {
                            languageErrorState.value = false
                        }
                        knownLanguage.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = languageErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_known_language)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (languageErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = foodAllergie.value,
                    onValueChange = {
                        if (foodAllergieErrorState.value) {
                            foodAllergieErrorState.value = false
                        }
                        foodAllergie.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = foodAllergieErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_food_allerigies)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (foodAllergieErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = socialHabits.value,
                    onValueChange = {
                        if (socialHabitsErrorState.value) {
                            socialHabitsErrorState.value = false
                        }
                        socialHabits.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = socialHabitsErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_social_habits)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (socialHabitsErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = physicalHabits.value,
                    onValueChange = {
                        if (physicalHabitErrorState.value) {
                            physicalHabitErrorState.value = false
                        }
                        physicalHabits.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = physicalHabitErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_physical_habits)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (physicalHabitErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = bedTime.value,
                    onValueChange = {
                        if (bedTimeErrorState.value) {
                            bedTimeErrorState.value = false
                        }
                        bedTime.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = bedTimeErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_bed_time)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (bedTimeErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = wakeTime.value,
                    onValueChange = {
                        if (wakeTimeErrorState.value) {
                            wakeTimeErrorState.value = false
                        }
                        wakeTime.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = wakeTimeErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_wake_time)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (wakeTimeErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = sleepDuration.value,
                    onValueChange = {
                        /*if (weightErrorState.value) {
                            weightErrorState.value = false
                        }*/
                        weight.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    //isError = weightErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_sleep_duration)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                //if (weightErrorState.value) {
                //    Text(text = stringResource(id = R.string.required), color = Color.Red)
                //}
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = waterIntake.value,
                    onValueChange = {
                        if (waterIntakeErrorState.value) {
                            waterIntakeErrorState.value = false
                        }
                        waterIntake.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = waterIntakeErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_water_intake)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (waterIntakeErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))

                OutlinedTextField(
                    value = foodPreferences.value,
                    onValueChange = {
                        if (foodAllergieErrorState.value) {
                            foodAllergieErrorState.value = false
                        }
                        foodPreferences.value = it
                    },

                    modifier = Modifier.fillMaxWidth(),
                    isError = foodAllergieErrorState.value,
                    label = {
                        Text(text = stringResource(id = R.string.lbl_food_pref)+ stringResource(id = R.string.asterisk_mark))
                    },
                )
                if (foodPrefErrorState.value) {
                    Text(text = stringResource(id = R.string.required), color = Color.Red)
                }
                Spacer(Modifier.size(16.dp))



                //Add register button here
                Button(
                    shape = RoundedCornerShape(50.dp),
                    onClick = {
                        when {
                            name.value.text.isEmpty() -> {
                                nameErrorState.value = true
                            }
                            age.value.text.isEmpty() -> {
                                ageErrorState.value = true
                            }
                            else -> {
                                ageErrorState.value = false
                                nameErrorState.value = false
                                Toast.makeText(
                                    context,
                                    "Logged in successfully",
                                    Toast.LENGTH_SHORT
                                ).show()
                                navController.navigate(Routes.Home.route) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                        }

                    },
                    content = {
                        Text(text = stringResource(id = R.string.txt_sign_up), color = Color.White,
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
                Spacer(Modifier.size(16.dp))

            }
        })

}
