package com.example.composeinstagramhomeclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composeinstagramhomeclone.composables.*
import com.example.composeinstagramhomeclone.ui.theme.ComposeInstagramHomeCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeInstagramHomeCloneTheme {

                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = "Home",
                                        route = "home",
                                        icon = Icons.Default.Home
                                    ),
                                    BottomNavItem(
                                        name = "Search",
                                        route = "search",
                                        icon = Icons.Default.Search

                                    ),
                                    BottomNavItem(
                                        name = "Reels",
                                        route = "reels",
                                        icon = Icons.Default.PlayArrow
                                    ),
                                    BottomNavItem(
                                        name = "Message",
                                        route = "message",
                                        icon = Icons.Default.Email
                                    ),
                                    BottomNavItem(
                                        name = "Profile",
                                        route = "profile",
                                        icon = Icons.Default.Person
                                    ),
                                ),
                                navController =navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(navController = navController)
                    }
                }
            }
        }
    }


@Composable
fun Navigation(navController: NavHostController){

    NavHost(navController = navController, startDestination = "home" ){
        composable("home"){
            homePage()
        }
        composable("search"){
            searchPage()
        }
        composable("reels"){
            reelsPage()
        }
        composable("message"){
            messagesPage()
        }
        composable("profile"){
            profilePage()
        }
    }
}

@Composable
fun BottomNavigationBar(
    items:List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick:(BottomNavItem) -> Unit
){
    val backStackEntry = navController.currentBackStackEntryAsState()

    BottomNavigation(modifier = modifier,backgroundColor = Color.White,
        elevation = 5.dp) {
        items.forEach{ item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = item.route == navController.currentDestination?.route,
                onClick = { onItemClick(item)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Gray,
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                       if(item.badgeCount > 0){
                           BadgedBox(badge = {
                               Text(text = item.badgeCount.toString())
                           }) {
                            Icon(imageVector = item.icon, contentDescription =null )
                           }
                       }else{
                           Icon(imageVector = item.icon, contentDescription =null )
                       }
                        if(selected){
                            Text(text = item.name,
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp)
                        }
                    }
                }

            )
            
        }
    }
}

