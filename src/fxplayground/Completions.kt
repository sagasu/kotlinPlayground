package fxplayground

import java.util.*
import kotlin.test.assertEquals

data class NGram(val words: String, val freq: Int = -1) : Comparable<NGram> {
    override fun compareTo(other: NGram): Int {
        val x = words.compareTo(other.words)
        if(x != 0 || freq == -1)
            return x
        else
            return freq.compareTo(other.freq)
    }

}

class Test {
    val ngrams = TreeSet(setOf(
        NGram("whatever"),
        NGram("a very common thing",3),
        NGram("a very common phrase",2),
        NGram("a very good call",1),
        NGram("welcome to the",0),
        NGram("welcome to my",0)
    ))

    @Test
    fun pairs(){
        assertEquals(listOf("he", "el", "ll", "lo"), "hello".pairwise())
    }
}
