fun main() {

    bubbleSort(
        intArrayOf(
            3, 6, 2, 8, 4, 7
        )
    ).println()

    
}

// 冒泡排序算法
fun bubbleSort(data: IntArray): IntArray {
    if (data.size <= 1) return data

    repeat(data.size) {
        for (index in data.indices) {
            var flag = false
            if (index < data.size - 1) {
                val current = data[index]
                val next = data[index + 1]
                if (current > next) {
                    data[index] = next
                    data[index + 1] = current
                    flag = true // 发生数据交换
                }
            }
            // 没有数据交换，说明排序已经完成，提前退出
            if (!flag) {
                break
            }
        }
    }

    return data
}