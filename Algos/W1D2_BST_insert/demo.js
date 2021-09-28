// // W1D2

// var n1 = {
//     value: 11,
//     next: null 
// }
// var n2 = {
//     value: 22,
//     next: null 
// }
// var n3 = {
//     value: 33,
//     next: null 
// }

// n1.next = n2;
// n1.next = n3
// console.log(n1);
// n2.next = n3;

class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    // methods
    isEmpty() {
        if (this.head) {
            return true;
        } else {
            return false;
        }
    }

    addToFront(node) {
        // make head point to node 
        // ...
        this.head = node;
    }
 }

var myCoolList = new SLL();
console.log(myCoolList);

// var coolNode = new Node(22)

myCoolList.addDataToFront(new Node(22));


// var n1 = new Node(11);


// n1.next = new Node(22);
// n1.next.next = new Node(33);



