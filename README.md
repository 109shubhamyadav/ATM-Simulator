# ATM Simulator

A simple Java console-based ATM machine simulation program.

## Features

- PIN-based authentication (default PIN: `1234`)
- Check account balance
- Withdraw money with balance validation
- User-friendly menu interface

## How to Use

1. Run the program.
2. Enter your 4-digit PIN (`1234` by default).
3. Choose from the menu:
    - Check balance
    - Withdraw money
    - Exit the program

## Code Overview

- The program stores an initial balance of ₹10,000.
- Users can withdraw money if the balance is sufficient.
- Invalid PIN or invalid menu options are handled with error messages.
- The program loops until the user selects the exit option.

