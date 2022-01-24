import java.util.Scanner;

public class Karyawan {

    public static String nama,TanggalLahir,HP,input,alamat,KTP,status;
    public static int input_menu,input_menu_edit;
      // membuat scanner baru
    public static Scanner keyboard = new Scanner(System.in);
    

    public static void UlangTampilData()
    {  

        if(alamat==null)alamat="-";
        if(nama==null)nama="-"; 
        if(TanggalLahir==null)TanggalLahir="-";
        if(HP==null)HP="-"; 
        if(KTP==null)KTP="-";
        if(status==null)status="-"; 
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("Data Karyawan");
        System.out.println("");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);        
        System.out.println("Nomor Hp: " + HP);
        System.out.println("Tanggal lahir: " + TanggalLahir);
        System.out.println("Status: " + status);
        System.out.println("Nomor KTP: " + KTP);   
        //menu_utama();
    }
 
    public static void edit_nama()
    {
        System.out.println("Update Data");
        System.out.print("Nama : ");
        nama = keyboard.nextLine();  
        //menu_utama();
    }
    public static void edit_alamat()
    {
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();  
        //menu_utama();
    }
    public static void edit_HP()
    {
        System.out.print("HP : ");
        HP = keyboard.nextLine();  
        //menu_utama();
    }  
    public static void edit_TanggalLahir()
    {
        System.out.print("Tanggal Lahir : ");
        TanggalLahir = keyboard.nextLine();  
        //menu_utama();
    } 
    public static void edit_Status()
    {
        System.out.print("status : ");
        status = keyboard.nextLine();  
        //menu_utama();
    }  
    public static void edit_KTP()
    {
        System.out.print("KTP : ");
        KTP = keyboard.nextLine();  
        //menu_utama();
    } 
    public static void update()
    {   
        System.out.println("Update Data");
        System.out.println("");
        System.out.println("1.Nama: ");
        System.out.println("2.Alamat: ");        
        System.out.println("3.HP: ");
        System.out.println("4.Tanggal lahir: ");
        System.out.println("5.Status: ");
        System.out.println("6.Nomor KTP: ");        
        System.out.println("7.Cancel ");   
        
 

       
        input_menu_edit = keyboard.nextInt();
        
 
 
        if(input_menu_edit==1)
        {
            nama = "";
            while(nama==""){
            System.out.println("Update Data");
            System.out.print("Nama : ");
            nama = keyboard.nextLine(); 
            }
            menu_utama();
            
        }
        if(input_menu_edit==2)
        {
            alamat = "";
            while(alamat==""){
            System.out.println("Update Data");
            System.out.print("alamat : ");
            alamat = keyboard.nextLine(); 
            }
            menu_utama();
            
        }
        if(input_menu_edit==3)
        {
            HP = "";
            while(HP==""){
            System.out.println("Update Data");
            System.out.print("HP : ");
            HP = keyboard.nextLine(); 
            }
            menu_utama();
            
        }
        if(input_menu_edit==4)
        {
            TanggalLahir = "";
            while(TanggalLahir==""){
            System.out.println("Update Data");
            System.out.print("Tanggal Lahir : ");
            TanggalLahir = keyboard.nextLine(); 
            }
            menu_utama();
            
        }

        if(input_menu_edit==5)
        {
            status = "";
            while(status==""){
            System.out.println("Update Data");
            System.out.print("status : ");
            status = keyboard.nextLine(); 
            }
            menu_utama();
            
        }
        if(input_menu_edit==6)
        {
            KTP = "";
            while(KTP==""){
            System.out.println("Update Data");
            System.out.print("KTP : ");
            KTP = keyboard.nextLine(); 
            }
            menu_utama();
            
        }

       

    }  
    
    public static void menu_utama()
    {    
        System.out.println("Pilih Menu");
        System.out.println("");        
        System.out.println("1.Lihat Data Diri");
        System.out.println("2.Update Data Diri");        
        System.out.println("3.Keluar");
        
  
        input_menu = keyboard.nextInt();
        
    
        switch (input_menu)
        {
            case 1:
                System.out.println("dipanggil");
                UlangTampilData();
                break;
            case 2: 
                update();
                break;

            case 3:
                System.exit(0);
                break;
            
        }
         System.out.println("dipanggil");
        
    }    
    
    public static void terimaData()
    {    
        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan Binus ###");
        System.out.print("Nama : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.println("### Tanggal Lahir : 05 Juni 1994 ###");
        System.out.print("Tanggal Lahir: ");
        // menggunakan scanner lagi
        TanggalLahir = keyboard.nextLine();
        System.out.println("### Nomor HP : 0853414922**");
        System.out.print("Nomor HP: ");
        HP = keyboard.nextLine();
        
        konfirmasiData();

    }
    
    public static void tampilData()
    {    
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Tanggal Lahir: " + TanggalLahir);
        System.out.println("nomor HP: " + HP);
        
        
        
    }
    
    public static void konfirmasiData()
    {   
        System.out.println(""); 
        System.out.println("");  
        tampilData();
        System.out.println(""); 
        System.out.println("");  
        System.out.println("Apakah Anda yakin dengan data tersebut? [Y|N]");


 

        
        input = keyboard.nextLine();
        

        
        switch (input)
        {
            case "Y":
                menu_utama();
                break;
            case "y": 
                menu_utama();
                break;

            case "N":
                terimaData();
                break;
            case "n": 
                terimaData();
                break;

            default:
                 konfirmasiData(); 
                 break;         
        }
        
    }


    

    public static void main(String[] args) {
        // deklarasi variabel

        terimaData();


    }



}
