package alvus.com.coderswag.services

import alvus.com.coderswag.model.Category
import alvus.com.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$16", "hat03"),
        Product("Devslopes Hat Snapback", "$15", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoddie01"),
        Product("Devslopes Hoodie Red", "$32", "hoddie02"),
        Product("Devslopes Hoodie Blue", "$25", "hoddie03"),
        Product("Devslopes Hoodie Green", "$34", "hoddie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "short01"),
        Product("Devslopes Badge Gray", "$20", "short02"),
        Product("Devslopes Logo Shirt Red", "$22", "short03"),
        Product("Devslopes Hustle", "$22", "short04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}