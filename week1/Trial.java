public class Trial{
    
public static void main (String [] args){
    int chickens=3;
    double bacon = 5.5;
    String tractor = "There is none";
    
    System.out.println("Chickens: "+ chickens);
    System.out.println("Bacon (kg): "+ bacon);
    System.out.println("A tractor: "+ tractor);
    
    System.out.println("In a nutshell:\n" + chickens+ "\n"+bacon+ "\n" + tractor);
    
    chickens=9000;
    bacon = 0.1;
    tractor = "Zetor";
    
    System.out.println("Chickens: "+ chickens);
    System.out.println("Bacon (kg): "+ bacon);
    System.out.println("A tractor: "+ tractor);
    
    System.out.println("In a nutshell:\n" + chickens+ "\n"+bacon+ "\n" + tractor);
    
    int dividend=3;
    int divisor=2;
    double quotient=1.0*dividend/divisor;
    System.out.println(quotient);
    
    int numberOfDaysInYear= 365;
    int hoursInDay= 24;
    int minutesInHour=60;
    int secondsInMinute=60;
    
    System.out.println("There are "+ numberOfDaysInYear*hoursInDay*minutesInHour*secondsInMinute + " seconds in a year");
    
    
}
    
}