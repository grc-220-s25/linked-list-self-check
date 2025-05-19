import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckTest {

    @Test
    public void testNullList() {
        ListNode head = null;
        assertEquals("equal", Check.evenOdd(head));
    }

    @Test
    public void testSingleNodeEven() {
        ListNode head = new ListNode(8);
        assertEquals("even", Check.evenOdd(head));
    }

    @Test
    public void testSingleNodeOdd() {
        ListNode head = new ListNode(9);
        assertEquals("odd", Check.evenOdd(head));
    }

    @Test
    public void testMoreEvenThanOddMultipleDifference() {
        ListNode node6 = new ListNode(10);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(22, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode head  = new ListNode(7, node2);
        assertEquals("even", Check.evenOdd(head));
    }

    @Test
    public void testMoreEvenThanOddDifferByOne() {
        ListNode node3 = new ListNode(8);
        ListNode node2 = new ListNode(3, node3);
        ListNode head  = new ListNode(6, node2);
        assertEquals("even", Check.evenOdd(head));
    }

    @Test
    public void testMoreOddThanEven() {
        ListNode node5 = new ListNode(7);
        ListNode node4 = new ListNode(8, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head  = new ListNode(5, node2);
        assertEquals("odd", Check.evenOdd(head));
    }

    @Test
    public void testMoreOddThanEvenMultiple() {
        ListNode node5 = new ListNode(7);
        ListNode node4 = new ListNode(9, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head  = new ListNode(2, node2);
        assertEquals("odd", Check.evenOdd(head));
    }

    @Test
    public void testZeroEvens() {
        ListNode node3 = new ListNode(7);
        ListNode node2 = new ListNode(5, node3);
        ListNode head  = new ListNode(3, node2);
        assertEquals("odd", Check.evenOdd(head));
    }

    @Test
    public void testZeroOdds() {
        ListNode node3 = new ListNode(6);
        ListNode node2 = new ListNode(4, node3);
        ListNode head  = new ListNode(2, node2);
        assertEquals("even", Check.evenOdd(head));
    }

    @Test
    public void testEqualEvenOdd() {
        ListNode node4 = new ListNode(15);
        ListNode node3 = new ListNode(12, node4);
        ListNode node2 = new ListNode(9, node3);
        ListNode head  = new ListNode(6, node2);
        assertEquals("equal", Check.evenOdd(head));
    }

}
