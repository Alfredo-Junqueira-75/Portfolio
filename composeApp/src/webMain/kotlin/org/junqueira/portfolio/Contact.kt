package org.junqueira.portfolio

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import org.jetbrains.compose.resources.painterResource
import org.junqueira.portfolio.utils.isValidEmail
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_github_48
import portfolio.composeapp.generated.resources.icons8_gmail_50
import portfolio.composeapp.generated.resources.icons8_linkedin_48
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.js


@OptIn(ExperimentalWasmJsInterop::class)
@Composable
fun Contact(
    modifier: Modifier
) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

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
                onClick = {
                    if (name.isNotBlank() && email.isNotBlank() && message.isNotBlank() && isValidEmail(email)) {
                        sendEmail(name = name, email = email, message = message)
                        name = ""
                        email = ""
                        message = ""
                    }
                },
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

                onClick = {
                    js("window.open('https://github.com/Alfredo-Junqueira-75/', '_blank')")
                },
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
                onClick = {
                    js("window.open('https://www.linkedin.com/in/alfredoaj/', '_blank')")
                },
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
                onClick = {
                    js("window.location.href = 'mailto:alfredojunqueira75@gmail.com'")
                },
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

@OptIn(ExperimentalWasmJsInterop::class)
fun sendEmail(name: String, email: String, message: String): Unit = js(
    """
    var templateParams = {
      name: name,
      email: email,
      message: message,
      notes: 'Check this out!'
    };

    emailjs.send('service_g66c6cf', 'template_bddrb1t', templateParams).then(
      function(response) {
        console.log('SUCCESS!', response.status, response.text);
      },
      function(error) {
        console.log('FAILED...', error);
      }
    );
    """
)


