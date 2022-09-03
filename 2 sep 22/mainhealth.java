abstract class HealthCare
{

	abstract void PatientData();

	abstract void CashFlow();
}
class PatientDetail extends HealthCare
{
	void PatientData()
	{
     String name="Alex";
     String doj="5 aug 22";
     String gender="Male";
	System.out.println("The Patient Data is :"+name +" "+doj+" "+gender);
	}
	
	void CashFlow()
	{
	int cash=1000;
	String paid="yes";
	System.out.println("The Patient Bill Report is :"+cash +" "+paid);
	}
}
class mainhealth
{
public static void main (String [] args)
{
HealthCare bca=new PatientDetail();
bca.PatientData();
bca.CashFlow();
}
}
