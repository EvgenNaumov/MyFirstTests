package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_BigSubDomain_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("name@qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq.com"))
    }

    @Test
    fun emailValidator_NormalSubDomain_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq.com"))
    }

    @Test
    fun emailValidator_InUserNotHaveSimbolNotLat_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("васdfg@name.com"))
    }

    @Test
    fun emailValidator_InUserNotHaveSimbolSpec_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("/fg@name.com"))
    }

    @Test
    fun emailValidator_InSubdomainNotHaveSimbolSpec_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("dfg@name/.com"))
    }

    @Test
    fun myTestValidator_IsObjectDataEquals_ReturnsFalse(){

        val o1 = objectData()
        o1.pol = 45

        val o2 = objectData()
        o2.pol = 45

        var o4 = objectData()

        o1 to o4

        assertEquals(o1.pol,o2.pol)
    }

    @Test
    fun myTestValidator_IsObjectEquals_ReturnTrue(){
        assertEquals("qwe","qwe")
    }


}
