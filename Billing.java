package scd;

public class Billing {

    int B_no;
    int P_id;
    String P_name;
    float B_amt;

    public Billing(int B_no, int P_id, String P_name, float B_amt) {
        this.B_no = B_no;
        this.P_id = P_id;
        this.P_name = P_name;
        this.B_amt = B_amt;
    }

    void showBill() {
        System.out.println("Bill No: " + B_no);
        System.out.println("Patient: " + P_name);
        System.out.println("Amount: $" + B_amt);
    }
}
