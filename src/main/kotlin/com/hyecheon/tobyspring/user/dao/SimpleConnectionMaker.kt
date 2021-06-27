package com.hyecheon.tobyspring.user.dao

import java.sql.DriverManager

/**
 * User: hyecheon lee
 * Email: rainbow880616@gmail.com
 * Date: 2021/06/28
 */
class SimpleConnectionMaker {
    fun makeNewConnection() = run {
        Class.forName("org.mariadb.jdbc.Driver")
        DriverManager.getConnection("jdbc:mariadb://localhost:3306/toby", "root", "hclee")
    }
}