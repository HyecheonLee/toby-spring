package com.hyecheon.tobyspring.user.dao

/**
 * User: hyecheon lee
 * Email: rainbow880616@gmail.com
 * Date: 2021/06/29
 */
class DaoFactory {
    fun userDao(): UserDao {
        return UserDao(connectionMaker())
    }

    fun accountDao(): AccountDao {
        return AccountDao(connectionMaker())
    }

    fun messageDao(): MessageDao {
        return MessageDao(connectionMaker())
    }

    fun connectionMaker(): ConnectionMaker {
        return DConnectionMaker()
    }
}