package org.ecos.learning.kotlin.test

import org.ecos.learning.kotlin.StringTemplates
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test


class StringTemplatesTests{
    @Test fun test(){
        val templates = StringTemplates()
        val (a,b) = templates.main()

        assertThat(a, `is`(equalTo("a is 1")))
        assertThat(b, `is`(equalTo("a was 1, but now is 2")))
    }

}
