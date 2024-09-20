package neemias.leal.simple_todo_app.android.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HeaderComponent(
    heading: String,
    navController: NavController,
) {
    Surface (
        color = MaterialTheme.colorScheme.background
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Surface(
                color = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primary,
                onClick = {     navController.popBackStack() }
            ) {
                Icon(
                    Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "Return",
                    modifier = Modifier.size(36.dp)
                )
            }
            Text(heading,
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.width(40.dp))
        }
    }

}