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
public class StackAbsence implements StackInterface, Serializable {
    //List of Absent patients, 
    //update to top 5 patients as processed
    
    private ArrayList<Patient> stack;
    
    private int maxStack = 5;
    
    public StackAbsence() {
        stack = new ArrayList<>();
    }
    
    @Override
    public void push(Patient patq){
        stack.add(0, patq);
    }
    
    @Override
    public String displayStack() { 
        if(isEmpty()) {
            return "no patients in absent list";
        }
        String result = "";
        int entriesToShow = Math.min(stack.size(), maxStack);
        for(int i = 0; i < entriesToShow; i++){
            Patient patient = stack.get(i);
            result += patient.printPatient() +"\n";
        } 
        return result;
    }
    
    @Override
    public Patient pop(){
        return stack.remove(0);
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    @Override
    public int size() {
        return stack.size();
    }

}
