import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Custmer customers=new Custmer();
        Scanner sc=new Scanner(System.in);;
        Custmer[] customers =new Custmer[2];
        for(int i=0;i<2;i++)
        {
            Custmer ob=new Custmer();
            System.out.println("Enter Name");
            ob.setName(sc.nextLine());
            System.out.println("Enter Id");
            ob.setId(sc.nextInt());
            customers[i]=ob;

        }
        for(int i=0;i<2;i++)
        {
            System.out.println(customers[i].getName()+"\t"+customers[i].);
        }


//      System.out.println("enter custmer Name,custmer id,mobil_no");
//        customers[0].setName(sc.nextLine());
//       // customers[0].setMob_no(sc.nextLine());
//        customers[0].setId(sc.nextInt());
//        System.out.println("enter custmer Name,mobil no/,custmer id");
//        customers[1].setName(sc.nextLine());
//        //////////////////////////customers[1].setMob_no(sc.nextLine());
//        customers[1].setId(sc.nextInt());

//     customers[0].setName("kalyan");
//        customers[0].setId(4);
//        customers[0].setMob_no("89887378");
//
////        customers[1].setName("some name");
//        customers[1].setId(5);
//        customers[1].setMob_no("4289887378");

//        for(int i=0;i<2;i++)
//        {
//         Scanner sc=new Scanner(System.in);
//            System.out.println("Enter Name");
//            customers[i].setName(sc.nextLine());
//            System.out.println("Enter Id");
//            customers[i].setId(sc.nextInt());
//            System.out.println("Enter mobileno");
//            customers[i].setMob_no(sc.nextLine());
//        }
//        for(int i=0;i<2;i++)
//        {
//            System.out.println("custmer detail:-"+customers[i].getName()+"\t"+customers[i].getId()+"\t"+customers[i].getMob_no());
//        }

        //   System.out.println("custmer detail:-"+customers.getName()+"\t"+customers.getId()+"\t"+customers.getMob_no());


    }
}
