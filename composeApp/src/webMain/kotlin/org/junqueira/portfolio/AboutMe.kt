package org.junqueira.portfolio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.serialization.StringFormat
import org.jetbrains.compose.resources.stringResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.about_me


@Composable
fun AboutMe(
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f)),
        shape = ShapeDefaults.Medium,
        border = BorderStroke(1.dp, Color.Gray.copy(alpha = 0.4f)),

        modifier = modifier
            .widthIn(max = 1096.dp)
            .wrapContentHeight()
    ) {
        Text(
            text = "About Me",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp, top = 32.dp, start = 32.dp, end = 32.dp)
        )
        Text(
            text = stringResource(Res.string.about_me),
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Left,
            color = Color.Gray,
            modifier = Modifier
                .padding(top = 16.dp, start = 32.dp, end = 32.dp, bottom = 32.dp)

        )
    }
}