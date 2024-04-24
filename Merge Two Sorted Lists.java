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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null)
            return null;
        ListNode rlist = null;
        ListNode ilist = null;
        while(list1 != null || list2 != null){
            ListNode mlist = null;
            if(list2 == null || (list1 != null && list1.val < list2.val)){
                mlist = list1;
                list1 = list1.next;
            }
            else{
                mlist = list2;
                list2 = list2.next;
            }
             if (ilist == null) {
                ilist = mlist;
            } else {
                rlist.next = mlist;
            }
            rlist = mlist;
            rlist.next = null;
        }
        return ilist;
    }
}