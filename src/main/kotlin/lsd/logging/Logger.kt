package lsd.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.lang.Thread.currentThread

inline fun <reified T> T.log(): Logger = LoggerFactory.getLogger(T::class.java)

fun log(): Logger = LoggerFactory.getLogger(currentThread().stackTrace[2].methodName)