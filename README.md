# BCSE103E-ASSIGNMENT-6-SUBMISSION--01-10-24

23BAI1564 BCSE103E ASSIGNEMENT WORD FILE SUBMISSION @VIT CC FACULTY: RAJIV VINCENT

**Exercises for Lab on 30-9-24** 



|**Title**  |**Computing Area of Different Shapes** |
| - | - |
|**Description** |<p>The area is the two-dimensional amount of space that an object occupies. Area is measured along the surface of an object and has dimensions of length squared; for example, square feet of material, or centimetres squared. The area of a rectangle is equal to the height h times the base b; A = h \* b The equation for the area of a trapezoid is one half the sum of the top t and bottom b times the height h; A = h \* [ t + b ] / 2 The area of a circle is A = pi \* r2, where pi = 3.14 and r = radius. Develop a program using Java using method overloading for computing the area of a rectangle, a trapezoid and a circle by a common function name ComputeArea() with different signature. Assume pi = 3.14. Print only two decimal places for all areas. </p><p>Note: </p><p>**Input Format:** </p><p>Read the base and height of a rectangle. </p><p>Read the top, bottom and height of a trapezoid. Read the radius of a circle. </p><p>**Output Format:** </p><p>Display the area of a rectangle, trapezoid and circle each in one line </p><p>**Boundary Conditions:** </p><p>You can give any valid integer or float values for inputs. </p>|
|**Test Cases Input** |**5   4 4  4  4 4** |
|**Test Cases Expected Output** |**20.00 16.00 50.24** |
|**Test Cases Input** |**10 5 5** |



||**3 8 5** |
| :- | - |
|**Test Cases Expected Output** |**50.00 32.00 78.50** |
|**Hidden Test Cases Input** |**8 4 4 2 6 3** |
|**Hidden Test Cases Expected Output** |**32.00 18.00 28.26** |



|**Title**  |**Black Coin in Board game** |
| - | - |
|**Description** |<p>Colored  coin  game  is a  8X8 board  game  which  has  many colored coins. Each coin has a weight and power. Power of a coin is defined by the moves that it can make. In a move,  a black coin can move one step vertically upwards.  A red coin can  move  one  step  either  horizontally,  vertically  or diagonally. Given the current position of a black coin and list of movements made by it, print all possible next positions of the coin. If the total number of moves made by a black coin is greater than 6, then that coin should be treated as a red coin and the subsequent moves will be as that of the red coin. At any point of time, the coin cannot move outside the board. The rows and columns of the board are numbered as 1 to 8. Print the  horizontal  movement  of  coin  in  an  increasing order of columns and print the vertical movement of coin in increasing order of rows. To print, the diagonal movement of the coin. If the current position of your coin is 4,4 then print P1, P2 ... P8 in order.. </p><p>**Input Format** </p><p>Weight of black coin </p><p>Current row position of coin </p><p>Current column position of coin Number of moves made by black coin **Output Format** </p><p>Weight of black coin </p><p>List of possible next positions </p><p>One position in a line with row and column separated by a comma </p>|
|**Test Cases Input** |**1** |



||**2 2 3** |
| :- | - |
|**Test Cases Expected Output** |**1 2,3** |
|**Test Cases Input** |**3 2 3 7** |
|**Test Cases Expected Output** |**3 1,3 3,3 2,2 2,4 1,2 3,2 1,4 3,4** |
|**Hidden Test Cases Input** |**2 7 5 3** |
|**Hidden Test Cases Expected Output** |**2 7,6** |



|**Description** |<p>Pizza is a delicious circular food item that is a favorite for many people. Given the radius of the pizza, ingredients required for the preparation of the pizza, per square cm (cm2) area of the pizza and cost of its ingredients per 100 grams, design an OOP model and write a Java program to calculate the cost of the pizza. Add Rs 50 for veg pizza and Rs 100 for chicken pizza. Use 3.14 for pi. Your program should  get all the ingredients available in the kitchen with their cost per 100 grams, as an input.  Assume that all the ingredients required for the preparation of the pizza is available in the kitchen. </p><p>**Input Format** </p><p>Give 0 for veg pizza and 1 for chicken pizza </p><p>Radius of pizza </p><p>Number of ingredients required for the preparation of the pizza Name of ingredient1 </p><p>Quantity of ingredient1 required (in grams) </p><p>Name of ingredient2 </p><p>Quantity of ingredient2 required </p><p>.... </p><p>Name of ingredient-n </p><p>Quantity of ingredient-n required </p><p>Number of ingredients available in the kitchen. Name of ingredient-1 available in the kitchen </p>|
| - | - |



||<p>Cost of 100 gm of ingredient1 available in kitchen Name of ingredient-2 in kitchen </p><p>Cost of 100 gm of ingredient2 in kitchen </p><p>.... </p><p>Name of ingredient-n in kitchen </p><p>Cost of 100 gm of ingredient-n in kitchen </p><p>**Output Format** Cost of pizza </p>|
| :- | :- |



|**Test Cases Input** |<p>**0** </p><p>**5** </p><p>**2 abc 50 def 200 2 abc 50 def** </p><p>**40** </p>|
| - | - |
|**Test Cases Expected Output** |**8292.50** |
|**Test Cases Input** |<p>**1** </p><p>**5** </p><p>**2 abc 50 def 200 2 abc 50 def 40** </p>|
|**Test Cases Expected Output** |**8342.50** |
|**Hidden Test Cases Input** |<p>**0** </p><p>**5** </p><p>**3 abc 50 def 20 efg 75 3 efg 30 abc 50 def** </p><p>**40** </p>|
|**Hidden Test Cases Expected Output** |**4406.75** |
|**Hidden Test Cases Input** |**1 5** |



||**3 abc 50 def 20 efg 75 3 efg 30 abc 50 def 40** |
| :- | :- |
|**Hidden Test Cases Expected Output** |**4456.75** |
