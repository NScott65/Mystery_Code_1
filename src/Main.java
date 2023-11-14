public class Main {
    public static void main(String[] args) {
        String start = "programming is easy";
        String remove = "";
        String cap;
        //adds spaces
        for(int i = 0; i < start.length(); i++){
            if(!start.substring(i, i+1).equals(" ")){
                remove += start.substring(i, i + 1);
            }
        }

        start = remove;
        remove = "";
        // changes every other letter to capital
        for (int i = 1; i <= start.length(); i++) {
            cap = start.substring(i - 1, i);
            if (i % 2 == 0) {
                cap = cap.toUpperCase();
            } else {
                cap = cap.toLowerCase();
            }
            remove += cap + " ";
        }

        start = remove;
        remove = "";

        System.out.println(start);


        //removes everyother letter
        while (start.length() > 1) {
            for (int j = 0; j < start.length(); j+=2) {
                remove += start.substring(j, j + 1);
            }
            start = remove;
            remove = "";
            System.out.println(start);
        }
    }
}
