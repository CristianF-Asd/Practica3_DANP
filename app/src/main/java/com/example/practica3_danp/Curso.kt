package com.example.practica3_danp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Curso (
    @PrimaryKey
    val CursoId : Int,
    val CursoNombre: String
        )


