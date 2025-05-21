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
        int even = 0;
        int odd =0;

        while(head != null){
            if(head.data%2 != 0){
                odd++;
                head = head.next;
            } else if(head.data % 2 == 0 ){
                even++;
                head = head.next;
            }
        }
        if(odd > even){
            return "odd";
        } else if (even > odd){
            return "even";
        } else{
            return "equal";
        }
    }
 }
