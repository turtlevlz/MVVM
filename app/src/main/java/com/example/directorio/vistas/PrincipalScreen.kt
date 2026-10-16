package com.example.directorio.vistas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.directorio.viewmodels.UsuarioViewModel

@Composable
fun PrincipalScreen(
    viewModel: UsuarioViewModel,
    modifier: Modifier = Modifier
) {
    var pestana by rememberSaveable { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        PrimaryTabRow(selectedTabIndex = pestana) {
            Tab(
                selected = pestana == 0,
                onClick = { pestana = 0 },
                text = { Text("Todos") }
            )
            Tab(
                selected = pestana == 1,
                onClick = { pestana = 1 },
                text = { Text("Mi Perfil") }
            )
        }
        if (pestana == 0) {
            UsuariosScreen(usuarios = viewModel.usuarios.value)
        } else {
            PerfilScreen(usuario = viewModel.miUsuario)
        }
    }
}