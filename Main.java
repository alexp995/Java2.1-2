public class Main {
    public static void main(String[] args) {
       long amount = 100;
       long replenishment = 1400;
       long bonus;
       if (replenishment > 1000) {
           bonus = replenishment/100;
      } else {
           bonus = 0;
       }
       long total = amount + replenishment + bonus;
        System.out.println(total);
    }
}
