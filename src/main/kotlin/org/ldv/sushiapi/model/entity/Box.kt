package org.ldv.sushiapi.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name="boxes")
 class Box (){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var boxId: Long?=null

    var nom: String=""
    var nbPieces: Int=0
    var prix: Double=0.0
    var nomImage: String=""

    //Relation many to many des boxes aux saveurs :
    @ManyToMany
    @JoinTable(
        name = "saveurs_boxes",
        joinColumns = [JoinColumn(name="fk_box_id")],
        inverseJoinColumns = [JoinColumn(name = "fk_saveur_id")]
    )
    val saveurs: MutableSet<Saveur> =mutableSetOf()

    //Relation one to many d'une box à ses aliments
    @OneToMany(mappedBy = "box")
    val alimentBoxes: MutableList<AlimentBox> = mutableListOf()
}