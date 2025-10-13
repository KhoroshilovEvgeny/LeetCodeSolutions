/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int zn1, zn2, desyatok = 0, digit;
        String result = "";
        while (temp1 != null || temp2 != null) {
            if (temp1 != null) {
                zn1 = temp1.val;
            } else {
                zn1 = 0;
            }

            if (temp2 != null) {
                zn2 = temp2.val;
            } else {
                zn2 = 0;
            }

            digit = zn1 + zn2 + desyatok;
            result = (digit % 10) + result;
            desyatok = digit / 10;

            if (temp1 != null) {
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                temp2 = temp2.next;
            }

        }

        if (desyatok == 1) {
            result = desyatok + result;
        }

        ListNode temp3 = new ListNode(((int) (result.charAt(0)) - 48));
        for (int i = 1; i < result.length(); i++) {
            temp3 = new ListNode(((int) (result.charAt(i)) - 48), temp3);

        }

        return temp3;
    }
}
