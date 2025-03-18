/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Greg
 */
public class Patient {
    // List all patients and details, 
    private String name;
    private String GPname;
    private int age;
    private int priority;
    private int hospitalward;

    public Patient(String name, String GPname, int age, int priority, int hospitalward) {
        this.name = name;
        this.GPname = GPname;
        this.age = age;
        this.priority = priority;
        this.hospitalward = hospitalward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGPname() {
        return GPname;
    }

    public void setGPname(String GPname) {
        this.GPname = GPname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getHospitalward() {
        return hospitalward;
    }

    public void setHospitalward(int hospitalward) {
        this.hospitalward = hospitalward;
    }
    
    public String printPatient(){
        return "patient" + name + "age" + age + "GPname" + GPname+ "priority" + priority+ "hospitalward" +hospitalward;
    }
    
}
