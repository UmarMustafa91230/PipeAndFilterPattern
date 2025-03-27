# Pipe and Filter Pattern in Java

## Overview
This project demonstrates the **Pipe and Filter** pattern in Java, where multiple filters are applied to a list of numbers independently. Each filter extracts numbers based on a specific condition, ensuring that the output is meaningful and correct.

## Features
- Filters numbers based on different conditions:
  - Even numbers
  - Odd numbers
  - Prime numbers
  - Multiples of 5
- Uses **Java Streams** for efficient filtering.
- Implements **functional programming** with lambda expressions and predicates.

## Code Explanation
The main logic consists of:
1. **applyFilter**: A generic method that applies a filter to the list.
2. **isPrime**: A helper function to check whether a number is prime.
3. **Main Method**:
   - Defines an input list of numbers.
   - Applies different filters to extract even, odd, prime, and multiples of 5.
   - Prints the filtered results.

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/pipe-and-filter-java.git
   ```
2. Navigate to the project folder:
   ```sh
   cd pipe-and-filter-java
   ```
3. Compile and run the Java file:
   ```sh
   javac PipeAndFilter.java
   java PipeAndFilter
   ```

## Expected Output
```
Even Numbers: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
Odd Numbers: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
Prime Numbers: [2, 3, 5, 7, 11, 13, 17, 19]
Multiples of 5: [5, 10, 15, 20]
```

## Contribution
Feel free to contribute by adding more filters or optimizing the code!

## License
This project is open-source and available under the MIT License.

