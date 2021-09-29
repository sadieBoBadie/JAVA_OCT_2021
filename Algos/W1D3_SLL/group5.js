class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
            this.head = null;
        }
        // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(node) {
        node.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
    }

    // ---------------------------------
    // console log (print) the data of every node in the current list
    // traversal
    read() {
            var newNode = this.head;
            while (newNode.next) {
                console.log(newNode.data);
                newNode = newNode.next;
            }
        }
        //(1) --> (2) --> (3) --> null
        //head
        //newNode

    /*******************************************************************************
     *  def print_values(self):
            runner = self.head
            while (runner != None):
                print(runner.value)
                runner = runner.next  # set the runner to its neighbor
            return self  # once the loop is done, return self to allow for chaining
     *******************************************************************************/

    // find: return true / false if current list contains a data equal to value
    contains(value) {
        let runner = this.head
        while (runner) {
            if (runner.data == value) {
                return true
            }
            runner = runner.next
        }
        return false
    }



    // Remove from front: remove and return the first node in the SLL
    removeFromFront() {
        // this.head = this.head ? this.head.next : null
        let temp = this.head;

    }

    /*******************************************************************************
     * def remove_from_front(self):
        runner = self.head
        if runner.next == None:
            self.head = None
        else:
            self.head = runner.next
        return self  # return self to allow for chaining
     *******************************************************************************/
}

// ⚠ don't forget to instantiate the Singly Linked List
// instantiate the SLL
var myList = new SLL();

// creating nodes
var myNode = new Node(11);

// executing methods:
myList.addToFront(myNode);
myList.addToFront(new Node(22));
myList.addToFront(new Node(33));
myList.addToFront(new Node(44));
myList.read();
myList.contains();