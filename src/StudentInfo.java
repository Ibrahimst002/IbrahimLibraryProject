import java.util.Arrays;

public class StudentInfo {
        String name; String depart;
        String uni_id; String uid;
        int sem;
        public void getdata( String name,String depart, String uni_id,
                             String uid,int sem ){
            this.name=name;
            this.depart =depart;
            this.uni_id=uni_id;
            this.uid=uid;
            this.sem=sem;
        }
        public void setdata(){

            System.out.println("Student's name: "+name);
            System.out.println("Student's department name: "+ depart);
            System.out.println("University id: "+uni_id);
            System.out.println("user id "+ uid);
            System.out.println("Semester "+sem);
    }

}
class libraryBooks {

    public void ComputerS(){
        System.out.println("");
        String chem[]={"Java programming","Python ",
                "Angular","Spss","Mathematics"};

        System.out.println("The books available in Computer Science " +
                "department are as follow:");
        for (int i=0; i< chem.length;i++){

            System.out.println(chem[i]);

        }

    }
    public void publicHealth(){
        System.out.println("");
        String[] pH ={"Medical Science","Biology","ephmology","Solid State Physics",
                "Astro Physics","Mathematics"};

        System.out.println("The books available in public Health" +
                " department are as follow:");

        for(int j=0; j<pH.length;j++){

            System.out.println(pH[j]);
        }

    }
    public void biology(){

        System.out.println("");
        String bio[]={"Zoology","Botany","Medical Science","Mathematics",
                "Communication skills"};

        System.out.println("The books available for biology " +
                "department are as follow:");

        for (int k=0;k< bio.length;k++){

            System.out.println(bio[k]);

        }

    }

}
class staff extends libraryBooks{
    String name;
    String password;
    public String add(String add){
        return add;

    }
}


