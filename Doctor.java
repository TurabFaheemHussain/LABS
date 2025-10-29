package scd;

class Doctor extends user {
    int D_id;
    String D_name;

    public Doctor(int D_id, String D_name) {
        this.D_id = D_id;
        this.D_name = D_name;
    }

    void CheckPatient(Patient p) {
        System.out.println(D_name + " is checking patient " + p.P_name);
    }
}
