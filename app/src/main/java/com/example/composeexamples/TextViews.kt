package com.example.composeexamples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun TextViews() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ComposeText()
        ComposeTextField()
        ComposeOutlinedTextField()
    }
}

@Composable
fun ComposeText() {
    Text(
        text = "Text",
        color = colorResource(id = R.color.purple_200)
    )
}

@Composable
fun ComposeTextField() {
    val textValue = remember {
        mutableStateOf("")
    }
    TextField(
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
        label = {})
}
@Composable
fun ComposeOutlinedTextField() {
    val textValue = remember { mutableStateOf("") }
    val primaryColor = colorResource(id = R.color.purple_200)
    OutlinedTextField(
        label = { Text(text = stringResource(id =
        R.string.app_name)) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = primaryColor,
            focusedLabelColor = primaryColor,
            cursorColor = primaryColor
        ),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType
        = KeyboardType.Email),
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
    ) }