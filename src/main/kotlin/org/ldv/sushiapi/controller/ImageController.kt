package org.ldv.sushiapi.controller

import org.springframework.core.io.Resource
import org.springframework.core.io.ResourceLoader
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.PageAttributes

@RestController
@RequestMapping(path=["/api/image"])
class ImageController(private val resourceLoader: ResourceLoader) {
    @GetMapping("/{imageName}")
    fun getImage(@PathVariable imageName: String): ResponseEntity<Resource> {
        //Récupération de l'image depuis sa source :
        val resource = resourceLoader.getResource("classpath:static/image/$imageName.png")
        return if(resource.exists()){
            ResponseEntity.ok()
                .contentType(PageAttributes.MediaType.IMAGE.PNG)
                .body(resource)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}