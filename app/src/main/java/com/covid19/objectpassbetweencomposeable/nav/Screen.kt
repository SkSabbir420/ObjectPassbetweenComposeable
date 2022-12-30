package com.covid19.objectpassbetweencomposeable.nav

sealed class Screen(val route:String){
    object Home: Screen("home")
    object Details: Screen("details")
}
