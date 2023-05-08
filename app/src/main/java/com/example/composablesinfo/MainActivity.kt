package com.example.composablesinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composablesinfo.ui.theme.ComposablesInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposablesInfoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposablesInfoApp()
                }
            }
        }
    }
}

@Composable
fun ComposablesInfoApp() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Row(
            Modifier.weight(0.5F)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_composable_content),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(0.5F)
            )
            ComposableInfoCard(
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.image_composable_content),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(0.5F)
            )
        }
        Row(
            Modifier.weight(0.5F)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_composable_content),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(0.5F)
            )
            ComposableInfoCard(
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_composable_content),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(0.5F)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color = backgroundColor)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = title,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            color = Color.Black,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposablesInfoAppPreview() {
    ComposablesInfoTheme {
        ComposablesInfoApp()
    }
}