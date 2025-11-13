package org.junqueira.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.profile_foto

@Composable
fun Profile(
    lazylistState: LazyListState,
    coroutineScope: CoroutineScope,
    modifier: Modifier = Modifier,
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 32.dp)
                .weight(2f)

        ) {
            Text(
                text = "Alfredo Junqueira, Junior Android Developer",
                maxLines = 2,
                style = MaterialTheme.typography.displayLarge,
                fontWeight = FontWeight.Bold,

            )
            Text(
                text = "Building clean and user-friendly Android apps with a focus on great experience.",
                minLines = 2,
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Gray,
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            Button(
                onClick = { scrollToTheSection(1, coroutineScope, lazylistState) },
                shape = ShapeDefaults.Medium,
                modifier = Modifier
                    .padding(top = 16.dp)
            ) {
                Text(
                    text = "View My Work",
                )
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .wrapContentSize()
                .padding(start = 8.dp)
                .weight(2f)
        ) {
            Image(
                painter = painterResource(Res.drawable.profile_foto),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(480.dp)
                    .clip(CircleShape)
            )
        }
    }
}