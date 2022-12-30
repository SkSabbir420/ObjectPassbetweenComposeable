package com.covid19.objectpassbetweencomposeable.nav

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.covid19.objectpassbetweencomposeable.details.DetailsScreen
import com.covid19.objectpassbetweencomposeable.home.HomeScreen
import com.covid19.objectpassbetweencomposeable.shareviewmodel.SharedViewModel

@Composable
fun SetUpNavGraph(navController: NavHostController){

    val sharedViewModel:SharedViewModel = viewModel()

    NavHost(navController =  navController, startDestination = Screen.Home.route ){
        composable(route = Screen.Home.route){
            HomeScreen(navController,sharedViewModel)
        }
        composable(route = Screen.Details.route){
            DetailsScreen(navController,sharedViewModel)
        }

    }

}