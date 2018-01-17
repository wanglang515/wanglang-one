package com.wlang.one.utils

import android.util.Log

/**
 * @Description:
 * @Created by 冠方 on 2018-01-17.
 */
object Wlogger {
    private val head = "Logger"

    fun debug(info: String) {
        printLog("debug", head, info)
    }

    fun error(info: String) {
        printLog("error", head, info)
    }

    private fun printLog(type: String, head: String, info: String) {
        val stack = Thread.currentThread().stackTrace
        info.plus(" (" + stack[4].className + "." + stack[4].methodName + "()_"
                + stack[4].fileName + "@" + stack[4].lineNumber + "_" + Thread.currentThread() + ")")
        when (type) {
            "error" -> Log.e(head, info)
            else -> Log.d(head, info)
        }
    }
}