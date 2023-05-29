package com.example.practica3_danp

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Alumno (

    @PrimaryKey val AlmunoId : Int,
    val AlumnoNombre: String

    )

