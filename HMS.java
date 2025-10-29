package scd;

public class HMS {
    public static void main(String[] args) {
        // Creating objects
        Receptionist r = new Receptionist(101, "Ayan");
        Doctor d = new Doctor(201, "Dr. Turab");
        Patient p = new Patient(301, "Ali");
        Billing b = new Billing(1, p.P_id, p.P_name, 5000.0f);

        // Using methods
        r.GiveAppoint();
        d.CheckPatient(p);
        r.GenerateBill(b);
        b.showBill();
        p.PayBill(b);
    }
}
