import java.util.*;
class Node{
    int data;
    Node next;
}
class CSLL{
    Node head,newNode,temp,tail;
    void insertion(int num){
        Node  newNode = new Node();
        newNode.data = num;
        newNode.next = null;
        if(head == null){
            head = temp = newNode;
        }else{
            temp.next = newNode;
            temp=newNode;
            newNode.next = head;
            tail = temp;
        }
    }
    void insertion_at_starting(int A){
        Node newNode = new Node();
        newNode.data = A;
        newNode.next = head;
        head = newNode;
        temp.next = head;
    }
    void insertionAtMiddle(int B,int pos){
        Node newNode = new Node();
        newNode.data = B;
        newNode.next = null;
        temp = head;
        for(int i = 1; i < pos; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void insertionAtEnding(int C){
        Node newNode = new Node();
        newNode.next = null;
        newNode.data = C;
        tail.next = newNode;
        newNode.next = head;
        tail=newNode;
        
    }
    
    void display(){
        temp = head;
        while(temp.next!= head){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CSLL csll =new CSLL();
        int size = sc.nextInt();
        for(int i = 1; i <= size; i++){
            int num = sc.nextInt();
            csll.insertion(num);
        }
        csll.display();
        csll.insertion_at_starting(5);
        csll.insertionAtMiddle(5,3);
        csll.insertionAtEnding(5);
        System.out.println();
        csll.display();
    }
}