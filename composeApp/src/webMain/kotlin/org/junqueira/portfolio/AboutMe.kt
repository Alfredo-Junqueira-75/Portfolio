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



@Composable
fun AboutMe(
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.inversePrimary.copy(alpha = 0.1f)),
        shape = ShapeDefaults.Medium,
        border = BorderStroke(1.dp, Color.Gray.copy(alpha = 0.4f)),

        modifier = modifier
            .widthIn(1096.dp)
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
            text = "Lorem ipsum dolor sit amet. Et iste voluptas est autem tenetur ut voluptatem voluptates est nostrum dolores. Cum provident eveniet qui porro sint aut quos dignissimos aut esse architecto qui dolorum commodi ut corrupti exercitationem. Quo unde omnis id nostrum culpa aut dolor illo quo facilis tempora est numquam quas. Id explicabo dicta et dicta quia et corrupti quae qui minus unde sit suscipit possimus sit voluptatem nobis.\n" +
                    "\n" +
                    "Ad assumenda consequuntur ut doloremque neque sit quibusdam consequatur. Ut voluptatem ipsam sed quia dolorum in doloremque voluptatem. Ab saepe laudantium eos rerum sunt et tempora error qui quod dignissimos. Quo tempora similique eos voluptatem sequi ut incidunt voluptates sit pariatur possimus.\n" +
                    "\n" +
                    "Ut neque necessitatibus in fugiat enim sit ipsa consequatur. Et tempore consequatur quo alias voluptate a quia maxime. Sed rerum doloremque sit accusantium delectus vel iusto vitae id earum enim. A quia asperiores id harum totam non voluptates commodi aut iure consequuntur est galisum error.",
            textAlign = TextAlign.Left,
            color = Color.Gray,
            modifier = Modifier
                .padding(top = 16.dp, start = 32.dp, end = 32.dp, bottom = 32.dp)

        )
    }
}