package com.example.composeinstagramhomeclone.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composeinstagramhomeclone.R


@Composable
fun homePage(){
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Text(text = "Instagram", fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(top = 10.dp, start = 5.dp))
                Spacer(Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.addbox), contentDescription ="Adding post icon",modifier = Modifier
                    .size(40.dp)
                    .padding(top = 10.dp))
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription ="Like Icon", modifier = Modifier
                    .size(40.dp)
                    .padding(top = 10.dp))
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
                .horizontalScroll(
                    rememberScrollState()
                )) {
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story1", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Column() {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                        .clip(CircleShape)
                        .size(64.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "Your story", fontStyle = FontStyle.Normal, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Divider(color = Color.Gray, thickness = 1.dp)
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Suggested for you", fontSize = 15.sp, modifier = Modifier.padding(start = 10.dp))
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See all", color = Color.Blue, fontSize = 10.sp,modifier = Modifier.padding(end = 10.dp))
            }
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(10.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(80.dp))
                        Text(text = "Steve jobs", fontSize = 10.sp)
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow", fontWeight = FontWeight.Bold)
                        }
                    }
                    
                }
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(10.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(80.dp))
                        Text(text = "Steve jobs", fontSize = 10.sp)
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow", fontWeight = FontWeight.Bold)
                        }
                    }

                }
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(10.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(80.dp))
                        Text(text = "Steve jobs", fontSize = 10.sp)
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow", fontWeight = FontWeight.Bold)
                        }
                    }

                }
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(10.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(80.dp))
                        Text(text = "Steve jobs", fontSize = 10.sp)
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow", fontWeight = FontWeight.Bold)
                        }
                    }

                }
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(10.dp)) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                            .clip(
                                CircleShape
                            )
                            .size(80.dp))
                        Text(text = "Steve jobs", fontSize = 10.sp)
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Follow", fontWeight = FontWeight.Bold)
                        }
                    }

                }
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }
        Spacer(modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription ="person image" , contentScale = ContentScale.Crop, modifier = Modifier
                    .clip(CircleShape)
                    .size(44.dp))
                Column(modifier = Modifier.padding(top = 5.dp)) {
                    Text(text = "Japheth Nyaranga", fontWeight = FontWeight.Bold)
                    Text(text = "Kiambu")
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.more), contentDescription = "click to show more", modifier = Modifier.padding(top = 10.dp))
            }
            Row(modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.likeicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.comment), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Icon(painter = painterResource(id = R.drawable.sendicon), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(start = 5.dp) )
                Spacer(modifier = Modifier.weight(1f))
                Icon(painter = painterResource(id = R.drawable.save), contentDescription =null, modifier = Modifier
                    .size(30.dp)
                    .padding(end = 5.dp) )
            }

        }


    }
}