fun main() {
    intArrayOf(
        3, 6, 2, 8, 4, 7
    ).bubbleSort().println()

    intArrayOf(
        3, 6, 2, 8, 4, 7
    ).insertSort().println()
}

// 冒泡排序算法
fun IntArray.bubbleSort(): IntArray {
    if (this.size <= 1) return this
    repeat(this.size) {
        var flag = false
        for (index in this.indices) {
            if (index < this.size - 1) {
                val current = this[index]
                val next = this[index + 1]
                if (current > next) {
                    this[index] = next
                    this[index + 1] = current
                    flag = true // 发生数据交换
                }
            }
        }
        // 没有数据交换，说明排序已经完成，提前退出
        if (!flag) {
            return@repeat
        }
    }
    return this
}

// 插入排序
fun IntArray.insertSort(): IntArray {
    for (i in this.indices) {
        // 跳过首个元素
        if (i == 0) {
            continue
        }

        // 获取当前元素
        val num = this[i]

        // 遍历已排序的部分
        for (p in 0 until i) {
            // 找到插入点
            if (num < this[p]) {
                // 现将元素后移
                for (q in i downTo p + 1) {
                    this[q] = this[q - 1]
                }

                // 插入元素
                this[p] = num
                break
            }
        }
    }

    return this
}