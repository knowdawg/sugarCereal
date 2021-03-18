import java.util.ArrayList;

public class Cereal{
    String mostSugar = "";
    int mostSugarIndex = 0;
    int sugarAmount = 0;

    ArrayList<String> c1 = new ArrayList<String>();

    ArrayList<String> c2 = new ArrayList<String>();

    ArrayList<String> c3 = new ArrayList<String>();

    ArrayList<ArrayList<String>> cereals = new ArrayList<ArrayList<String>>();

    public static void main(String[] args) {
        Cereal asdf = new Cereal();
    }

    public Cereal(){
        c1.add("captrain crunch");
        c1.add("100");
        c2.add("apple jacks");
        c2.add("200");
        c3.add("cherios");
        c3.add("150");
        cereals.add(c1);
        cereals.add(c2);
        cereals.add(c3);
        getMostSugar();
    }

    public String getMostSugar(){
        for (ArrayList<String> c : cereals) {
            //mostSugar = c.get(0);
            //sugarAmount = Integer.parseInt( c.get(1));
            if(Integer.parseInt(c.get(1)) > sugarAmount){
                sugarAmount = Integer.parseInt(c.get(1));
                mostSugar = c.get(0);
            }
        }
        System.out.println(mostSugar);
        return(mostSugar);
    }
}