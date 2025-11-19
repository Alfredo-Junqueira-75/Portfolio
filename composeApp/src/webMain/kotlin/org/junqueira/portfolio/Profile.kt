package org.junqueira.portfolio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
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
    FlowRow (
        horizontalArrangement = Arrangement.Center,
        verticalArrangement = Arrangement.Center,
        itemVerticalAlignment = Alignment.CenterVertically,
        modifier = modifier
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .weight(2f)
                .widthIn(max = 280.dp)
                .fillMaxSize(0.4f)
                .aspectRatio(1f)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(Res.drawable.profile_foto),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .padding(16.dp)
                .weight(2f)

        ) {
            Text(
                text = "Hi there, my name is Alfredo Junqueira, Android Developer",
                style = MaterialTheme.typography.displayLarge,
                fontWeight = FontWeight.Bold,

            )
            Text(
                text = "I build clean and user friendly Android apps, always with a focus on great experience.",
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
    }
}