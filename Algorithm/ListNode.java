/*
 *
 *
 * 题目: 
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

翻译: 
合并2个已经排序的链表，并且返回一个新的链表。这个新的链表应该由前面提到的2个链表的节点所组成。
 *
 */
 
package Test;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){val = x;} 
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode currentNode=head;
        while(true){
            if(l1==null&&l2==null){
                break;
            }else if(l2!=null&&(l1==null||l1.val>l2.val)){
                currentNode.next=l2;
                l2=l2.next;
            }else{
                currentNode.next=l1;
                l1=l1.next;
            }
            currentNode=currentNode.next;
        }
        return head.next;
    }
	

	
}
