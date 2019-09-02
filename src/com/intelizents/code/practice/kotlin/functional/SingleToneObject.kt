package com.intelizents.code.practice.kotlin.functional

data class Book(val name: String, val price: Int)

object BookShelf {
    val books = arrayListOf<Book>()

    fun showBooks() {
        for (book in books) {
            println(book)
        }
    }
}

fun main() {
    BookShelf.books.add(
        Book(
            "Java",
            50
        )
    )
    BookShelf.books.add(
        Book(
            "Anroid",
            60
        )
    )
    BookShelf.books.add(
        Book(
            "C++",
            40
        )
    )
    BookShelf.books.add(
        Book(
            "Kotlin",
            70
        )
    )

    BookShelf.showBooks()
}