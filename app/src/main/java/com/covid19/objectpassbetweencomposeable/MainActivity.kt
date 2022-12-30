package com.covid19.objectpassbetweencomposeable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.covid19.objectpassbetweencomposeable.nav.SetUpNavGraph
import com.covid19.objectpassbetweencomposeable.ui.theme.ObjectPassBetweenComposeableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           ObjectPassBetweenComposeableTheme {
               val navController = rememberNavController()
               SetUpNavGraph(navController = navController)
           }
        }
    }
}




/*
val navController = rememberNavController()
               NavHost(navController, startDestination = "start" ){
                   composable("start"){
                       Button(onClick = {
                           //navController.popBackStack()
                           navController.navigate("details/5")
                       }) {
                           Text(text = "Show Details")
                       }
                   }
                   composable("details/{id}", arguments = listOf(
                                navArgument("id"){
                                    type = NavType.LongType
                                    nullable = false
                                    defaultValue = -1
                                }
                            )
                       ){ NavBackStackEntry->
                       val id = requireNotNull(NavBackStackEntry.arguments).getLong("id")
                       Text(text = "Details for $id")
                   }
               }
 */