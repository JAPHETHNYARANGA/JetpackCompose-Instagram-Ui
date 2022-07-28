package com.example.composeinstagramhomeclone.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.composeinstagramhomeclone.R


@Composable
fun searchPage(){

    val search = remember{ mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
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
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(11.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null, modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .height(200.dp))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null,modifier = Modifier
                        .fillMaxWidth(0.3f)
                        .height(200.dp) )
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null,modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .height(200.dp))
                }
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(200.dp))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(200.dp))
                }

            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(200.dp))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(200.dp))
                }

            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .height(300.dp))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Image(painter = painterResource(id = R.drawable.person), contentDescription =null ,modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .height(400.dp))
                }

            }
        }
    }
}