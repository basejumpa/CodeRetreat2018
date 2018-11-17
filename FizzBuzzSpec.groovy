#!/usr/bin/env groovy

@Grab(group='org.spockframework', module='spock-core', version='1.2-groovy-2.5')
@Grab(group='com.athaydes', module='spock-reports', version='1.6.1', transitive=false)
@Grab(group='org.slf4j', module='slf4j-api', version='1.7.13')
@Grab(group='org.slf4j', module='slf4j-simple', version='1.7.13')
@GrabConfig(systemClassLoader = true)
import spock.lang.*


class FizzBuzzSpec extends Specification {

    void 'return fizz with 3'() {
        given:
        FizzBuzz fb = new FizzBuzz()
        String res = fb.check(3)

        expect:
        res == 'fizz'
    }

    void 'return buzz with 5'() {
        given:
        FizzBuzz fb = new FizzBuzz()
        String res = fb.check(5)

        expect:
        res == 'buzz'
    }

    void 'return fizzbuzz with 15'() {
        given:
        FizzBuzz fb = new FizzBuzz()
        String res = fb.check(15)

        expect:
        res == 'fizzbuzz'
    }

    void 'return number with 23'() {
        given:
        FizzBuzz fb = new FizzBuzz()
        Integer res = fb.check(23)

        expect:
        res == 23
    }

    @Unroll
    void 'return fizz with multiple of 3'() {
        given:
        FizzBuzz fb = new FizzBuzz()

        when:
        String res = fb.check(num)

        then:
        res == 'fizz'

        where:
        num | _
          3 | _
          6 | _
          9 | _
         12 | _
        //Data tables must have at least two columns.
        //A single-column table can be written as above.

    }

    @Unroll
    void 'return proper [expResult=#expResult] for [num=#num]'() {
        given: "A FizzBuzz game"
        FizzBuzz fb = new FizzBuzz()

        when:
        def res = fb.check(num)

        then: "that everything works"
        res == expResult

        where: "I have the following data"
        num | expResult
          1 | 1
          2 | 2
          3 | 'fizz'
          4 | 4
          5 | 'buzz'
          6 | 'fizz'
          7 | 7
          8 | 8
          9 | 'fizz'
         10 | 'buzz'
         11 | 11
         12 | 'fizz'
         13 | 13
         14 | 14
         15 | 'fizzbuzz'
    }

    @Unroll
    void 'return proper [expResult=#expResult] for [num=#num] from 1 to 15'() {
        given: "A FizzBuzz game"
        FizzBuzz fb = new FizzBuzz()

        when:
        def res = fb.check(num)

        then: "that everything works"
        res == expResult

        where: "I have the following data"
        num << (1..15)
        expResult << [1, 2, 'fizz', 4, 'buzz', 'fizz', 7, 8, 'fizz', 'buzz', 11, 'fizz', 13, 14, 'fizzbuzz']

    }

}
