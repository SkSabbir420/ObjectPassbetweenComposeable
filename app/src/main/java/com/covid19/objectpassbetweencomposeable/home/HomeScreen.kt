package com.covid19.objectpassbetweencomposeable.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.covid19.objectpassbetweencomposeable.nav.Screen
import com.covid19.objectpassbetweencomposeable.objet.Person
import com.covid19.objectpassbetweencomposeable.shareviewmodel.SharedViewModel

@Composable
fun HomeScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Home Screen")
        Button(onClick = {
            val person = Person("Md Sabir", "Hosen")
            sharedViewModel.addPerson(person)
            navController.navigate(Screen.Details.route)
        }) {
            Text(text = "Goto Details")

        }

    }
}