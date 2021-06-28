package com.hyecheon.tobyspring.user.dao

/**
 * User: hyecheon lee
 * Email: rainbow880616@gmail.com
 * Date: 2021/06/29
 */
class DaoFactory {
    fun userDao(): UserDao {
        val connectionMaker = DConnectionMaker()
        return UserDao(connectionMaker)
    }
}