package HospitalManagement;



import java.util.*;
import java.io.*;
import java.util.Calendar;


//import javax.sound.sampled.SourceDataLine;
//import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

//import Doctor.fecility;
class Staff
{
    String Sid, Sname, desg, sex;
    int salary;
    public void new_staff()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Staff ID : ");
        Sid=obj.nextLine();
        System.out.println("Staff name : ");
        Sname=obj.nextLine();
        System.out.println("Staff desigination : ");
        desg=obj.nextLine();
        System.out.println("Staff gender : ");
        sex=obj.nextLine();
        System.out.println("Staff salary : ");
        salary=obj.nextInt();
    }

    public void staff_info()
    {
        System.out.println(Sid +"\t\t\t\t\t\t" + Sname+"\t\t\t\t\t\t"+desg+"\t\t\t\t\t\t"+sex+"\t\t\t\t\t\t"+salary);
    }
}

class Doctor
{
    String did, dname, specilist, appoint, doc_qual;     
    int droom;
    public void new_doctor()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Doctor ID : ");
        did=obj.nextLine();
        System.out.println("Doctor name : ");
        dname=obj.nextLine();
        System.out.println("Doctor specilization : ");
        specilist=obj.nextLine();
        System.out.println("Doctor work time : ");
        appoint=obj.nextLine();
        System.out.println("Doctor qualification : ");
        doc_qual=obj.nextLine();
        System.out.println("Doctor room : ");
        droom=obj.nextInt();
    }
    public void doctor_info()
    {
        System.out.println(did+"\t\t\t\t\t\t"+dname+"\t\t\t\t\t\t"+specilist+"\t\t\t\t\t\t"+appoint+"\t\t\t\t\t\t"+doc_qual+"\t\t\t\t\t\t"+droom);
    }
}

class Patient
{
    String pid, pname, pdisease, sex, admit_status;
    int age;
    public void new_patient()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Patient ID : ");
        pid=obj.nextLine();
        System.out.println("Patience name : ");
        pname=obj.nextLine();
        System.out.println("Patience disease : ");
        pdisease=obj.nextLine();
        System.out.println("Patience gender : ");
        sex=obj.nextLine();
        System.out.println("Patience admit_status : ");
        admit_status=obj.nextLine();
        System.out.println("Patient age : ");
        age=obj.nextInt();
    }
    public void patient_info()
    {
        System.out.println(pid+"\t\t\t\t\t\t"+pname+"\t\t\t\t\t\t"+pdisease+"\t\t\t\t\t\t"+sex+"\t\t\t\t\t\t"+admit_status+"\t\t\t\t\t\t"+age);
    }
}

class Medical
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    public void new_medi()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Medicine name : ");
        med_name=obj.nextLine();
        System.out.println("Medicine company : ");
        med_comp=obj.nextLine();
        System.out.println("Medicine expire date : ");
        exp_date=obj.nextLine();
        System.out.println("Medicine cost : ");
        med_cost=obj.nextInt();
        System.out.println("Medicine count : ");
        count=obj.nextInt();

    }
    public void find_medi()
    {
        System.out.println(med_name+"\t\t\t\t\t\t"+med_comp+"\t\t\t\t\t\t"+exp_date+"\t\t\t\t\t\t"+med_cost+"\t\t\t\t\t\t"+count);
    }
}

class Lab
{
    String fecility;
    int lab_cost;
    public void new_feci()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Lab fecility : ");
        fecility=obj.nextLine();
        System.out.println("Lab cost : ");
        lab_cost=obj.nextInt();
    }

    public void feci_list()
    {
        System.out.println(fecility+"\n"+lab_cost);
    }
}

class fecility{
    String fec_name;
    public void add_feci()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Extra fecility : ");
        fec_name=obj.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}



public class HospitalManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner obj = new Scanner(System.in);
        String months[]={
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "sep",
            "Oct",
            "Nov",
            "Dec"
        };

        Calendar calendar=Calendar.getInstance();
        int count1=4, count2=4,count3=4,count4=4,count5=4,count6=4;
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("                    WELCOME TO HOSPITAL MANAGEMENT                 ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Date: "+months[calendar.get(Calendar.MONTH)]+" "+calendar.get(Calendar.DATE)+" "+calendar.get(Calendar.YEAR));
        System.out.println("Time: "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
        Doctor [] d=new Doctor[25];
        Patient [] p=new Patient[100];
        Lab [] l=new Lab[20];
        fecility [] f=new fecility[20];
        Medical []m=new Medical[100];
        Staff [] s=new Staff[100];
        int i;
        for(i=0;i<25;i++)
        {
            d[i] = new Doctor();
        }
        for(i=0;i<100;i++)
        {
            p[i] = new Patient();
        }
        for(i=0;i<20;i++)
        {
            l[i] = new Lab();
        }
        for(i=0;i<20;i++)
        {
            f[i] = new fecility();
        }
        for(i=0;i<100;i++)
        {
            m[i]=new Medical();
        }
        for(i=0;i<100;i++)
        {
            s[i]= new Staff();
        }
        d[0] . did = "30";
        d[0] . dname = "Dr. Mintu ";
        d[0] . specilist = "Physician";
        d[0] . appoint = "8 - 8 PM";
        d[0] . doc_qual = "MBBS , MD";
        d[0] . droom = 01;

        d[1] . did = "45";
        d[1] . dname = "Dr. Rakesh ";
        d[1] . specilist = "Sergion";
        d[1] . appoint = "8 - 10 PM";
        d[1] . doc_qual = "MBBS , MD";
        d[1] . droom = 02;

        d[2] . did = "30";
        d[2] . dname = "Dr. Vijay ";
        d[2] . specilist = "Physician";
        d[2] . appoint = "8 - 10 PM";
        d[2] . doc_qual = "BHM";
        d[2] . droom = 03;

        d[3] . did = "40";
        d[3] . dname = "Dr. MADHU SINHA ";
        d[3] . specilist = "Physician + SERGION";
        d[3] . appoint = "8 - 8 PM";
        d[3] . doc_qual = "MBBS , MD";
        d[3] . droom = 04;



        p[0] . pid = "01";
        p[0] . pname = "Pankaj";
        p[0] . pdisease = "Typhide";
        p[0] . sex = "Male";
        p[0] . admit_status = "A";
        p[0] . age = 25;

        p[1] . pid = "02";
        p[1] . pname = "Karan";
        p[1] . pdisease = "Liver infection";
        p[1] . sex = "Male";
        p[1] . admit_status = "B";
        p[1] . age = 28;

        p[2] . pid = "03";
        p[2] . pname = "Aditya";
        p[2] . pdisease = "Eye";
        p[2] . sex = "Male";
        p[2] . admit_status = "C";
        p[2] . age = 30;

        p[3] . pid = "01";
        p[3] . pname = "Priya";
        p[3] . pdisease = "Apendis";
        p[3] . sex = "Female";
        p[3] . admit_status = "d";
        p[3] . age = 25;


        m[0] . med_name= "Corex";
        m[0] . med_comp= "Cino pvt";
        m[0] . exp_date= "12/12/2024";
        m[0] . med_cost= 95;
        m[0] . count=10;

        m[1] . med_name= "Multivitamin";
        m[1] . med_comp= "any";
        m[1] . exp_date= "12/12/2025";
        m[1] . med_cost= 120;
        m[1] . count=4;

        m[2] . med_name= "oflo";
        m[2] . med_comp= "zinc";
        m[2] . exp_date= "12/10/2024";
        m[2] . med_cost= 150;
        m[2] . count=1;

        m[3] . med_name= "Montila-l";
        m[3] . med_comp= "any";
        m[3] . exp_date= "12/04/2025";
        m[3] . med_cost= 200;
        m[3] . count=10;


        l[0] . fecility= "X-Ray";
        l[0] . lab_cost=800;

        l[1] . fecility= "Ultrasound";
        l[1] . lab_cost=1400;

        l[2] . fecility= "CT- Scan";
        l[2] . lab_cost=8000;

        l[3] . fecility= "Sconography";
        l[3] . lab_cost=5000;


        f[0] . fec_name="ambulance";
        f[1] . fec_name="Admit Facility";
        f[2] . fec_name="Canteen";
        f[3] . fec_name="Emergency";


        s[0] . Sid="01";
        s[0] . Sname="Suhail";
        s[0] . desg="Worker";
        s[0] . sex="Male";
        s[0] . salary=20000;

        s[1] . Sid="02";
        s[1] . Sname="Pinki";
        s[1] . desg="Nurse";
        s[1] . sex="Female";
        s[1] . salary=18000;

        s[2] . Sid="03";
        s[2] . Sname="Rahil";
        s[2] . desg="Worker";
        s[2] . sex="Male";
        s[2] . salary=20000;

        s[3] . Sid="04";
        s[3] . Sname="Rehan";
        s[3] . desg="Worker";
        s[3] . sex="Male";
        s[3] . salary=20000;


        //Scanner obj=new Scanner(System.in);

        int choice, j , c1, status=1, s1=1, s2=1, s3=1, s4=1, s5=1, s6=1;
        while(status == 1)
        {
            System.out.println("\n                              MAIN MENU                           ");
            System.out.println("1. DOCTORS  2.PATIENTS  3.MEDICINES   4.LABORITIES  5.FACILITIES  6.STAFF");
            System.out.println("Select any one - ");
            choice = obj.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                        Doctors Section                            ");
                    System.out.println("-------------------------------------------------------------------");
                    s1 = 1;
                    while(s1 == 1)
                    {
                        System.out.println("1.Add new Entry\n2.Existing Doctors List");
                        c1=obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                d[count1].new_doctor();
                                count1++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("-----------------------------------------------------------------------------------------------------------");
                                System.out.println("ID\t\t\t\t\t\tNAME\t\t\t\t\t\tSPECILIST\t\t\t\t\t\tTIMING\t\t\t\t\t\tQUALIFICATION\t\t\t\t\t\tROOM NO.     ");
                                System.out.println("-----------------------------------------------------------------------------------------------------------");
                                for(j=0;j<count1;j++)
                                {
                                    d[j].doctor_info();;
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1=obj.nextInt();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                        PATIENT Section                            ");
                    System.out.println("-------------------------------------------------------------------");
                    s2 = 1;
                    while(s2 == 1)
                    {
                        System.out.println("1.Add new Entry \n2.Existing Patients List");
                        c1=obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                p[count2].new_patient();
                                count2++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("-----------------------------------------------------------------------------------------------------------");
                                System.out.println("ID\t\t\t\t\t\tNAME\t\t\t\t\t\tDISEASE\t\t\t\t\t\tGENDER\t\t\t\t\t\tADMIT STATUS\t\t\t\t\t\tAGE             ");
                                System.out.println("-----------------------------------------------------------------------------------------------------------");
                                for(j=0;j<count2;j++)
                                {
                                    p[j].patient_info();
                                }
                                break;
                                
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Mian Menu Press 0");
                        s2=obj.nextInt();
                    }
                    break;

                }
                case 3:
                {
                    s3 = 1;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                        MEDICINE Section                           ");
                    System.out.println("-------------------------------------------------------------------");
                    while(s3 == 1)
                    {
                        System.out.println("1.Add new Entry \n2.Existing Medicines List");
                        c1=obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                m[count3].new_medi();
                                count3++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("NAME\t\t\t\t\t\tCOMPANY\t\t\t\t\t\tEXPIRY DATE\t\t\t\t\t\tCOST                             ");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                for(j=0;j<count3;j++)
                                {
                                    m[j].find_medi();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 ans for Mian Menu Press 0");
                        s3=obj.nextInt();
                    }
                    break;
                }
                case 4:
                {
                    s4 = 1;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                     Laboratory Section                            ");
                    System.out.println("-------------------------------------------------------------------");
                    while(s4 == 1)
                    {
                        System.out.println("1.Add new Entry \n2.Existing Laborataries List");
                        c1=obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                l[count4].new_feci();
                                count4++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Fecilities\t\t\t\t\t\tCost                                                ");
                                System.out.println("--------------------------------------------------------------------------");
                                for(j=0;j<count4;j++)
                                {
                                    l[j].feci_list();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 ans for Mian Menu Press 0");
                        s4=obj.nextInt();

                    }
                    break;
                }
                case 5:
                {
                    s5 = 1;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                HOSPITAL FACILITY SECTION                          ");
                    System.out.println("-------------------------------------------------------------------");
                    while(s5 == 1)
                    {
                        System.out.println("1.Add new Facility \n 2.Existing Fecilities list");
                        c1=obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                f[count5].add_feci();
                                count5++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("-------------------------------------------------------------------");
                                System.out.println("HOSPITAL FACILITY ARE                                              ");
                                System.out.println("-------------------------------------------------------------------");
                                for(j=0;j<count5;j++)
                                {
                                    f[j].show_feci();

                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s5=obj.nextInt();
                    }
                    break;
                }
                case 6:
                {
                    s6 = 1;
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("                       STAFF SECTION                               ");
                    System.out.println("-------------------------------------------------------------------");
                    while(s6 == 1)
                    {
                        String a="Nursse",b="worker",c="Security";
                        System.out.println("1.Add new Entry \n 2.Existing Nurses List \n3.Existing worker List \n4.Existing Security List");
                        c1 = obj.nextInt();
                        switch(c1)
                        {
                            case 1:
                            {
                                s[count6].new_staff();
                                count6++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("ID\t\t\t\t\t\tNAME\t\t\t\t\t\tGENDER\t\t\t\t\t\tSALARY                                     ");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                for(j=0;j<count6;j++)
                                {
                                    if(a.equals(s[j].desg))
                                    {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                            case 3:
                            {
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("ID\t\t\t\t\t\tNAME\t\t\t\t\t\tGENDER\t\t\t\t\t\tSALARY                                     ");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                for(j=0;j<count6;j++)
                                {
                                    if(b.equals(s[j].desg))
                                    {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                            case 4:
                            {
                                System.out.println("-------------------------------------------------------------------------------------------");
                                System.out.println("ID\t\t\t\t\t\tNAME\t\t\t\t\t\tGENDER\t\t\t\t\t\tSALARY                                     ");
                                System.out.println("-------------------------------------------------------------------------------------------");
                                for(j=0;j<count6;j++)
                                {
                                    if(c.equals(s[j].desg))
                                    {
                                        s[j].staff_info();
                                    }
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Mian Menu Press 0");
                        s6=obj.nextInt();
                    
                    }
                    break;
                }
                default:
                {
                    System.out.println("You have enter wrong choice!!!!!!!!");
                }
            }
            System.out.println("\nReturn to Main Menu Press 1");
            status = obj.nextInt();
        }


	}

}
