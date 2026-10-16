package com.example.directorio.vistas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.R
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.directorio.modelos.Usuario

@Composable
fun UsuariosScreen(usuarios: List<Usuario>) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(usuarios) { usuario ->
            UsuarioCard(usuario = usuario)
        }
    }
}

@Composable
fun UsuarioCard(usuario: Usuario) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            //Icon(
                //painter = painterResource(R.drawable.baseline_person_48),
                //contentDescription = "Icono de perfil"
            //)
            Text(
                text = usuario.nombre,
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = usuario.correo)
        }
    }
}