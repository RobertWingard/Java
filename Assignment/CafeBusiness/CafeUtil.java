import java.util.*;

public class CafeUtil {
    public int getStreakGoal(){
        int output = 0;
        for (int i = 0; i <= 10; i++){
            output += i;
        }
        return output;
    }
    
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (double i : prices){
            sum += i;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i< menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("please enter your name:");        
        String userName = System.console().readLine();
            System.out.println("Hello " + userName + "!");
            System.out.println("There are "+ customers.size() +  " ahead of you");
            customers.add(userName);
            System.out.println (customers);
    }
}
