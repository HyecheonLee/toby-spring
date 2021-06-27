package com.hyecheon.tobyspring.user.dao

import java.sql.Connection
import java.sql.DriverManager

class DUserDao : UserDao() {
    override fun getConnection(): Connection {
        Class.forName("org.mariadb.jdbc.Driver")
        return DriverManager.getConnection("jdbc:mariadb://localhost:3306/toby", "root", "hclee")
    }
}