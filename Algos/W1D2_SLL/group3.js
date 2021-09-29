class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    isEmpty() {
        if (this.head) {
            return false;
        } else {
            return true;
        }
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // add given node to the head, if it exists. return void
    // list is empty?
    // list already has nodes?
    addToFront(node) {
        let current_head = this.head // create a variable that holds the pointer
        node.next = current_head // node.next points to where temp pointer points
        this.head = node // take this.head and point it to node
        return this
    }
    // Thank you for the answerJ
    // create a new node with given data, add it to the head. return void
    addDataToFront(data) {
        return this.addToFront(new Node(data))
    }
}

// instantiate the SLL
var myList = new SLL();

// creating nodes
var myNode = new Node(11);

// executing methods:
myList.addToFront(myNode);
// myList.addToFront(new Node(11));