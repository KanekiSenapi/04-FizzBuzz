package pl.aogiri.challenges.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz(){
        StringBuilder s;
        for(int i = 1 ; i<=100 ; i++){
            s = new StringBuilder();
            if(i%3==0)
                s.append("Fizz");
            if(i%5==0) {
                s.append("Buzz");
            }
            if(s.length()==0)
                s.append(i);
            System.out.println(s);
        }
    }
}
