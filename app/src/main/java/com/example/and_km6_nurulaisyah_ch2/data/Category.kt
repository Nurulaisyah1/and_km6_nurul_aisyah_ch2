package com.example.and_km6_nurulaisyah_ch2.data

import androidx.annotation.DrawableRes
import java.util.UUID

data class Category (

    var id: String = UUID.randomUUID().toString(),

    @DrawableRes
    var img: Int,

    var name: String
)
