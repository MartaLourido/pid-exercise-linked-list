package se.sdaproject;


// a "box" in our previous picture
class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;

    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}


public class LinkedList {

    private Node first = null;

    public LinkedList() {
        super();
    }

    //Search operation

    public static int search(Node head, int x) {
        int index = 0;
        Node current = head;    //Initialize current
        while (current != null) {
            if ( current.elem == x ) {
                return index;//if we found the data we return the index of the element
            }
            index++;
            current = current.next;
        }

        return -1;
    }

    // Get index
    //The java.util.LinkedList.get(int index) method returns the element at the specified position in this list.

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if ( first == null ) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node

            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;


        }


    }


// Size operation

    public int get(int index) {
        int count = 0;
        Node current = first;
        //checking if we have 0 elements
        if ( index < 0 || first == null ) {
            //Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
            throw new IndexOutOfBoundsException("Checking that the linked list is empty");
        } else {

            //checking if we have more than 1 element and in this case link to the next node
            while (count < index) {
                current = current.next;
                count++;
            }  //in case we have at least 1 element we return the index given as a parameter
            return current.elem;
        }
    }


    // useful for testing!

    public int getSize(Node node) {
        //first we check if head is null
        if ( node == null ) {
            //if head is null we will return 0
            return 0;
        }
        // if it is not null we will pass the node of next + 1 to go to the next node
        return getSize(node.next) + 1;
    }

    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if ( first == null ) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

