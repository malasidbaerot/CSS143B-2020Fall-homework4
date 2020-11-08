package Problem2;

import java.util.List;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        if(head==null || head.next==null ){
            // if list is too small or doesn't exist
            return null;
        }
        ListNode slow = head;

        ListNode fast = head;


        // 1 2 3 4 5
        while( fast.next!= null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            else{
                fast=fast.next;
            }
        }

        slow.next=null;
        return slow;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode head= new ListNode();
        ListNode current= head;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                current.next=list1;
                list1= list1.next;

            }
            else{
                current.next= list2;
                list2 = list2.next;
            }
            current= current.next;
        }
        if(list1 != null){
            current.next= list1;
        }
        else if(list2 != null){
            current.next= list2;
        }
        return head.next;
    }
}
