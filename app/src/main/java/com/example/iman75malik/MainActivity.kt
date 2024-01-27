package com.example.iman75malik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iman75malik.ui.theme.Iman75malikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Iman75malikTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    IMBusinessCard()
                }
            }
        }
    }
}

@Composable
fun Bismillah() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 49.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            text = stringResource(R.string.bismillah),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun AnnajiahTherapy() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.annajiah_logo_color)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(120.dp, 180.dp)
        )
        Text(
            text = stringResource(R.string.nur_imansyah_abunnajiah),
            fontSize = 23.sp,
            modifier = Modifier.padding(
                top = 21.dp,
                bottom = 7.dp
            ),
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = stringResource(R.string.certified_therapist),
            fontSize = 17.sp,
            fontStyle = FontStyle.Italic
        )
    }
}

@Composable
fun IMContact() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 49.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val image = painterResource(R.drawable.cp)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(14.dp)
            )
            Text(
                text = stringResource(R.string.cp),
                fontSize = 14.sp,
                modifier = Modifier.padding(3.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val image = painterResource(R.drawable.ig)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(21.dp)
            )
            Text(
                text = stringResource(R.string.ig),
                fontSize = 14.sp,
                modifier = Modifier.padding(3.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val image = painterResource(R.drawable.email)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(14.dp)
            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 14.sp,
                modifier = Modifier.padding(3.dp)
            )
        }
    }
}

@Preview(
    showBackground = true,
    )
@Composable
fun IMBusinessCard() {
    Iman75malikTheme {
        Bismillah()
        AnnajiahTherapy()
        IMContact()
    }
}