package activity;
class Activityy4 {

	    public static void main(String[] args) {
	        var user = new BankAccount("zhwar", 240);
	        user.setBalance(44);
	        user.setName("hama");
	        System.out.println(user.getBalance());
	        System.out.println(user.getName());
	    }

	}
class BankAccount {
	
	    private String ownerName;
	    private double balance;

	    BankAccount(String name, double balance) {
	        this.ownerName = name;
	        this.balance = balance;
	    }
	    public String getName() {
	        return this.ownerName;
	    }
	    public double getBalance() {
	        return this.balance;
	    }
	    public Boolean deposit(double amount) {
	        if (amount>0) {
	            this.balance += amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public Boolean withdraw(double amount) {
	        if (amount < this.balance) {
	            this.balance = this.balance - amount;
	            return true;
	        } else {
	            return false;
	        }
	    }

	    public void setName(String name){
	        this.ownerName = name;
	    }
	    public void setBalance(double balance){
	        this.balance = balance;
	    }

	}