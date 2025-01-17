package com.androiddevs.data

import com.androiddevs.data.collections.Note
import com.androiddevs.data.collections.User
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

private val client = KMongo.createClient().coroutine
private val database = client.getDatabase("NotesDatabase")
private val users = database.getCollection<User>()
private val notes = database.getCollection<Note>()

suspend fun registerUser(user: User) : Boolean {
    return users.insertOne(user).wasAcknowledged()

}