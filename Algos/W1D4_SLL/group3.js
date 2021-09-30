class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
        this.total = 0;
    }

    // console log (print) the data of every node in the current list
    read() {
        var current = this.head; // set current as the head, if it exists or not
        while (current) { // if current, log and move to current.next
            console.log(current.data);
            current = current.next;
        }
    }

    // find: return true / false if current list contains a data equal to value
    contains(value) {
        // start at the head
        var runner = this.head;
        // while we have a runner
        while (runner) {
            // return true if data === value
            if (runner.data === value) {
                return true;
            }
            // otherwise advance the runner
            runner = runner.next;
        }
        // if the while loop completes, return false
        return false;
    }

    // Remove from front: remove and return the first node in the SLL
    removeFromFront() {
        if (this.isEmpty()) return null; // nothing to remove

        var removed = this.head; // save the head in a temp variable
        this.head = this.head.next; // move the head
        removed.next = null; // make removed no longer reference the list
        this.total--;
        return removed;
    }

    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(node) {
        node.next = this.head; // set the new node's next to the head
        this.head = node; // move the head to the new node
        this.total++;
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
        this.total++;
    }

    // if data is contained within the current list, delete it.
    // return void
    // assume there are no duplicates
    // consider the edge case if you have to delete the head node
    // consider the edge case your list is empty
    // consider the edge case that your list does not contain the data
    delete(data) {
            var runner = this.head;
            // while we have a runner
            if (runner.data === data) {
                this.removeFromFront()
            } else {
                while (runner.next) {
                    // return true if data === value
                    if (runner.next.data === data && runner.next.next === null) {
                        runner.next = null;
                        this.total--
                            return null;
                    } else if (runner.next.data === data) {
                        runner.next = runner.next.next
                        this.total--
                    }
                    runner = runner.next;
                }
            }
            // if the while loop completes, return null
            return null;
        }
        //(1)   -->   (2)    -->  (3)  --> null
        //head
        // r
        //date =1
        // return the size of the current linked list
        // BONUS: how might you do this without linearly traversing the list? O(1)
        // you may have to change other methods within this class... 
    size() {
        return this.total;
    }
}

var myList = new SLL();

var myNode1 = new Node(11);
var myNode2 = new Node(22);
var myNode3 = new Node(33);

myList.addToFront(myNode1);
myList.addToFront(myNode2);
myList.addToFront(myNode3);
console.log(myList.size())
myList.delete(11)
myList.contains(11)
myList.read()

    // Don't forget to instantiate the SLL!
    // and add a few nodes first!