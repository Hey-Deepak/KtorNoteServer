package com.androiddevs.data.collections

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import java.util.*

data class User (
    val name: String,
    val password: String,
    @BsonId
    val id: String =  ObjectId().toString()
)