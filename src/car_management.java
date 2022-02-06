import java.util.Scanner;




import java.util.Scanner;

public class car_management {
    public static void main(String argu[]) {
        Scanner ad = new Scanner(System.in);
        //  facultypark pa=new facultypark();
        int add = 0;
        int select;
        int type;

        int[] tech = {0, 0, 0};
        int[] techs = {30, 30,30};


        int[] sci = {0, 0, 0};
        int[] scis = {30, 30, 30};

        int[] sco = {0, 0, 0};
        int[] scos = {30, 30, 30};

        int[] man = {0, 0, 0};
        int[] mans = {30, 30, 30};

        // int car=0,bike=0,van=0;
        while (true) {
            System.out.println("Press 1 to enter Faculty of Science");
            System.out.println("Press 2 to enter Faculty of management");
            System.out.println("Press 3 to enter Faculty of Technology");
            System.out.println("Press 4 to enter Faculty of Physics ");
            System.out.println("Press 5 to enter Faculty of Art");
            System.out.println("Press 6 to enter Faculty of Low ");


            select = ad.nextInt();

            //#####################################################

            if (select == 1) {
                System.out.println("Faculty of Science");
                System.out.println("Press 1 to enter van");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter car");



                System.out.print("BiKE Space:  ");
                System.out.println(tech[0]);
                System.out.print("car Space:  ");
                System.out.println(tech[1]);
                System.out.print("van Space:  ");
                System.out.println(tech[2]);
                type = ad.nextInt();

                //#####################################################

                if (type== 1) {
                    add = tech[0] + 1;
                    tech[0] = add;
                    techs[0] = techs[0] - 1;
                    System.out.print("car :");
                    System.out.print(tech[0]);
                    System.out.print("   ");
                    System.out.print(techs[0]);


                    System.out.print(" van :");
                    System.out.print(tech[1]);
                    System.out.print("   ");
                    System.out.print(techs[1]);

                    System.out.print(" BiKE :");
                    System.out.print(tech[2]);
                    System.out.print("   ");
                    System.out.println(techs[2]);

                }
                //#####################################################
                else if (type == 2) {

                    tech[1] = tech[1] + 1;
                    techs[1] = techs[1] - 1;

                    System.out.print("car :");
                    System.out.print(techs[0]);
                    System.out.print("   ");
                    System.out.print(techs[0]);


                    System.out.print(" van :");
                    System.out.print(tech[1]);
                    System.out.print("   ");
                    System.out.print(techs[1]);

                    System.out.print(" Bick :");
                    System.out.print(tech[2]);
                    System.out.print("   ");
                    System.out.println(techs[2]);

                }

                //#####################################################
                else if (type == 3) {

                    tech[2] = tech[2] + 1;
                    techs[2] = techs[2] - 1;

                    System.out.print("car :");
                    System.out.print(tech[0]);
                    System.out.print("   ");
                    System.out.print(techs[0]);


                    System.out.print(" van :");
                    System.out.print(tech[1]);
                    System.out.print("   ");
                    System.out.print(techs[1]);

                    System.out.print(" BiKE :");
                    System.out.print(tech[2]);
                    System.out.print("   ");
                    System.out.println(techs[2]);

                }

            }


            //#####################################################

            else if (select == 2) {
                System.out.println("Faculty of management");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(sci[0]);
                System.out.print("car Space:  ");
                System.out.println(sci[1]);
                System.out.print("van Space:  ");
                System.out.println(sci[2]);
                type = ad.nextInt();

                //#####################################################

                if (type == 1) {
                    add = sci[0] + 1;
                    sci[0] = add;
                    techs[0] = sci[0] - 1;
                    System.out.print("car :");
                    System.out.print(sci[0]);
                    System.out.print("   ");
                    System.out.print(scis[0]);


                    System.out.print(" van :");
                    System.out.print(sci[1]);
                    System.out.print("   ");
                    System.out.print(scis[1]);

                    System.out.print(" BiKE :");
                    System.out.print(sci[2]);
                    System.out.print("   ");
                    System.out.println(scis[2]);

                }
                //#####################################################
                else if (type == 2) {

                    sci[1] = sci[1] + 1;
                    scis[1] = scis[1] - 1;

                    System.out.print("car :");
                    System.out.print(sci[0]);
                    System.out.print("   ");
                    System.out.print(scis[0]);


                    System.out.print(" van :");
                    System.out.print(sci[1]);
                    System.out.print("   ");
                    System.out.print(scis[1]);

                    System.out.print(" BikE :");
                    System.out.print(sci[2]);
                    System.out.print("   ");
                    System.out.println(scis[2]);

                }

                //#####################################################
                else if (type == 3) {

                    sci[2] = sci[2] + 1;
                    scis[2] = scis[2] - 1;

                    System.out.print("car :");
                    System.out.print(sci[0]);
                    System.out.print("   ");
                    System.out.print(scis[0]);


                    System.out.print(" van :");
                    System.out.print(sci[1]);
                    System.out.print("   ");
                    System.out.print(scis[1]);

                    System.out.print(" BikE :");
                    System.out.print(sci[2]);
                    System.out.print("   ");
                    System.out.println(scis[2]);

                }

            } else if (3 == select) {

                System.out.println("Faculty of Technology");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(sco[0]);
                System.out.print("car Space:  ");
                System.out.println(sco[1]);
                System.out.print("van Space:  ");
                System.out.println(sco[2]);
                type = ad.nextInt();

                //#####################################################

                if (type == 1) {
                    sco[0] = sco[0] + 1;

                    scos[0] = sco[0] - 1;
                    System.out.print("car :");
                    System.out.print(sco[0]);
                    System.out.print("   ");
                    System.out.print(scos[0]);


                    System.out.print(" van :");
                    System.out.print(sco[1]);
                    System.out.print("   ");
                    System.out.print(scos[1]);

                    System.out.print(" Bick :");
                    System.out.print(sco[2]);
                    System.out.print("   ");
                    System.out.println(scos[2]);

                } else if (type == 2) {

                    sco[1] = sco[1] + 1;
                    scos[1] = scos[1] - 1;

                    System.out.print("car :");
                    System.out.print(sco[0]);
                    System.out.print("   ");
                    System.out.print(scos[0]);


                    System.out.print(" van :");
                    System.out.print(sco[1]);
                    System.out.print("   ");
                    System.out.print(scos[1]);

                    System.out.print(" BikE :");
                    System.out.print(sco[2]);
                    System.out.print("   ");
                    System.out.println(scos[2]);

                } else if (type == 3) {

                    sco[2] = sco[2] + 1;
                    scos[2] = scos[2] - 1;

                    System.out.print("car :");
                    System.out.print(sco[0]);
                    System.out.print("   ");
                    System.out.print(scos[0]);


                    System.out.print(" van :");
                    System.out.print(sco[1]);
                    System.out.print("   ");
                    System.out.print(scos[1]);

                    System.out.print(" Bick :");
                    System.out.print(sco[2]);
                    System.out.print("   ");
                    System.out.println(scos[2]);


                }
            }else if (4 == select) {

                System.out.println("Faculty of Physics");
                System.out.println("Press 1 to enter car");
                System.out.println("Press 2 to enter bike");
                System.out.println("Press 3 to enter van");


                System.out.print("Bick Space:  ");
                System.out.println(man[0]);
                System.out.print("car Space:  ");
                System.out.println(man[1]);
                System.out.print("van Space:  ");
                System.out.println(man[2]);
                type = ad.nextInt();

                //#####################################################

                if (type == 1) {
                    man [0] = man [0] + 1;

                    man[0] = man[0] - 1;
                    System.out.print("car :");
                    System.out.print(sco[0]);
                    System.out.print("   ");
                    System.out.print(man[0]);


                    System.out.print(" van :");
                    System.out.print(man[1]);
                    System.out.print("   ");
                    System.out.print(man[1]);

                    System.out.print(" BiKE :");
                    System.out.print(man[2]);
                    System.out.print("   ");
                    System.out.println(man[2]);

                } else if (type == 2) {

                    man[1] = man[1] + 1;
                    man[1] = man[1] - 1;

                    System.out.print("car :");
                    System.out.print(man[0]);
                    System.out.print("   ");
                    System.out.print(man[0]);


                    System.out.print(" van :");
                    System.out.print(man[1]);
                    System.out.print("   ");
                    System.out.print(man[1]);

                    System.out.print(" Bick :");
                    System.out.print(man[2]);
                    System.out.print("   ");
                    System.out.println(man[2]);

                } else if (type == 3) {

                    man[2] = man[2] + 1;
                    mans[2] = mans[2] - 1;

                    System.out.print("car :");
                    System.out.print(man[0]);
                    System.out.print("   ");
                    System.out.print(mans[0]);


                    System.out.print(" van :");
                    System.out.print(man[1]);
                    System.out.print("   ");
                    System.out.print(mans[1]);

                    System.out.print(" BiKE :");
                    System.out.print(man[2]);
                    System.out.print("   ");
                    System.out.println(mans[2]);


                }
            }









































































































        }
    }


}


