/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Greg
 */
public interface PQInterface {
    //Sort Patients depending on urgency, i.e Urgent, medium, low
    public void enqueue(Patient pat); // add to queue
    public Patient dequeue(); // remove from queue
    public int size(); // size of queue
    public String print(); // print patients in queue
    public boolean isEmpty();
}
