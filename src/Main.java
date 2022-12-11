public class Main {
    public static int countHighestSumValue(int[] tab) {
        int first = tab[0]; // definition of first element
        int second = tab[1]; // definition of second element
        for(int i = 0 ; i < tab.length ; i++){ // definition of two for loops to add up every element
            for(int n = 0; n < tab.length ; n++){
                if(first+second < tab[i]+tab[n] && i != n ){ //definition of if statement to check biggest sum of two numbers and to check if tey are not equal
                    first=tab[i]; //change of first element
                    second=tab[n]; //change of second element
                }
            }
        }
        return first + second; //return of sum
    }

    public static void main(String[] args) {
        int first[] = {10, 20, 30, 40, 50, 10, 20, 30, 40, 50, 20, 30, 40, 50};
        int second[] = {-1, -5, -4, -2, 1};
        System.out.println(countHighestSumValue(first));
        System.out.println(countHighestSumValue(second));
    }
}