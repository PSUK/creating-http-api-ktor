package com.jetbrains.handson.httpapi.model

import kotlinx.serialization.Serializable
val customerStorage = mutableListOf<Customer.Customer>()
class Customer {


    @Serializable
    data class  Customer(val id: String, val firstName: String, val lastName: String, val email: String)
}