package org.ldv.sushiapi.model.id

import jakarta.persistence.Embeddable
import jakarta.persistence.Table
import java.io.Serializable

@Embeddable
@Table(name="aliments_boxes")
class AlimentBoxId(): Serializable {
    val boxId: Long?=null
    val alimentId: Long?=null

}