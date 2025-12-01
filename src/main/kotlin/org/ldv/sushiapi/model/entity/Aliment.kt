package org.ldv.sushiapi.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.*

@Entity
@Table(name="aliments")
class Aliment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val alimentId: Long,

    val nom: String,

    //aliment est l'attribut d'AlimentBox
    @OneToMany(mappedBy = "aliment")
    val alimentBoxes: MutableList<AlimentBox>
){
}