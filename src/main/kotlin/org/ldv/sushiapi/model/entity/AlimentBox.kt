package org.ldv.sushiapi.model.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.*
import org.ldv.sushiapi.model.id.AlimentBoxId

@Entity
@Table(name="aliments_boxes")
class AlimentBox(){
    @EmbeddedId
    val alimentBoxId: AlimentBoxId?=null

    @ManyToOne
    @MapsId("boxId") //On indique l'attribut correspondant sur AlimentBoxId
    @JoinColumn(name="fk_box_id")
    //@JsonBackReference
    val box: Box?=null

    @ManyToOne
    @MapsId("alimentId") //On indique l'attribut correspondant sur alimentBoxId
    @JoinColumn(name="fk_aliment_id")
    //@JsonBackReference
    val aliment: Aliment?=null

    val quantite: Int=0

}