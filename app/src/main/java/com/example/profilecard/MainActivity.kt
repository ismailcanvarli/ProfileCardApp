package com.example.profilecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.profilecard.ui.theme.ProfileCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCardTheme {
                ProfileCardScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCardScreen() {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "Profile Card") },

            )
    }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.padding(16.dp)
                )

                Text(
                    text = "John Doe", modifier = Modifier.padding(16.dp)
                )
            }

            Column {
                Row {
                    Text(
                        text = "Email", modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "asd", modifier = Modifier.padding(16.dp)
                    )
                }
                Row {
                    Text(
                        text = "Linkedln", modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "asd", modifier = Modifier.padding(16.dp)
                    )
                }
                Row {
                    Text(
                        text = "Github", modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "asd", modifier = Modifier.padding(16.dp)
                    )
                }
                Row {
                    Text(
                        text = "Web Site", modifier = Modifier.padding(16.dp)
                    )
                    Text(
                        text = "asd", modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardScreenPreview() {
    ProfileCardTheme {
        ProfileCardScreen()
    }
}