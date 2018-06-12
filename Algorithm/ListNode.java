/*
 *
 *
 * ��Ŀ: 
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

����: 
�ϲ�2���Ѿ�������������ҷ���һ���µ���������µ�����Ӧ����ǰ���ᵽ��2������Ľڵ�����ɡ�
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
