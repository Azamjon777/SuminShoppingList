package com.azamjon.suminshoplist.domain.model

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)
