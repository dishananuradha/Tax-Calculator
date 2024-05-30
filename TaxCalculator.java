import java.util.*;
class TaxCalculator{
	public final static void clearConsole(){
		try {   
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
			}else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch (final Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		L1:while(true){
			System.out.println("\n");
			System.out.println("\t\t\t\t\t\t __  ______  ________ ________");
			System.out.println("\t\t\t\t\t\t|  \\/      \\|        |        \\");
			System.out.println("\t\t\t\t\t\t \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
			System.out.println("\t\t\t\t\t\t|  | $$   \\$| $$__      | $$");
			System.out.println("\t\t\t\t\t\t| $| $$     | $$  \\     | $$");
			System.out.println("\t\t\t\t\t\t| $| $$   __| $$$$$     | $$");
			System.out.println("\t\t\t\t\t\t| $| $$__/  | $$_____   | $$");
			System.out.println("\t\t\t\t\t\t| $$\\$$    $| $$     \\  | $$");
			System.out.println("\t\t\t\t\t\t \\$$ \\$$$$$$ \\$$$$$$$$   \\$$");
			System.out.println("\n");
			System.out.println("   _______             __   __   ____              _        ____   _    _   _                  _______    ____    _____ ");
			System.out.println("  |__   __|     /\\     \\ \\ / /  / ___|     /\\     | |      / ___| | |  | | | |         /\\     |__   __|  / __ \\  |  __ \\");
			System.out.println("     | |       /  \\     \\ V /  | |        /  \\    | |     | |     | |  | | | |        /  \\       | |    | |  | | | |__) |");
			System.out.println("     | |      / /\\ \\     > <   | |       / /\\ \\   | |     | |     | |  | | | |       / /\\ \\      | |    | |  | | |  _  /");
			System.out.println("     | |     / ____ \\   / . \\  | |___   / ____ \\  | |___  | |___  | |__| | | |___   / ____ \\     | |    | |__| | | | \\ \\");
			System.out.println("     |_|    /_/    \\_\\ /_/ \\_\\  \\____| /_/    \\_\\ |_____|  \\____|  \\____/  |_____| /_/    \\_\\    |_|     \\____/  |_|  \\_\\");
			System.out.println("\n\n============================================================================================================================");
			System.out.println("\n\n\n\t[1] Withholding Tax ");
			System.out.println("\n\t[2] Payable Tax ");
			System.out.println("\n\t[3] Income Tax ");
			System.out.println("\n\t[4] Social Security Contribution Levy (SSCL) Tax ");
			System.out.println("\n\t[5] Leasing Payment ");
			System.out.println("\n\t[6] Exit ");

			System.out.print("\n\n  Enter an option to continue -> ");
			int option1  = input.nextInt();
			
			switch(option1){
				case 1 : 
					//withholding tax
					L2:while(true){
						clearConsole();
						
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("|\t\t\tWITHHOLDING TAX\t\t\t\t|");
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("\n\n\t[1] Rent Tax");
						System.out.println("\n\t[2] Bank Interest Tax");
						System.out.println("\n\t[3] Dividend Tax");
						System.out.println("\n\t[4] Exit");
						
						System.out.print("\n\n  Enter an option to continue -> ");
						int option2  = input.nextInt();
						
						switch(option2){
							case 1 :
								//rent tax
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\t\tRENT TAX\t\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
								
									System.out.print("\n\n  Enter your rent\t\t: ");
									double rent = input.nextDouble();
									
									if(rent >= 0){
										if(rent >= 100000){
											double rent_tax = (rent - 100000)*0.1;
											System.out.printf("\n  You have to pay Rent Tax\t: %.2f",rent_tax);
										}else{
											System.out.println("\n\tYou don't have to pay rent tax... ");
										}
										
										System.out.print("\n\n\nDo you want to calculate another Rent Tax (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
										
									}else{
										System.out.println("\n\tInvalid input...");
										
										System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
									}
								}
							case 2 :
								//bank interest tax
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\t\tBANK INTEREST TAX\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
								
									System.out.print("\n\n  Enter your bank interest per year\t\t: ");
									double interest = input.nextDouble();
									
									if(interest >= 0){
										double interest_tax = interest*0.05;
										System.out.printf("\n  You have to pay bank interest tax per year\t: %.2f",interest_tax);
										
										System.out.print("\n\n\nDo you want to calculate another Bank Interest Tax (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
										
									}else{
										System.out.println("\n\tInvalid input...");
										
										System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
									}
								}
							case 3 :
								//dividend tax
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\t\tDIVIDEND TAX\t\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
								
									System.out.print("\n\n  Enter your total dividend per year\t: ");
									double dividend = input.nextDouble();
									
									if(dividend >= 0){
										if(dividend >= 100000){
											double dividend_tax = (dividend - 100000)*0.14;
											System.out.printf("\n  You have to pay Dividend Tax per year\t: %.2f",dividend_tax);
										}else{
											System.out.println("\n\tYou don't have to pay Dividend Tax... ");
										}
										
										System.out.print("\n\n\nDo you want to calculate another Dividend Tax (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
										
									}else{
										System.out.println("\n\tInvalid input...");
										
										System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
										char choice = input.next().charAt(0);
										
										clearConsole();
										
										if(choice == 'Y' || choice == 'y'){
											continue L3;
										}else{
											continue L1;
										}
									}
								}
							case 4 :
								//exit
								clearConsole();
								continue L1;
							default : 
								//invalid option
								System.out.println("\tinvalid option... ");
								
								try {
									Thread.sleep(750); // Delay for 0.75 seconds
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								clearConsole();
						}
					}
				case 2 :
					//payable tax
					L2:while(true){
						clearConsole();
							
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("|\t\t\tPAYABLE TAX\t\t\t\t|");
						System.out.println("+---------------------------------------------------------------+");
						
						System.out.print("\n\n  Enter your employee payment per month\t: ");
						double salary = input.nextDouble();
						
						if(salary >= 0){
							
							double tax = 0;
							if(salary <= 100000){
								tax = 0;
							}else if(salary <= 141667){
								tax = (salary - 100000)*0.06;
							}else if(salary <= 183333){
								tax = 2500 + (salary - 141667)*0.12;
							}else if(salary <= 225000){
								tax = 7500 + (salary - 183333)*0.18;
							}else if(salary <= 266667){
								tax = 15000 + (salary - 225000)*0.24;
							}else if(salary <= 308333){
								tax = 25000 + (salary - 266667)*0.30;
							}else if(salary > 308333){
								tax = 37500 + (salary - 308333)*0.36;
							}
				
							double tax_round = Math.round(tax);
							
							if(tax_round == 0){
								System.out.println("\n\tYou don't have to pay Payable Tax... ");
							}else{
								System.out.printf("\n  You have to pay payable tax per month\t: %.2f",tax_round);
							}
							
							System.out.print("\n\n\nDo you want to calculate another Payable Tax (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L2;
							}else{
								continue L1;
							}
							
						}else{
							System.out.println("\n\tInvalid input...");
							
							System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L2;
							}else{
								continue L1;
							}
						}
					}
				case 3 :
					//income tax
					L2:while(true){
						clearConsole();
							
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("|\t\t\tINCOME TAX\t\t\t\t|");
						System.out.println("+---------------------------------------------------------------+");
						
						System.out.print("\n\n  Enter your total income per year\t: ");
						double income = input.nextDouble();
						
						if(income >= 0){
							
							double tax = 0;
							if(income <= 1200000){
								tax = 0;
							}else if(income <= 1700000){
								tax = (income - 1200000)*0.06; //30000
							}else if(income <= 2200000){
								tax = 30000 + (income - 1700000)*0.12; //60000
							}else if(income <= 2700000){
								tax = 90000 + (income - 2200000)*0.18; //90000
							}else if(income <= 3200000){
								tax = 180000 + (income - 2700000)*0.24; //120000
							}else if(income <= 3700000){
								tax = 300000 + (income - 3200000)*0.30; //150000
							}else if(income > 3700000){
								tax = 450000 + (income - 3700000)*0.36;
							}
				
							double tax_round = Math.round(tax);
							
							if(tax_round == 0){
								System.out.println("\n\tYou don't have to pay Income Tax... ");
							}else{
								System.out.printf("\n  You have to pay income tax per year\t: %.2f",tax_round);
							}
							
							System.out.print("\n\n\nDo you want to calculate another Income Tax (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L2;
							}else{
								continue L1;
							}
							
						}else{
							System.out.println("\n\tInvalid input...");
							
							System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L2;
							}else{
								continue L1;
							}
						}
					}
				case 4 :
					//Social Security Contribution Levy (SSCL) Tax
					L3:while(true){
						clearConsole();
			
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("|\tSOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX\t\t|");
						System.out.println("+---------------------------------------------------------------+");
					
						System.out.print("\n\n  Enter value of good or service\t: ");
						double value = input.nextDouble();
						
						if(value >= 0){
							
							double sale_tax = value*0.025;
							value = value + sale_tax;
							
							double VAT = value*0.15;
							
							double total_tax = sale_tax + VAT;
							
							System.out.printf("\n  You have to pay SSCL Tax\t\t: %.2f",total_tax);
							
							System.out.print("\n\n\nDo you want to calculate another SSCL Tax (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L3;
							}else{
								continue L1;
							}
							
						}else{
							System.out.println("\n\tInvalid input...");
							
							System.out.print("\n\n\nDo you want to enter the correct value again? (Y/N) : ");
							char choice = input.next().charAt(0);
							
							clearConsole();
							
							if(choice == 'Y' || choice == 'y'){
								continue L3;
							}else{
								continue L1;
							}
						}
					}
				case 5 : 
					//Leasing Payment
					L2:while(true){
						clearConsole();
						
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("|\t\t\tLeasing Payment\t\t\t\t|");
						System.out.println("+---------------------------------------------------------------+");
						System.out.println("\n\n\t[1] Calculate Monthly Installment");
						System.out.println("\n\t[2] Search Leasing Category");
						System.out.println("\n\t[3] Find Leasing Amount");
						System.out.println("\n\t[4] Exit");
						
						System.out.print("\n\n  Enter an option to continue -> ");
						int option3  = input.nextInt();
						
						switch(option3){
							case 1 :
								//Calculate Monthly Installment
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\tCalculate Monthly Installment\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
									
									System.out.print("\n\n  Enter lease amount\t\t: ");
									double lease_amount = input.nextDouble();
										
									while(lease_amount < 0){
										System.out.println("\n\tinvalid lease amount...Enter the correct value again...");
										
										System.out.print("\n\n  Enter lease amount\t\t: ");
										lease_amount = input.nextDouble();
									}
									
									System.out.print("\n  Enter annual interest rate\t: ");
									double annual_rate = input.nextDouble();
									
									while(annual_rate <= 0){
										System.out.println("\n\tinvalid interest rate...Enter the correct value again...");
										
										System.out.print("\n  Enter annual interest rate\t: ");
										annual_rate = input.nextDouble();
									}
									
									System.out.print("\n  Enter number of years\t\t: ");
									int years = input.nextInt();
									
									while(years > 5 || years <= 0){
										System.out.println("\n\tinvalid number of years...Enter the correct value again...");
										
										System.out.print("\n  Enter number of years\t\t: ");
										years = input.nextInt();
									}
									
									double monthly_rate = (double)annual_rate/(100*12);
									int months = years*12;
									
									double monthly_installment = (lease_amount*monthly_rate)/(1 - Math.pow((1 + monthly_rate), -months));
									
									System.out.printf("\n  Your monthly installment\t: %.2f",monthly_installment);
							
									System.out.print("\n\n\n\nDo you want to calculate another monthly installment (Y/N) : ");
									char choice = input.next().charAt(0);
									
									clearConsole();
									
									if(choice == 'Y' || choice == 'y'){
										continue L3;
									}else{
										continue L1;
									}
								}
							case 2 :
								//Search Leasing Category
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\tSearch Leasing Category\t\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
								
									System.out.print("\n\n  Enter lease amount\t\t: ");
									double lease_amount = input.nextDouble();
										
									while(lease_amount < 0){
										System.out.println("\n\tinvalid lease amount...Enter the correct value again...");
										
										System.out.print("\n\n  Enter lease amount\t\t: ");
										lease_amount = input.nextDouble();
									}
									
									System.out.print("\n  Enter annual interest rate\t: ");
									double annual_rate = input.nextDouble();
									
									while(annual_rate <= 0){
										System.out.println("\n\tinvalid interest rate...Enter the correct value again...");
										
										System.out.print("\n  Enter annual interest rate\t: ");
										annual_rate = input.nextDouble();
									}
									
									for(int years = 3; years <= 5; years++){
						
										double monthly_rate = (double)annual_rate/(100*12);
										double months = (double)years*12;
									
										double monthly_instllment = (lease_amount*monthly_rate)/(1 - Math.pow((1 + monthly_rate), -months));
										
										System.out.printf("\n  Your monthly installment for %d year leasing plan - %.2f",years ,monthly_instllment);
									}
									
									System.out.print("\n\n\n\nDo you want to calculate another leasing category (Y/N) : ");
									char choice = input.next().charAt(0);
									
									clearConsole();
									
									if(choice == 'Y' || choice == 'y'){
										continue L3;
									}else{
										continue L1;
									}
								}
							case 3 :
								//Find the Leasing Amount
								L3:while(true){
									clearConsole();
						
									System.out.println("+---------------------------------------------------------------+");
									System.out.println("|\t\t\tFind the Leasing Amount\t\t\t|");
									System.out.println("+---------------------------------------------------------------+");
									
									System.out.print("\n\n  Enter the monthly lease payment amount you can afford\t: ");
									double monthly_installment = input.nextDouble();
										
									while(monthly_installment < 0){
										System.out.println("\n\tinvalid monthly lease payment amount...Enter the correct value again...");
										
										System.out.print("\n\n  Enter the monthly lease payment amount you can afford\t: ");
										monthly_installment = input.nextDouble();
									}
									
									System.out.print("\n  Enter number of years\t\t\t\t\t: ");
									int years = input.nextInt();
									
									while(years > 5 || years <= 0){
										System.out.println("\n\tinvalid number of years...Enter the correct value again...");
										
										System.out.print("\n  Enter number of years\t\t\t\t\t: ");
										years = input.nextInt();
									}
									
									System.out.print("\n  Enter annual interest rate\t\t\t\t: ");
									double annual_rate = input.nextDouble();
									
									while(annual_rate <= 0){
										System.out.println("\n\tinvalid interest rate...Enter the correct value again...");
										
										System.out.print("\n  Enter annual interest rate\t\t\t\t: ");
										annual_rate = input.nextDouble();
									}
									
									double monthly_rate = (double)annual_rate/(100*12);
									int months = years*12;
									
									double max_lease_amount = Math.round(monthly_installment*(1 - Math.pow((1 + monthly_rate), -months))/monthly_rate);
									
									System.out.printf("\n  You can get lease amount\t\t\t\t: %.2f",max_lease_amount);
							
									System.out.print("\n\n\n\nDo you want to calculate another max lease amount (Y/N) : ");
									char choice = input.next().charAt(0);
									
									clearConsole();
									
									if(choice == 'Y' || choice == 'y'){
										continue L3;
									}else{
										continue L1;
									}
								}
							case 4:
								//exit
								clearConsole();
								continue L1;
							default :
								//invalid option
								System.out.println("\tinvalid option... ");
								
								try {
									Thread.sleep(750); // Delay for 0.75 seconds
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								clearConsole();
						}		
					}	
				case 6 :
					//exit
					return;
				default : 
					//invalid option
					System.out.println("\tinvalid option... ");
					
					try {
						Thread.sleep(750); // Delay for 0.75 seconds
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					clearConsole();
			}
		}	
	}
}
