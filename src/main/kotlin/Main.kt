fun getText(): String = "Hello Kotlin"

fun main(args: Array<String>) {
    println(getText())

    println("abc".substring(0 until 1))
    println("abc".substring(3))
}