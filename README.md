#### Name: Salim Adamu Gambo
#### Matriculation No: U23ST1028
#### Department: Statistics
#### Github acc: [@saleeem04](https://github.com/saleeem04)
#### Calculator repo: [Swing Calculator](https://github.com/saleeem04/Swing-Calculator)
### 1. Overview 
##### The Java Swing Calculator is a simple GUI-based calculator application designed using Java's 
##### Swing framework. It allows users to perform basic arithmetic operations such as addition, 
##### subtraction, multiplication, division, exponentiation, and square root calculation. The 
##### application uses the JavaScript engine (via ScriptEngineManager) to evaluate mathematical 
##### expressions dynamically. 
### 2. What is Needed to Build the Program 
### Prerequisites: 
##### To build and run the Java Swing Calculator, you need the following: 
##### • Java Development Kit (JDK) 11 or later: To compile and run the Java program. 
##### • Integrated Development Environment (IDE): (Optional) IntelliJ IDEA, Eclipse, or 
##### NetBeans for a better development experience. 
##### • Text Editor: (Optional) Notepad++, VS Code, or any preferred editor. 
##### • Command Line/Terminal: To compile and execute the program if not using an IDE. 
### Required Libraries: 
##### • Java Swing (𝑗𝑎𝑣𝑎𝑥.𝑠𝑤𝑖𝑛𝑔.∗): For building the graphical user interface. 
##### • AWT (𝑗𝑎𝑣𝑎.𝑎𝑤𝑡.∗): For layout and event handling. 
##### • Java Scripting (𝑗𝑎𝑣𝑎𝑥.𝑠𝑐𝑟𝑖𝑝𝑡.∗): For evaluating mathematical expressions 
##### dynamically. 
### 3. Features: 
##### • Graphical User Interface (GUI) using Java Swing 
##### • Basic arithmetic operations: +,−,∗,/ 
##### • Exponentiation (^) 
##### • Square root calculation (√) 
##### • Parentheses for grouping expressions 
##### • Error handling for invalid input, division by zero, and unbalanced parentheses 
##### • Clear (𝐶) button to reset input 
### 4. How It Works: 
### User Interface; 
##### • A JTextField is used as a display to show the input and results. 
##### • A JPanel with a GridLayout(5,4,5,5) arranges the calculator buttons. 
##### • Buttons include digits (0-9), operators (+,−,∗,/,^), special functions (√, 𝐶, =), and 
##### parentheses ((, )). 
### Event Handling; 
##### • Implements ActionListener to handle button clicks. 
##### • When a button is clicked, its corresponding value is appended to the input string (StringBuilder). 
##### • The display updates dynamically to show the input. 
##### • Pressing = triggers expression evaluation. 
##### • Pressing 𝐶 clears the input. 
##### • Pressing √ calculates the square root of the current input. 
### Expression Evaluation; 
##### • The program utilizes the ScriptEngine from Java's ScriptEngineManager to evaluate mathematical expressions. 
##### • The ^ operator (exponentiation) is replaced with ** for compatibility with the 
### JavaScript engine; 
##### • Parentheses balance is checked before evaluation. 
##### • Errors such as division by zero, invalid expressions, and negative square roots are handled appropriately. 
### 5. Implementation Details: 
### Class Structure; 
##### p𝑢𝑏𝑙𝑖𝑐 𝑐𝑙𝑎𝑠𝑠 𝑆𝑤𝑖𝑛𝑔𝐶𝑎𝑙𝑐𝑢𝑙𝑎𝑡𝑜𝑟 𝑒𝑥𝑡𝑒𝑛𝑑𝑠 𝐽𝐹𝑟𝑎𝑚𝑒 𝑖𝑚𝑝𝑙𝑒𝑚𝑒𝑛𝑡𝑠 𝐴𝑐𝑡𝑖𝑜𝑛𝐿𝑖𝑠𝑡𝑒𝑛𝑒𝑟 
##### • Extends 𝐽𝐹𝑟𝑎𝑚𝑒 to create a Swing-based window. 
##### • Implements 𝐴𝑐𝑡𝑖𝑜𝑛𝐿𝑖𝑠𝑡𝑒𝑛𝑒𝑟 for handling button clicks. 
### Components; 
##### • Display (𝐽𝑇𝑒𝑥𝑡𝐹𝑖𝑒𝑙𝑑): Shows user input and results. 
##### • Buttons (𝐽𝐵𝑢𝑡𝑡𝑜𝑛): Contains numbers, operators, and function keys. 
##### • Panel (𝐽𝑃𝑎𝑛𝑒𝑙): Organizes buttons in a grid layout. 
### Key Methods; 
##### �𝑐𝑡𝑖𝑜𝑛𝑃𝑒𝑟𝑓𝑜𝑟𝑚𝑒𝑑(𝐴𝑐𝑡𝑖𝑜𝑛𝐸𝑣𝑒𝑛𝑡 𝑒) 
##### Handles button clicks by updating input, performing calculations, or handling errors. 
### E𝑣𝑎𝑙𝑢𝑎𝑡𝑒𝐸𝑥𝑝𝑟𝑒𝑠𝑠𝑖𝑜𝑛() 
##### • Replaces ^ with ∗∗ for JavaScript compatibility. 
##### • Checks for balanced parentheses. 
##### • Uses ScriptEngine to evaluate the expression. 
##### • Handles division by zero and invalid input errors. 
### ℎ𝑎𝑛𝑑𝑙𝑒𝑆𝑞𝑢𝑎𝑟𝑒𝑅𝑜𝑜𝑡() 
##### • Parses the current input as a number. 
##### • Computes the square root if the number is non-negative. 
##### • Displays an error message if the number is negative. 
### j𝑠𝑉𝑎𝑙𝑖𝑑𝐼𝑛𝑝𝑢𝑡(𝑆𝑡𝑟𝑖𝑛𝑔 𝑐𝑚𝑑) 
##### • Ensures operators are not added consecutively. 
##### • Allows numbers, parentheses, and valid operators. 
##### j𝑠𝐵𝑎𝑙𝑎𝑛𝑐𝑒𝑑(𝑆𝑡𝑟𝑖𝑛𝑔 𝑒𝑥𝑝𝑟𝑒𝑠𝑠𝑖𝑜𝑛) 
##### • Checks if parentheses in the expression are balanced. 
### 6. Error Handling 
##### • Invalid Expressions: Displays "Error: Invalid expression". 
##### • Division by Zero: Displays "Error: Division by zero". 
##### • Unbalanced Parentheses: Displays "Error: Unbalanced parentheses". 
##### • Negative Square Root: Displays "Error: Negative √". 
### 7. Execution 
##### To run the program, compile and execute the Java file: 
##### j𝑎𝑣𝑎𝑐 𝑆𝑤𝑖𝑛𝑔𝐶𝑎𝑙𝑐𝑢𝑙𝑎𝑡𝑜𝑟.𝑗𝑎𝑣𝑎 
##### j𝑎𝑣𝑎 𝑆𝑤𝑖𝑛𝑔𝐶𝑎𝑙𝑐𝑢𝑙𝑎𝑡𝑜𝑟 
##### Alternatively, execute it within an IDE like IntelliJ IDEA or Eclipse. 
##### This Java Swing Calculator demonstrates effective GUI design and event handling in Java. The use of ScriptEngine enables flexible mathematical expression evaluation, while error handling ensures robustness. It serves as a functional and extensible calculator application. 
