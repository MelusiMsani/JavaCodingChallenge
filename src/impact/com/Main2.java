package impact.com;

public class Main2 {
    public static void main(String[] args) {

        /*
        *
        *
        *
        *
        *
        * */

        String sample0 = "1,3,3,3,6,7,8,12,13,14,15,21,22,23,24,31,0,0,0,0,1,1,1,1,";
        String sample1 = "0,0,0,1,2,4,5,7,8,9,10,11,11,11,17,18,0,1,16";
        String sample2 = "3,7,8,1,-1,0,7,9,0,-7";
        String sample3 = "0,0,0,0,0,0,0,0,0,0,0,0,1";
        String sample4 = "1,2,3,4,5,6,7,8,9";
        String sample5 = "0,2,5,1,4,7,8,9,6,5,3,2,4,5,1,2,20,2,15,25,25,23,22,20,21,5,55,26,22,32,21,22,23,24,25,26,27,28,29,30,31,32,33";
        String sample6 = "0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1";

        Summarizer object = new Summarizer();
        System.out.println();
        object.summarizeCollection(object.collect(sample0));
        System.out.println();
        object.summarizeCollection(object.collect(sample1));
        System.out.println();
        object.summarizeCollection(object.collect(sample2));
        System.out.println();
        object.summarizeCollection(object.collect(sample3));
        System.out.println();
        object.summarizeCollection(object.collect(sample4));
        System.out.println();
        object.summarizeCollection(object.collect(sample5));
        System.out.println();
        object.summarizeCollection(object.collect(sample6));


        // write your code here
    }
}
