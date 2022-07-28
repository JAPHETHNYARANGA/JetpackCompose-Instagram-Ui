package com.example.composeinstagramhomeclone.composables

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
fun profilePage(){
    Column(modifier = Modifier.fillMaxSize()) {
        Column() {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)) {
                Icon(painter = painterResource(id = R.drawable.lock), contentDescription ="Lock", modifier = Modifier.padding(start = 5.dp) )
                Text(text = "Steve_Jobs", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.addbox), contentDescription = null)
                Icon(painter = painterResource(id = R.drawable.more), contentDescription = null, modifier = Modifier.padding(end = 5.dp))
            }
        }
        Spacer(modifier = Modifier.padding(5.dp))



        Column(Modifier.verticalScroll(rememberScrollState())) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null, contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(
                            CircleShape
                        )
                        .size(80.dp) )
                    Text(text = "Steve jobs", fontWeight = FontWeight.Bold)
                }

                    Column() {
                        Text(text = "62", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "Posts")
                    }
                    Column() {
                        Text(text = "359", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "Followers")
                    }
                    Column() {
                        Text(text = "805", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        Text(text = "Following")
                    }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
                    modifier = Modifier
                        .fillMaxWidth(0.8f)) {
                    Text(text = "Edit Profile", modifier = Modifier.padding(end = 5.dp, top=5.dp))
                }
                Icon(painter = painterResource(id = R.drawable._person_add), contentDescription = null, modifier = Modifier
                    .padding(top = 10.dp))
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Story highlights", fontWeight = FontWeight.Bold, fontSize = 15.sp, modifier = Modifier.padding(start = 15.dp))
            }
            Spacer(modifier = Modifier.padding(5.dp))

        }
        Column() {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Icon(painter = painterResource(id = R.drawable.grid), contentDescription = null , modifier = Modifier
                    .width(30.dp)
                    .height(30.dp))
                Icon(painter = painterResource(id = R.drawable.reels), contentDescription = null, modifier = Modifier
                    .width(30.dp)
                    .height(30.dp))
                Icon(painter = painterResource(id = R.drawable.play_arrow), contentDescription = null , modifier = Modifier
                    .width(30.dp)
                    .height(30.dp))
                Icon(painter = painterResource(id = R.drawable.contact_calendar), contentDescription = null , modifier = Modifier
                    .width(30.dp)
                    .height(30.dp))
            }
        }
        Spacer(modifier = Modifier.padding(3.dp))
        Divider(color = Color.Gray, thickness = 1.dp)
        
        Column(modifier = Modifier.verticalScroll(rememberScrollState()) ){
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .height(90.dp)
                    .width(90.dp))
            }
        }

    }

}