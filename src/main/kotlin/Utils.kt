
// 实现一些常用的工具函数
fun Any.println() = println(this)
fun IntArray.println() = println(this.joinToString(separator = ", "))
