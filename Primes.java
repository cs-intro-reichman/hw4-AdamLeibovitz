public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        boolean[] arr = new boolean[n+1];
        for (int j = 2; j < arr.length; j++) { //set-up
            arr[j] = true;
        }
        for (int k = 2; k < arr.length; k++) { //main loop
            if (arr[k] == true) {
                for (int i = k*2; i < arr.length; i += k) {
                    arr[i] = false;
                }
            }
        }
        for (int p = 2; p < arr.length; p++) { //print
            if (arr[p] == true) {
                System.out.println(p);
                count++;
            }
        }
        int precentage = count*100/(n);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + precentage + "% are primes)");
    }
}