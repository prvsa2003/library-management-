package BookProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Main {
    public static book[] lay ; 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******************WELECOME TO MY LYBRARY********************");
        loop:
        while (true) {
            System.out.println("plese choose  : ");
            System.out.println("1.Register \n2.Show \n3.Update \n4.Delete \n5.Exit");
            int userchoose = input.nextInt();
            switch(userchoose){
                case 1 : Register();
                    break ; 
                case 2 : show();
                    break ; 
                case 3 : edit();
                    break ;
                case 4 : delete();
                    break ; 
                case 5 : 
                    break loop; 
            }
        }
    }
    public static void addmember(book bk){
        if(lay==null){
            lay = new book[1];
        }else{
            lay = Arrays.copyOf(lay , lay.length+1);
        }
        lay[lay.length-1]=bk ; 
    }
    public static void Register(){
        Scanner inp = new Scanner(System.in) ; 
        book bk = new book () ;
        
        System.out.print("Enter MembershipNumber : ");
        bk.MembershipNumber = inp.nextLong();
        System.out.print("Enter Ages : ");
        bk.age = inp.nextByte();
        System.out.print("Enter Name : ");
        bk.name = inp.next();
        inp.nextLine();
        System.out.print("Enter sex : ");
        bk.sex = inp.next().charAt(0);
        
        addmember(bk);
    }
    public static void show(){
        for (int i = 0;lay!=null && i < lay.length; i++) {
            System.out.println(lay[i]);
        }
    }
    public static void edit(){
        Scanner inp = new Scanner (System.in) ; 
        System.out.println("Enter MembershipNumber :");
        Long cod = inp.nextLong();
        inp.nextLine();
        boolean flag = false ; 
        int x = 0 ; 
        for (int i = 0; i < lay.length; i++) {
            if (cod == lay[i].MembershipNumber) {
                x = i ;
                flag = true ; 
            }
        }
        if(flag==false){
            System.out.println("We cannot found this member ! ");
        }else{
             System.out.print("Enter the MembershipNumber : ");
            lay[x].MembershipNumber = inp.nextLong();
            inp.nextLine();
            System.out.print("Enter the name: ");
            lay[x].name = inp.nextLine();
            System.out.print("Enter the age: ");
            lay[x].age = inp.nextByte();
            System.out.print("Enter the total grade: ");
            lay[x].sex = inp.next().charAt(0);
        }
        System.out.println("Edit is successfuly ! ");
   }
    public static void delete(){
        Scanner input = new Scanner(System.in) ; 
        System.out.println("Enter the MembershipNumber :");
        Long MN = input.nextLong();
        for (int i = 0; i < lay.length; i++) {
          if(MN==lay[i].MembershipNumber){
              if(i==lay.length-1){
              lay=Arrays.copyOf(lay,lay.length-1);
              }else if (i < lay.length - 1) {
                    while (i < lay.length - 1) {
                       lay[i] = lay[i + 1];
                        ++i;
                    }
                    lay = Arrays.copyOf(lay, lay.length - 1);
                    break;
          }
            
        }
    }
}
}