/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220_lab08_queue_final_hw;
public class WRM
{
    ListQueue a = new ListQueue();
    
    public void RegisterPatient(Patient p)
    {
        p.ID = p.count++;
        try
        {
            a.enqueue(p);
        }
        
        catch(Exception e){
            
        }
    }
    
    public void ServePatient()
    {
       try
       {
           Patient s =(Patient) a.dequeue();
           System.out.println(s.name+" has been served");
       }
       catch(Exception e){
            
           System.out.println("eita serve er "+e);
        }
       
    }
    
    public void CancelAll()
    {
        a.clear();
    }
    
    public boolean CanDoctorGoHome()
    {
        if(a.isEmpty()==true)
        {
            return true;
        }
        return false;
    }
    
    public void ShowAllPatient()
    {
        System.out.println(a);
    }
}
