package com.example.practica3_danp

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class Cursos_Alumnos (

    @Embedded val curso: Curso,
    @Relation(
        parentColumn = "CursoId",
        entityColumn = "AlumnoId",
        associateBy = Junction(AlumnoCursoCrossRef::class)
    )
    val alumnos: List<Alumno>
        )