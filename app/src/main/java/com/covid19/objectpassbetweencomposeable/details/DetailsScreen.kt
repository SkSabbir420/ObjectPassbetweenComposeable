package com.covid19.objectpassbetweencomposeable.details

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.covid19.objectpassbetweencomposeable.objet.Person
import com.covid19.objectpassbetweencomposeable.shareviewmodel.SharedViewModel

@Composable
fun DetailsScreen(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
){
    val person = sharedViewModel.person
    LaunchedEffect(key1 = person){
        if (person != null){
            Log.d("DetailsScreen",person.firstName)
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Details Screen")

    }
}