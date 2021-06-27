package com.hyecheon.tobyspring.user.dao

import com.hyecheon.tobyspring.user.domain.User
import java.sql.DriverManager

/**
 * User: hyecheon lee
 * Email: rainbow880616@gmail.com
 * Date: 2021/06/28
 */
class UserDao {
    fun add(user: User) = run {
        Class.forName("org.mariadb.jdbc.Driver")
        DriverManager.getConnection("jdbc:mariadb://localhost:3306/toby", "root", "hclee").use { c ->
            c.prepareStatement("insert into users(id, name, password) values (?,?,?)").use { ps ->
                ps.setString(1, user.id)
                ps.setString(2, user.name)
                ps.setString(3, user.password)

                ps.executeUpdate()
            }
        }
    }

    fun get(id: String) = run {
        Class.forName("org.mariadb.jdbc.Driver")
        DriverManager.getConnection("jdbc:mariadb://localhost:3306/toby", "root", "hclee").use { c ->
            c.prepareStatement("select * from users where id=?").use { ps ->
                ps.setString(1, id)
                ps.executeQuery().use { rs ->
                    rs.next()
                    val user = User(rs.getString("id"), rs.getString("name"), rs.getString("password"))
                    rs.close()
                    ps.close()
                    c.close()
                    user
                }
            }
        }
    }
}