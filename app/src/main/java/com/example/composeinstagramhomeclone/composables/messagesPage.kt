package com.example.composeinstagramhomeclone.composables

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeinstagramhomeclone.R

@Composable
fun messagesPage(){

    val search = remember{ mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Column() {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)) {
                Icon(painter = painterResource(id = R.drawable.lock), contentDescription ="Lock", modifier = Modifier.padding(start = 5.dp) )
                Text(text = "Steve_Jobs", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.video_call), contentDescription = null)
                Icon(painter = painterResource(id = R.drawable._add_24), contentDescription = null, modifier = Modifier.padding(end = 5.dp))
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.search), contentDescription ="search icon" )
                    }
                },
                value = search.value, onValueChange = {search.value = it},
                placeholder = { Text(text = "Search ")},
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            )
        }
        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(70.dp))
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(70.dp) )
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))
        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Messages", color = Color.Black, modifier = Modifier.padding(start = 10.dp))
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Requests", color = Color.Blue, modifier = Modifier.padding(end = 10.dp))
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))

        Column() {
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Mark", fontWeight = FontWeight.Bold)
                    Text(text = "Sent 3h Ago")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }
            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Elon", fontWeight = FontWeight.Bold)
                    Text(text = "Active yesterday")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }

            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Jeff", fontWeight = FontWeight.Bold)
                    Text(text = "Shared a link")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }

            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Allan", fontWeight = FontWeight.Bold)
                    Text(text = "Active 37m ago")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }


            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Gibs", fontWeight = FontWeight.Bold)
                    Text(text = "Active now")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }

            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Frank", fontWeight = FontWeight.Bold)
                    Text(text = "seen")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }


            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Tracy", fontWeight = FontWeight.Bold)
                    Text(text = "Active 4h Ago")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }


            Spacer(modifier = Modifier.padding(5.dp))
            Row(Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.padding(start = 10.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .size(64.dp))
                Spacer(modifier = Modifier.padding(3.dp))
                Column(modifier = Modifier.padding(top = 10.dp)) {
                    Text(text = "Kenneth", fontWeight = FontWeight.Bold)
                    Text(text = "Active Yesterday")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.photo_camera), contentDescription =null, modifier = Modifier
                    .padding(top = 15.dp, end = 10.dp)
                    .size(40.dp))
            }

        }
    }
}