package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    public String toString(){
        return "The card has a balance of " + this.balance + " euros";
    }
    public double balance() {
        return this.balance;
    }
    public void addMoney(double amount){
        double x = this.balance + amount;
        if (amount < 0){
        } else {
            if(x > 150){
                this.balance = 150;
            } else{
                this.balance = x;
            }
        } 
    }
    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
