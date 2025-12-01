package org.ldv.sushiapi.model.entity

import jakarta.persistence.*

@Entity
@Table(name="saveurs")
class Saveur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val saveurId: Long,

    val nom: String,

    //La relation many to many est gérée par la classe Box sur l'attribut saveurs
    @ManyToMany(mappedBy = "saveurs")
    val boxes: MutableSet<Box>
) {
}