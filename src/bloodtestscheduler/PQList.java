/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Greg
 */
public class PQList implements PQInterface, Serializable {
    // *maybe age related sorting*
    //Sort first, then push to stack or process
    private ArrayList<Patient> Pqueue;
    
    
    public PQList(){
        Pqueue = new ArrayList<>();
    }
    
    public void PrioritySort(){
    for (int i = 0; i < Pqueue.size() - 1; i++) {
       for (int j = i + 1; j< Pqueue.size(); j++) {//bubble sort technique learnt from class
           if (Pqueue.get(i).getPriority() > Pqueue.get(j).getPriority()) {// swaps patients if they are in the wrong order
               Patient pat =Pqueue.get(i);
                Pqueue.set(i, Pqueue.get(j));
                Pqueue.set(j, pat);
                }
            }
        }
    }
    
    public void enqueue(Patient pat){ 
       if(Pqueue.isEmpty()){
           Pqueue.add(pat);
       }else{
            Pqueue.add(pat);
            PrioritySort();
       }
       
      
    }
    
    public boolean isEmpty(){
        return Pqueue.isEmpty();
    }
    
    public int size(){
        return Pqueue.size();
    }
    
    public Patient dequeue(){
        if (Pqueue.isEmpty()) {
           return null;  
        }
         return Pqueue.remove(0); 
    }
    
    public String print(){
        String result = "";
        if (Pqueue.isEmpty()){
            return ("Priority Queue");
        }else{
            for(int i = 0; i < Pqueue.size(); i++){
                Patient patient = Pqueue.get(i);
                result += patient.printPatient() + "\n";
            } 
        }
        return result;           
    }

}
