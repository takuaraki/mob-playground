fun anagramw(input: String): Set<String> {
    if(input.length == 1){
        return setOf(input)
    }
    val set = mutableSetOf<String>()
    input.forEachIndexed { index, char ->
        val newInput = input.substring(0 until index) + input.substring(index + 1)
        val newSet = anagramw(newInput)
        set += newSet.map { s -> char + s }
    }
    return set
}

fun anagram(input: String): Set<String> {
    val set = mutableSetOf<String>()
    sub(set, "", input)
    return set
}

fun sub(set: MutableSet<String>, result: String, tail: String) {
    if (tail.isEmpty()) {
        set.add(result)
    } else {
        tail.forEachIndexed { index, char ->
            val newResult = result + char
            val newTail = tail.substring(0 until index) + tail.substring(index + 1)
            sub(set, newResult, newTail)
        }
    }
}


fun saiki(input: Int): Int {
    return if (input <= 1) 1 else input * saiki(input - 1)
}