#include <iostream>
#include <string>
using namespace std;



void main(void)
{

	int choice,
		num1,
		num2,
		answer;

	char again;

	do {

		cout << "             *******************************" << endl;
		cout << "             *        1. Add (+)           *" << endl;
		cout << "             *        2. Subtract (-)      *" << endl;
		cout << "             *        3. Multiply (*)      *" << endl;
		cout << "             *        4. Divide (/)        *" << endl;
		cout << "             *        5. Mod(%)            *" << endl;
		cout << "             *******************************" << endl;

		cout << endl;

	
		cout << "Please choose what operation you would like to perform (1-5): ";
		cin >> choice;

		if (choice < 1 || choice > 5)
			
		{
			cout << "Invalid choice, please pick a number from 1-5" << endl << endl;
			break;
		}

		cout << endl;

	
		cout << "Please enter your first value: ";
		cin >> num1;

		cout << "Please enter your second value: ";
		cin >> num2;



		if (choice == 1)
		{
			answer = num1 + num2;
			cout << "Your sum is " << answer << endl << endl;
		}

		else if (choice == 2)
		{
			answer = num1 - num2;
			cout << "Your difference is " << answer << endl << endl;
		}

		else if (choice == 3)
		{
			answer = num1 * num2;
			cout << "Your product is " << answer << endl << endl;
		}

		else if (choice == 4)
		{
			answer = num1 / num2;
			cout << "Your quotient is " << answer << endl << endl;
		}
		else if (choice == 5)
		{
			answer = num1%num2;
			cout << "Your answer is " << answer << endl << endl;
		}





		cout << "Would you like to do more calculations? (y/n): ";
		cin >> again;

	} while (again == 'y' || again == 'Y');
	
	return;
}