package com.gym.trening
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gym.trening.ui.theme.TreningTheme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TreningTheme {
                AppNavHost()
            }
        }
    }
}

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(Unit) {
        delay(2000) // Задержка перед переходом на главный экран
        navController.navigate("mainScreen") // Переход на главный экран
    }

    // Экран загрузки с картинкой
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_background), // Загружаем картинку
            contentDescription = "Loading...",
            modifier = Modifier.fillMaxSize() // Размер картинки (можно настроить)
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}


@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    // Настроим навигацию
    NavHost(navController = navController, startDestination = "splashScreen") {
        composable("splashScreen") {
            SplashScreen(navController = navController) // Экран загрузки
        }
        composable("mainScreen") {
            MainScreen() // Основной экран
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TreningTheme {
        AppNavHost()
    }
}
