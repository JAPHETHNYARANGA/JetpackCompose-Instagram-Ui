package com.example.composeinstagramhomeclone.Navbar

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.composeinstagramhomeclone.R

sealed class NavItem(
    val route:String,
    val title:String,
    val icon:ImageVector
){
    object Home: NavItem(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Search: NavItem(
        route = "search",
        title = "Search",
        icon = Icons.Default.Search
    )

    object Reels: NavItem(
        route = "reels",
        title = "Reels",
        icon = Icons.Default.Search
    )

    object Messenger: NavItem(
        route = "messenger",
        title = "Messenger",
        icon = Icons.Default.Search
    )

    object Profile: NavItem(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Search
    )
}
