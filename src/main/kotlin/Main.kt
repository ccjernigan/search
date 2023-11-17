import cloud.unum.usearch.Index

fun main(args: Array<String>) {
    println("Hello World!")
    
    val index = Index.Config().metric("cos").dimensions(2).build()
}