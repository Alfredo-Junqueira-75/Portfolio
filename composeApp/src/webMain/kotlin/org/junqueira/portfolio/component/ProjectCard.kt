package org.junqueira.portfolio.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import org.jetbrains.compose.resources.painterResource
import org.junqueira.portfolio.data.Project


@Composable
fun ProjectCard(
    project: Project,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f), shape = ShapeDefaults.Medium)
            ,

    ) {
        Image(
            painter = painterResource(project.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .heightIn(max = 360.dp)
                .weight(1f)
                .clip(RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp, bottomEnd = 0.dp, topEnd = 0.dp))

        )
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .weight(1f)

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
            LazyRow(
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                itemsIndexed(project.tags) { _, tag ->
                    Text(
                        text = " #${tag} ",
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
            ) {
                Button(
                    onClick = {},
                    shape = ShapeDefaults.Medium,
                    modifier = Modifier

                ) {
                    Text(
                        text = "View on GitHub",
                    )
                }
                VerticalDivider(
                    thickness = 8.dp,
                )
                FilledTonalButton(
                    onClick = {},
                    shape = ShapeDefaults.Medium,
                ) {
                    Text(
                        text = "Demo",
                    )
                }
            }
        }
    }
}