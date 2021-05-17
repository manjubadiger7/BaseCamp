
/*
 	Develop a program for an Insurance company
	Create a Menu driven program which takes “N” number of Policy details
	Policy class should have the following
		○  Id 
		○  Number 
		○  Type 
		○  PremiumFee 
		○  PremiumMode [ Quarterly, Halfyearly, yearly ] 
	1. Add Policy details to the system and display all Policy details present in system
	2. Display policies whose premium fee is less than or equal to given Amount for given Mode
	Example: If input is given as 5000 and Mode as “Quarterly”, display policies whose Premium Fee is less than or equal to 5000 with Mode as “Quarterly”
	3. Sort policy details by Number and display all Policy details present in system
	4. Update Premium Fee details for given Policy Number
5. Exit
*/

import java.util.Scanner;

public class PolicyMain {

	static Scanner sc = new Scanner(System.in);

	private static Policy[] addPolicy() {
		// TODO Auto-generated method stub

		System.out.println("Please enter number of policies to be enterd");
		int policiesCount = sc.nextInt();

		Policy[] policies = new Policy[policiesCount];

		for (int i = 0; i < policiesCount; i++) {

			System.out.println("Please enter policy details of " + (i + 1));

			System.out.println("Enter Id");
			int id = sc.nextInt();

			System.out.println("enter policy number");
			int number = sc.nextInt();

			System.out.println("enter policy type");
			sc.nextLine();
			String type = sc.nextLine();

			System.out.println("enter premium fees");
			double premiumFees = sc.nextDouble();

			System.out.println("enter premium mode as below");
			System.out.println("	1.Quaterly");
			System.out.println("	2.Halfyearly");
			System.out.println("	3.yearly");
			int choice = 0;
			String premiumMode = null;
			while (choice == 0) {
				System.out.println("choose PremiumMode");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					premiumMode = "Quaterly";
					break;
				case 2:
					premiumMode = "HalfYearly";
					break;
				case 3:
					premiumMode = "Yearly";
					break;
				}
			}

			policies[i] = new Policy(id, number, type, premiumFees, premiumMode);

		}

		return policies;

	}

	static void displayPolicy(Policy[] policies2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < policies2.length; i++) {
			System.out.println("-----------------------------------------------");
			System.out.println("Policy Details of " + (i + 1));
			System.out.println("-----------------------------------------------");
			System.out.println("Id:           " + policies2[i].getId());
			System.out.println("Number:       " + policies2[i].getNumber());
			System.out.println("Type:         " + policies2[i].getType());
			System.out.println("Premium Fees: " + policies2[i].getPremiumFee());
			System.out.println("Premium Mode: " + policies2[i].getPremiumMode());
			System.out.println("************************************************");

		}

	}

//Searching Policy
	private static void searchPolices(Policy[] policies) {

		System.out.println("Please enter premium fees to list");
		double premiumFees = sc.nextDouble();
		// linear Searching
		for (int i = 0; i < policies.length; i++) {
			double pre = policies[i].getPremiumFee();
			if (pre <= premiumFees) {
				System.out.println("-----------------------------------------------");
				System.out.println("Policy Details of " + (i + 1));
				System.out.println("-----------------------------------------------");
				System.out.println("Id:           " + policies[i].getId());
				System.out.println("Number:       " + policies[i].getNumber());
				System.out.println("Type:         " + policies[i].getType());
				System.out.println("Premium Fees: " + policies[i].getPremiumFee());
				System.out.println("Premium Mode: " + policies[i].getPremiumMode());
				System.out.println("************************************************");

			} else {
				System.out.println("there is no record found");
			}
		}

	}

//Sorting Policies
	private static Policy[] sortPolicies(Policy[] policies) {
		Policy[] temp = new Policy[1];
		boolean swapped;
		// Bubble Sort
		for (int k = 0; k < policies.length - 1; k++) {
			swapped = false;
			for (int k2 = 0; k2 < policies.length - k - 1; k2++) {
				if (policies[k2].getNumber() > policies[k2 + 1].getNumber()) {
					// swaping
					temp[0] = policies[k2];
					policies[k2] = policies[k2 + 1];
					policies[k2 + 1] = temp[0];
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
		return policies;
	}

//Update Policy
	private static Policy[] updatePolicy(Policy[] policies) {
		System.out.println("Please enter Policy Number to update Premium Fee");
		int policyNumber = sc.nextInt();

		for (int i = 0; i < policies.length; i++) {
			if (policies[i].getNumber() == policyNumber) {
				System.out.println("Enter new premium Fee for update");
				int newPremiumFees = sc.nextInt();
				policies[i].setNumber(newPremiumFees);
				break;
			}
		}
		return policies;

	}

//Display Options
	static void displayOptions() {

		System.out.println("-----------------------------------------------------------------");
		System.out.println("1. Add policy details.");
		System.out.println("2. Display policies whose premium fee is less than or equal");
		System.out.println("3. Sort policy details by Number and display all Policy details");
		System.out.println("4. Update Premium Fee details for given Policy Number");
		System.out.println("5. Exit");
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		byte ch = 0;

		Policy[] pol = null;

		do {
			displayOptions();

			System.out.println("Please enter your choice.");
			ch = sc.nextByte();

			switch (ch) {

			case 1:
				pol = addPolicy();
				displayPolicy(pol);
				break;
			case 2:
				searchPolices(pol);
				break;
			case 3:
				Policy[] sortedPol = sortPolicies(pol);
				displayPolicy(sortedPol);
				break;
			case 4:
				Policy[] updatedPol = updatePolicy(pol);
				displayPolicy(updatedPol);
				break;
			case 5:
				System.out.println("You are exited from application");
				break;
			default:
				System.out.println("Please enter valid options");
				continue;
			}
		} while (ch > 0);

	}
}
