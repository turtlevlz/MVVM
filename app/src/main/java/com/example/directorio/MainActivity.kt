package com.example.directorio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.directorio.modelos.UsuarioRepositorio
import com.example.directorio.ui.theme.DirectorioTheme
import com.example.directorio.viewmodels.UsuarioViewModel
import com.example.directorio.viewmodels.UsuarioViewModelFactory
import com.example.directorio.vistas.PrincipalScreen

class MainActivity : ComponentActivity() {
    private val viewModel: UsuarioViewModel by viewModels {
        UsuarioViewModelFactory(UsuarioRepositorio())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DirectorioTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PrincipalScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

