public class prime {
    public static void main(String[] args) {
        // this is for direclty to find a number is prime or not
        // int n=10;
        // boolean isPrime=isPrime(n);
        // System.out.println(n+" is "+isPrime);

        for(int i=2;i<100;i++){
            boolean isPrime=isPrime(i);
            System.out.println(i+" is "+isPrime);
        }

    }
    public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
