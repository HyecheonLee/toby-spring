package com.hyecheon.tobyspring.user.dao

import java.sql.Connection
import kotlin.jvm.Throws

/**
 * User: hyecheon lee
 * Email: rainbow880616@gmail.com
 * Date: 2021/06/28
 */
interface ConnectionMaker {
    fun makeConnection(): Connection
}