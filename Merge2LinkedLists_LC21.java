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

 class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode restail = null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        while(ptr1!=null && ptr2!=null){
            int val = 0;
            if(ptr1.val >= ptr2.val) {
                val = ptr2.val;
                ptr2 = ptr2.next;
            }
            else{
                val = ptr1.val;
                ptr1 = ptr1.next;
            }
            ListNode newnode = new ListNode(val);
            if(res==null){
                res = newnode;
                restail = newnode;
            } 
            else {
                restail.next = newnode;
                restail = newnode;
            }
        }
        while(ptr1!=null){
            ListNode newnode = new ListNode(ptr1.val);
            if(restail!=null)
            restail.next = newnode;
            restail = newnode;
            ptr1 = ptr1.next;
        }
        while(ptr2!=null){
            ListNode newnode = new ListNode(ptr2.val);
            if(restail!=null)
            restail.next = newnode;
            restail = newnode;
            ptr2 = ptr2.next;
        }
        return res;
    }
}