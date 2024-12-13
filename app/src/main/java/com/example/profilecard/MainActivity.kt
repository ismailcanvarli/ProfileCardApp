package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardTheme {
                ProfileCardScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCardScreen(darkTheme: Boolean = isSystemInDarkTheme()) {
    ProfileCardTheme(darkTheme = darkTheme) {
        Scaffold(topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(R.string.profile_card)) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        }) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
            ) {
                ProfileImageAndName()
                ProfileDetailsRow(
                    label = stringResource(R.string.name),
                    value = stringResource(R.string.name_detail)
                )
                ProfileDetailsRow(
                    label = stringResource(R.string.ability),
                    value = stringResource(R.string.ability_detail)
                )
                ProfileDetailsRow(
                    label = stringResource(R.string.team),
                    value = stringResource(R.string.team_detail)
                )
                ProfileDetailsRow(
                    label = stringResource(R.string.power),
                    value = stringResource(R.string.power_detail)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { }, colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    ) {
                        Text(text = stringResource(R.string.previous))
                    }
                    Button(
                        onClick = { }, colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    ) {
                        Text(text = stringResource(R.string.next))
                    }
                }
            }
        }
    }
}

@Composable
fun ProfileImageAndName() {
    Column(
        modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.hero_profile_photo),
            contentDescription = stringResource(R.string.profile_picture),
            modifier = Modifier
                .padding(start = 8.dp, top = 8.dp, end = 8.dp)
                .size(250.dp)
        )
        Text(
            text = stringResource(R.string.iron_man),
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun ProfileDetailsRow(label: String, value: String) {
    Row {
        Text(
            text = label,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier
                .padding(16.dp)
                .weight(1f)
        )
        Text(
            text = value,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .padding(16.dp)
                .weight(2f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardScreenPreview() {
    ProfileCardTheme {
        ProfileCardScreen()
    }
}