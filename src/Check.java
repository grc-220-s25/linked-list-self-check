
public class Check {
    /**
     * Given the head of a linked list, return whether there are more even or 
     * odd values in the nodes.
     * 
     * If there are more even nodes, return "even"
     * If there are more odd nodes, return "odd"
     * If there are an equal of even and odd nodes, return "equal"
     * If head is null, return "equal"
     * 
     * @param head the head of the list
     * @return "even", "odd", or "equal" depending on whether there are more even or odd values
     */
    public static String evenOdd(ListNode head) {
        if (head == null) {
            return "equal";
        }
        
        ListNode curr = head;
        int even = 0;
        int odd = 0;
        String equal = "equal";
        while (curr != null) {
            if (curr.data % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            curr = curr.next;
        }
    
        if (even > odd) {
            return "even";
        } else if (even < odd) {
            return "odd";
        } else {
            return "equal";
        }
    }
}