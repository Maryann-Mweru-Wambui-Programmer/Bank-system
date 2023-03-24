import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BankTest {

    @Before
    fun setUp(){

    }

    @Test
    fun customerDetails() {

    }

    @Test
    fun testCustomerTransactionsReturnsXYZWhenInputIsYes() {
        val bank1 = Bank()
        assertEquals("yes", bank1.customerTransactions())
    }

    @Test
    fun testCustomerTransactionsReturnsABCWhenInputIsNo() {
        val bank1 = Bank()
        assertEquals("no", bank1.customerTransactions())
    }

    @Test
    fun testCustomerTransactionsFailsWhenInputIsInvalid() {
        val bank1 = Bank()
        assertEquals("sjgdjksdgfjf", bank1.customerTransactions())
    }
}