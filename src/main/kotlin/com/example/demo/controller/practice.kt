package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/hello")
class Practice {

    @GetMapping("/{age}")
    fun index(@PathVariable("age") age: Long): String? {
        val result= (age)
        return "resultado $age años"
    }

}//fin de la clase

//tarea de las edades

@GetMapping("/{age}")
fun ageComprobation (@PathVariable age: Long):String {
    //print("Enter the name of heavenly body: ")
    //var name= readLine()!!.toString()
    return when(age) {
        in 0..11 -> ("Es un niño pequeño")
        in 12..17 -> ("Es un adolescente")
        in 18..21 -> ("Es un adulto joven")
        in 22..64 -> ("Ya esta viejo xd")
        else -> ("No se xd :v")
    }
}