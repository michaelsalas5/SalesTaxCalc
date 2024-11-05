import java.util.Scanner;

public class SalesTaxCalc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the amount of the purchase: "); // ask user to give the purchase amount

		float purchase = myObj.nextFloat(); // get the user amount of purchase

		float StateTax = 0.04f;
		float CountyTax = 0.02f;

		float TotalStateTax = purchase * StateTax;
		float TotalCountyTax = purchase * CountyTax;
		float TotalSalesTax = TotalStateTax + TotalCountyTax; // calculate the total sales tax
		float TotalSalesPrice = purchase + TotalSalesTax; // calculate the total sales price

		System.out.print("The total for the purchase will be: \n");
		System.out.print("The item purchased is: " + purchase);
		System.out.print("\nState Tax: " + TotalStateTax);
		System.out.print("\nCounty Tax: " + TotalCountyTax);
		System.out.print("\nThe total sales tax: " + TotalSalesTax);
		System.out.println("\nThe total after tax will be: " + TotalSalesPrice);

	}
}