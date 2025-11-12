package org.junqueira.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_github_48
import portfolio.composeapp.generated.resources.icons8_gmail_50
import portfolio.composeapp.generated.resources.icons8_linkedin_48


@Composable
fun Contact(
    modifier: Modifier
) {
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var message by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        Text(
            text = "Let's Connect",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
        )
        Text(
            text = "Have a project in mind or just want to say hi? Feel free to reach out.",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray,
            modifier = Modifier
        )
        OutlinedTextField(
            value = name,
            onValueChange = {
                name = it
            },
            label = {Text(text = "Name")},
            shape = ShapeDefaults.Medium,
            singleLine = true,
            modifier = Modifier
                .widthIn(max = 450.dp, min = 320.dp)
                .fillMaxWidth(),
        )
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = {Text(text = "Email")},
            shape = ShapeDefaults.Medium,
            singleLine = true,
            modifier = Modifier
                .widthIn(max = 450.dp, min = 320.dp)
                .fillMaxWidth(),
        )
        OutlinedTextField(
            value = message,
            onValueChange = {
                message = it
            },
            label = {Text(text = "Message")},
            shape = ShapeDefaults.Medium,
            modifier = Modifier
                .widthIn(max = 450.dp, min = 320.dp)
                .heightIn(min = 200.dp)
                .fillMaxWidth(),
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
              .fillMaxWidth()
        ) {
            Button(
                onClick = { },
                shape = ShapeDefaults.Medium,
                modifier = Modifier
                    .widthIn(max = 450.dp, min = 320.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Send Message"
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.icons8_github_48),
                    contentDescription = null,
                )
            }
            IconButton(
                onClick = { },
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.icons8_linkedin_48),
                    contentDescription = null,
                )
            }
            IconButton(
                onClick = { },
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.icons8_gmail_50),
                    contentDescription = null,
                )
            }
        }

    }
}