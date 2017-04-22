package be3

import spock.lang.Specification
import spock.lang.Unroll

class Be3UtilTest extends Specification {

    @Unroll
    def "lowerCase(#str) == #expected"() {
        expect:
        Be3Util.lowerCase(str) == expected

        where:
        str   || expected
        null  || null
        ""    || ""
        "abc" || "abc"
        "aBc" || "abc"
    }

    @Unroll
    def "upperCase(#str == #expected)"() {
        expect:
        Be3Util.upperCase(str) == expected

        where:
        str   || expected
        null  || null
        ""    || ""
        "ABC" || "ABC"
        "aBc" || "ABC"
    }

}
