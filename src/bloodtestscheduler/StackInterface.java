/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Greg
 */
public interface StackInterface {
    //implement stack fucntion needed, pop, push, size, peek, displaystack
    public Object pop();
    public boolean isEmpty();
    public void push(Patient patq);
    public int size();
    public String displayStack();
}
