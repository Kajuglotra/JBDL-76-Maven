package org.gfg.springCore;

public class Address {

    private int sNo;

    private String city;

    public Address() {
        System.out.println("i am in default contructor of Address");
    }

//    public Address(int sNo, String city) {
//        this.sNo = sNo;
//        this.city = city;
//    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void destroyMethod(){
        System.out.println("destroying it" );
    }

}
