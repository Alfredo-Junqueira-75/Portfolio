package org.junqueira.portfolio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.junqueira.portfolio.component.ProjectCard
import org.junqueira.portfolio.data.projectsList
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_github_48
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.js

private val projects = projectsList
@OptIn(ExperimentalWasmJsInterop::class)
@Composable
fun Projects(
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth(),
    ){
        Text(
            text = "Projects",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
        )
        FlowRow(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            itemVerticalAlignment = Alignment.Top,
            maxItemsInEachRow = 2,
            modifier = modifier
                .fillMaxSize()
        ) {
            projectsList.forEach { project ->
                ProjectCard(project, )
            }

        }
        OutlinedButton(
            onClick = {
                js("window.open('https://github.com/Alfredo-Junqueira-75?tab=repositories', '_blank')")
            },
            shape = MaterialTheme.shapes.medium,
            border = BorderStroke(width = 1.dp, color = Color.Gray.copy(alpha = 0.3f)),
            colors = ButtonDefaults.outlinedButtonColors(containerColor = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f)),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Icon(
                    painter = painterResource(Res.drawable.icons8_github_48),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                )
                Text(
                    text = "See more"
                )
            }
        }
    }
}