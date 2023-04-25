The purpose of this project is to refactor the Queue class to embed the Node.

**Original:** 

Queue myQueue = new Queue(); myQueue.enqueue(New Node("first"));

**Refactored:** 

Queue myQueue = new Queue(); 

myQueue.enqueue("first");

or

myQueue.enqueue(1);

**Later...**

**Original:** Queue myQueue = new Queue();

myQueue.enqueue("first");

myQueue.enqueue(1);

**Refactored (using generics to bind the type):** 

Queue<String> myQueue = new Queue<String>();

myQueue.enqueue("first");

myQueue.enqueue(1); //Error