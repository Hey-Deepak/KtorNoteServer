package com.androiddevs.data.collections

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

data class User (
    val emailId: String,
    val password: String,
    @BsonId
    val id: String = ObjectId().toString()
)