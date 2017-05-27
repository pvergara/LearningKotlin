package org.ecos.learning.kotlin

class StringTemplates {
    fun main(): Pair<String, String> {
        var a = 1
        // simple name in template:
        val s1 = "a is $a"
        a = 2
        // arbitrary expression in template:

        val s2 = "${s1.replace("is", "was")}, but now is $a"

        return Pair(s1,s2)
    }
}