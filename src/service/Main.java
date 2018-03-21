package service;

public class Main {
    public static void main(String[] args) {
      SoapCaller a = new SoapCallerImpl();
      System.out.println(a.getGiroAccept(null, null, 0));
    }
}

