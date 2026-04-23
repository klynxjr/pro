package com.onachojr.project.ui.screens.authentication.registration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import com.onachojr.project.R


@Composable
fun RegistrationScreen(modifier: Modifier){
//    inputs
    var FirstName by remember { mutableStateOf(TextFieldValue(""))}
    var SecondName by remember { mutableStateOf(TextFieldValue(""))}
    var PhoneNumber by remember { mutableStateOf(TextFieldValue(""))}
    var Country by remember { mutableStateOf(TextFieldValue(""))}
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ){

        // FirstName
        OutlinedTextField(
            value = FirstName,
            onValueChange = {FirstName =it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = "First Name"
                )
            },
            placeholder = {
                Text(text="eg.Onacho")
            },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )

        // SecondName
        OutlinedTextField(
            value = SecondName,
            onValueChange = {SecondName =it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_password_24),
                    contentDescription = "SecondName"
                )
            },
            placeholder = {
                Text(text="eg.Klynx")
            },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )
        // PhoneNumber
        OutlinedTextField(
            value = PhoneNumber,
            onValueChange = {PhoneNumber =it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_password_24),
                    contentDescription = "PhoneNumber"
                )
            },
            placeholder = {
                Text(text="Enter PhoneNumber")
            },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )
        // Country
        OutlinedTextField(
            value = Country,
            onValueChange = {Country =it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.outline_password_24),
                    contentDescription = "Country"
                )
            },
            placeholder = {
                Text(text="Enter Country")
            },
            maxLines = 1,
            modifier = Modifier.fillMaxWidth()
        )


    }
}




