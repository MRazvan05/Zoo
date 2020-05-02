import java.util.*;

public class mainClass {
    public static void main(String args[]){
        List <Zoo> zooList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int option = 0, val = 0, val1 = 0;
        addList(zooList);

        zooList.sort(Comparator.comparingInt(Zoo :: getVisitingArea));


        while(option != 4)
        {
            System.out.println("==================");
            System.out.println("1.Search an animal by name.");
            System.out.println("2.Display animals by areas.");
            System.out.println("3.Zoo list");
            System.out.println("4.Exit");
            System.out.print("Write here : ");
            option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.print("Name of animal : ");
                    String animal = scan.next();
                    for(Zoo t : zooList){
                        if(t.getName().toLowerCase().equals(animal.toLowerCase())) {
                            System.out.println(t);
                            val++;
                        }
                    }
                    if(val == 0)
                        System.out.println("We don't have this animal.");
                    break;

                case 2:
                    System.out.print("Enter area(1-5) : ");
                    int area = scan.nextInt();
                    if(area >= 1 && area <= 5){
                        for(Zoo t : zooList){
                            if(t.getVisitingArea() == area){
                                System.out.println(t);
                                val1++;
                            }
                        }
                    }

                    if(val1 == 0)
                        System.out.println("No area found.");
                    break;

                case 3:

                    for(Zoo t : zooList){
                        System.out.println(t);
                    }
                    break;

                case 4:
                    System.out.println("Good bye");
                    break;

                default:
                    System.out.println("Wrong option.");
            }
        }

        scan.close();

    }

    public static void addList(List<Zoo> zooList){
        zooList.add(new Zoo("Parrot", "Italy", 4, "Apples"));
        zooList.add(new Zoo("Flamingos","Africa", 1, "Fish"));
        zooList.add(new Zoo("Monkey", "Africa", 2, "Bananas"));
        zooList.add(new Zoo("Tigers", "Arizona", 3, "Meat"));
        zooList.add(new Zoo("Camels", "Africa", 4, "Grass"));
        zooList.add(new Zoo("Giraffes", "Africa", 2, "Apples"));
        zooList.add(new Zoo("Gibbons", "Africa", 1 , " Bananas"));
        zooList.add(new Zoo("Crocodiles", "Arizona", 5, "Meat"));
        zooList.add(new Zoo("Rhinos", "Africa", 5, "Fruits"));
    }
}
