// Singly Linked Lists
// pass by value
var x = 10;
var y = x;

x += 30;
y += 10;

console.log(x); //? 40?
console.log(y); //? 20?
// -------------------
// pass by reference 
var a = [1,2,3,4];
var b = a;

a.push(10);
b.push(10);

console.log(a); //? [1,2,3,4,10,10]
console.log(b); //? [1,2,3,4,10,10]

// data types
// arrays
// objects
// functions

/* ---------------
 Class Car - blueprint
         - constructor
         -attributes - has (member variables)
            wheels
            color
            make
            doors
            model
            year

         -methods (functions) - actions
            turn on
            accelerate
            brake
            drive
            honk

Object? instance of a class
         new 

var tesla = new Car();

*/

var person = {
    name: "Raden",
    favFood: "steak"
}
// object literal 
var n1 = {
    value: 22,
    next: null
}
var n2 = {
    value: 33,
    next: null
}

n1.next = n2;
// n2.value = 2000;
console.log({n1}); 
