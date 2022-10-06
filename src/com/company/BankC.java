package com.company;

import java.util.Scanner;

public class BankC extends BankDetails implements Bank {
    private String Bankname;
    private long Accnumber;
    BankDetails  b = new BankDetails();
   public void bankdetails()
   {
       System.out.println("Enter the Bank name");
       Scanner in = new Scanner(System.in);
       Bankname = in.next();
       System.out.println("Enter the Account number");
       Accnumber = in.nextLong();
       b.setBankname(Bankname);
       b.setAccountnumber(Accnumber);
   }
   public void creditcard()
   {
       long Acc = b.getAccountnumber();
       String n = b.getBankname();
       System.out.println("The Account number " + Acc + " is valid in the bank "+n);
   }
}
