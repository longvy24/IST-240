# Long Vy
# Simple Calculator program
# Choose operation (+,-,/,*)
# Enter two results
# Display answer
# Figure out why "raw_input didn't work on school computers"

while True:
    print("")
    print("    *********************************************      ")
    print("    *               1. Add (+)                  *      ")
    print("    *               2. Subtract (-)             *      ")
    print("    *               3. Multiply (*)             *      ")
    print("    *               4. Divide (/)               *      ")
    print("    *********************************************      ")
    print("")

    choice = (input("Please choose what operation you would like to perform: "))

    if choice == '1':
        num1 = int(input("Please enter your first number: "))
        num2 = int(input("Please enter your second number: "))
        answer = num1+num2   
        print ("Your answer is: " + str(answer))
        print("")

    elif choice == '2':
        num1 = int(input("Please enter your first number: "))
        num2 = int(input("Please enter your second number: "))
        answer = num1-num2 
        print ("Your answer is: " + str(answer))
        print("")
        
    elif choice == '3':
        num1 = int(input("Please enter your first number: "))
        num2 = int(input("Please enter your second number: "))
        answer = num1*num2 
        print ("Your answer is: " + str(answer))
        print("")

    elif choice == '4':
        num1 = int(input("Please enter your first number: "))
        num2 = int(input("Please enter your second number: "))
        answer = num1/num2 
        print ("Your answer is: " + str(answer))
        print("")
        
    else:
        print("Invalid choice, please pick an option between 1-4.")
        print("")

    i = input("Would you like to compute again?: ")

    if(i != 'y'):
            break

