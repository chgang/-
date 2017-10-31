package LinkedListReverse;

public class Demo01 {
	private class ListNode{
		int data;
		ListNode next;
		public ListNode(int data){
			this.data=data;
		}
		public ListNode(){
			
		}
	}
	public static ListNode reverse(ListNode head){
		if(head==null){
			return null;
		}
		ListNode cur=head;
		ListNode newHead=null;
		ListNode oldHead=null;
		while(cur!=null){
			oldHead=cur.next;
			cur.next=newHead;
			newHead=cur;
			cur=oldHead;
		}
		return newHead;
	}
	public static void main(String[] args) {
		Demo01 d = new Demo01();
		Demo01.ListNode node1=d.new ListNode(1);
		Demo01.ListNode node2=d.new ListNode(2);
		Demo01.ListNode node3=d.new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		System.out.println(node1.data+" "+node1.next.data+" "+node1.next.next.data);
		Demo01.ListNode node=reverse(node1);
		System.out.println(node.data+" "+node.next.data+" "+node.next.next.data);
	}
	
}
