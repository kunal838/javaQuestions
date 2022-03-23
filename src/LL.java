public class LL {

   Node head;

   static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}


//add start
    public void add_start(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    
//add last  
    public void add_Last(int data){
        Node new_node = new Node(data) ;
       

        Node temp  = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new_node;

    }

    //del start
    public void del_start(){
        Node temp = head;
        temp = temp.next;
        head = temp;
    }


    //del end
    public void del_end(){
        
        Node check = head;
        if(check!=null){
            while(check.next.next != null){
                check = check.next;
            }
            check.next = null;
        }
        else{
            System.out.println("underflow");
        }
      


    }

        //print ll
       public void PrintLL(){
          if(head == null){
              System.out.println("list is empty");
              return;
          }
           Node temp = head;
           while(temp!= null){
               System.out.print(temp.data+ "-->");
               temp = temp.next;
           }
           System.out.print("null");
           System.out.println(" ");
       }

      /*  public void reverseLL(){

        if(head == null || head.next ==null){
            return;
        }
           Node prevnode = head;
           Node currnode = prevnode.next;
           while(currnode!=null){
               Node nextnode = currnode.next;
               currnode.next = prevnode;

               //update the node
               prevnode = currnode;
               currnode = nextnode;
               

           }

           head.next=null;
           head = prevnode;

       } */

       public void reverseLL(){
           Node prevnode = head;
           Node currnode = prevnode.next;
           while(currnode!=null){
               Node nextnode = currnode.next;
               currnode.next=prevnode;
               
               
               prevnode=currnode;
               currnode=nextnode;
           }

           head.next=null;
           head=prevnode;

       }

       public static void main(String[] args) {
           LL l = new LL();
           l.add_start(9);
           l.add_Last(10);
           l.add_Last(7);
           l.add_Last(6);
           l.PrintLL();
           l.reverseLL();
           l.PrintLL();
       }



   }

    


   





