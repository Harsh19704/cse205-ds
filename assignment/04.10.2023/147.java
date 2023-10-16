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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
        return head;

        ListNode temp = head;

        while(temp != null){
            ListNode next = temp.next;
            ListNode begin = head;
            ListNode previous = head;

            while(begin != next){
                if(begin.val > temp.val){
                    temp.next = begin;
                    if(begin == head){
                        head = temp;
                    }
                    else{
                        previous.next = temp;
                    }
                    while(begin.next != temp){
                        begin = begin.next;
                        }
                   begin.next = next; 
                }
                previous = begin;
                begin = begin.next;
            }
            temp = next; 
        }
        return head;
    }
}