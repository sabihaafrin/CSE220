/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab08_queue_final_hw;

public class Patient_Tester {

    public static void main(String[] args) {
        try {

            Patient p1 = new Patient("Baekhyun", 28, "O+");
            Patient p2 = new Patient("Kyungsoo", 27, "A+");
            Patient p3 = new Patient("Jongin", 26, "B+");
            WRM w = new WRM();

            w.RegisterPatient(p1);
            w.RegisterPatient(p2);
            w.RegisterPatient(p3);

            w.ServePatient();
            w.ServePatient();
            w.ServePatient();
            w.CancelAll();
            System.out.println(w.CanDoctorGoHome());
            w.RegisterPatient(p1);
            System.out.println(w.CanDoctorGoHome());
            w.ShowAllPatient();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
