/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queque;
/**
 *
 * @author ASUS
 */
public class Queque {
    int queue[]=new int[3];
    
    public void push(int value){
        if(queue[0]==0){
            queue[0]=value;
            System.out.println("PUSH"+queue[0]);
        }else if(queue[1]==0){
            queue[1]=value;
            System.out.println("PUSH"+queue[1]);
        }else if(queue[2]==0){
            queue[2]=value;
            System.out.println("PUSH"+queue[2]);
        }else{
            isFull();
        }
    }        
    public void isFull(){
        System.out.println("QUEUE IS FULL");
    }
    public void pop (){
        if(queue[0]!=0){
            System.out.println("POP"+queue[0]);
            queue[0]=0;
        }else if (queue[1]!=0){
            System.out.println("POP"+queue[1]);
            queue[1]=1;
        }else if (queue[2]!=0){
            System.out.println("POP"+queue[2]);
            queue[2]=2;
        }else{
            isEmpty();
        }
    }
    public void isEmpty(){
        System.out.println("QUEUENID EMPTY");
    }
    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("QUEUE is clear");
    }
    public void cetak(){
        System.out.println("--------PRINT---------");
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=0){
                System.out.println(queue[i]+"");
            }
    }
    System.out.println("--------------------------");
}    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queque s=new Queque();
        s.push(5);
        s.push(7);
        s.push(4);
        s.push(9);
        s.cetak();
        s.pop();
        s.cetak();
        s.clear();
    }  
}
