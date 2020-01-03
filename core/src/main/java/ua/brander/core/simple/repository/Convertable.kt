package ua.brander.core.simple.repository

interface Convertable<T> {
    companion object {
        fun <T> convert(entities: List<Convertable<T>>): List<T> {
            val result: MutableList<T> = ArrayList()
            for (item in entities) {
                result.add(item.convert())
            }

            return result
        }
    }

    fun convert(): T
}