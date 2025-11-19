package org.junqueira.portfolio.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import org.jetbrains.compose.resources.painterResource
import org.junqueira.portfolio.data.Project
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.js


@Composable
fun ProjectCard(
    project: Project,
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f)),
        shape = MaterialTheme.shapes.medium,
        border = BorderStroke( width = 1.dp, color = Color.Gray.copy(alpha = 0.3f)),
        modifier = modifier
            .widthIn(max = 640.dp)
            .wrapContentHeight()
            .fillMaxWidth()

    ) {
        Image(
            painter = painterResource(project.image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .heightIn(max = 320.dp)
                .clip(RoundedCornerShape(topStart = 12.dp, bottomStart = 0.dp, bottomEnd = 0.dp, topEnd = 12.dp))
                .aspectRatio(2f)

        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()

        ) {
            Text(
                text = project.name,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            )
            Text(
                text = project.description,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            )
            FlowRow(
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                project.tags.forEach { tag ->
                    Text(
                        text = " #${tag} ",
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Button(
                    onClick = project.openGithub,
                    shape = ShapeDefaults.Medium,
                    modifier = modifier
                        .weight(1f)

                ) {
                    Text(
                        text = "View on GitHub",
                    )
                }
                FilledTonalButton(
                    onClick = {},
                    shape = ShapeDefaults.Medium,
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "Demo",
                    )
                }
            }
        }
    }
}