package org.junqueira.portfolio

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.skia.ColorChannel
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.icons8_dev_96
import portfolio.composeapp.generated.resources.icons8_world_24

@Composable
fun TopBar (
    modifier: Modifier = Modifier,

) {
    Column (
        modifier = modifier,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .background(color = MaterialTheme.colorScheme.background.copy(alpha = 0.9f))
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)


        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
            ) {
                Image(
                    painter = painterResource(Res.drawable.icons8_dev_96),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp),
                )
                Text(
                    "Alfredo Junqueira",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 16.dp),
                    )
            }
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                TextButton(
                    onClick = { },
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = "Projects",
                        fontSize = 14.sp,
                    )
                }
                TextButton(
                    onClick = { },
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = "Skills",
                        fontSize = 14.sp,
                    )
                }
                TextButton(
                    onClick = {},
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = "About",
                        fontSize = 14.sp,
                    )
                }
                TextButton(
                    onClick = { },
                    modifier = Modifier.padding(horizontal = 8.dp),
                ) {
                    Text(
                        text = "Contact",
                        fontSize = 14.sp,
                    )
                }
                OutlinedButton(
                    onClick = { },
                    shape = ShapeDefaults.Medium,
                    modifier = Modifier
                        .padding(start = 8.dp, top = 8.dp, end = 4.dp, bottom = 8.dp)

                ) {
                    Icon(
                        painter = painterResource(Res.drawable.icons8_world_24),
                        contentDescription = null,
                        Modifier.size(18.dp)
                            .padding(end = 4.dp),
                    )
                    Text(
                        text = "en",
                        fontSize = 14.sp,
                    )
                }
                Button(
                    onClick = { },
                    shape = ShapeDefaults.Medium,
                    modifier = Modifier
                        .padding(start = 4.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)
                ) {
                    Text(
                        text = "Get in Touch",
                    )
                }
            }
        }
        HorizontalDivider(
            color = Color.Gray,
            thickness = 2.dp,
        )

    }
}