package org.gfg.springCore;

public class Client {
    public static void main(String[] args) {
        Address address  = new Address();
        address.setCity("gurugram");
        address.setsNo(1);
        Student student = new Student();
        student.setAddress(address);
        student.setName("kajal");
    }
}
// student class was dependent upon address adress?
// by creating object of address and passing it in student object : i resolved the dependency ?
// on line no 6: i injected the dependency ?
// who is the owner ? -> developer?
//  when depency injection is done by spring : Inversion of control