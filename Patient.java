package scd;

class Patient extends user {
    int P_id;
    String P_name;

    public Patient(int P_id, String P_name) {
        this.P_id = P_id;
        this.P_name = P_name;
    }

    void PayBill(Billing bill) {
        System.out.println(P_name + " paid bill of amount $" + bill.B_amt);
    }
}
