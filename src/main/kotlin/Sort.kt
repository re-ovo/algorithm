fun main() {
    intArrayOf(
        3, 6, 2, 8, 4, 7
    ).bubbleSort().println()
}

// 冒泡排序算法
fun IntArray.bubbleSort() {
    if (this.size <= 1) return
    repeat(this.size) {
        for (index in this.indices) {
            var flag = false
            if (index < this.size - 1) {
                val current = this[index]
                val next = this[index + 1]
                if (current > next) {
                    this[index] = next
                    this[index + 1] = current
                    flag = true // 发生数据交换
                }
            }
            // 没有数据交换，说明排序已经完成，提前退出
            if (!flag) {
                break
            }
        }
    }
}