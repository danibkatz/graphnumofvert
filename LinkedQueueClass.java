
package graphproj;

public class LinkedQueueClass<T> implements QueueADT<T>
{
          //Definition of the node
    protected class QueueNode<T>
    {
        T info;
        QueueNode<T> link;

           //Default constructor
           //Postcondition: info = null; link = null;
        public QueueNode()
        {
            info = null;
            link = null;
        }

           //Constructor with parameters
           //Sets info point to the object elem points to
           //and link is set to point to the object ptr
           //points to.
           //Postcondition:  info = elem; link = ptr
        public QueueNode(T elem, QueueNode<T> ptr)
        {
            info = elem;
            link = ptr;
        }

           //Method to return the info as a string.
           //Postcondition: info as a String object is
           //               returned.
        public String toString()
        {
            return info.toString();
        }
    }


    private QueueNode<T> queueFront; //reference variable to
                                     //the first element of
                                     //the queue
    private QueueNode<T> queueRear;  //reference variable to
                                     //the last element of

        //Default constructor
    public LinkedQueueClass()
    {
  	queueFront = null;
		queueRear = null;
    }

        //Method to initialize the queue to an empty state.
        //Postcondition: queueFront = null; queueRear = null
    public void initializeQueue()
    {
        queueFront = null;
        queueRear = null;
    }

        //Method to determine whether the queue is empty.
        //Postcondition: Returns true if the queue is empty;
        //               otherwise, returns false.
    public boolean isEmptyQueue()
    {
        return (queueFront == null);
    }

        //Method to determine whether the queue is full.
        //Postcondition: Returns true if the queue is full;
        //               otherwise, returns false.
    public boolean isFullQueue()
    {
        return false;
    }

        //Method to return the first element of the queue.
        //Precondition: The queue exists and is not empty.
        //Postcondition: If the queue is empty, the method throws
        //               QueueUnderflowException; otherwise, a
        //               reference to a copy of the first element
        //               of the queue is returned.
    public T front() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        return queueFront.info;
    }

        //Method to return the last element of the queue.
        //Precondition: The queue exists and is not empty.
        //Postcondition: If the queue is empty, the method throws
        //               QueueUnderflowException; otherwise, a
        //               reference to a copy of the last element
        //               of the queue is returned.
    public T back() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        return queueRear.info;
    }

        //Method to add queueElement to the queue.
        //Precondition: The queue exists.
        //Postcondition: The queue is changed and queueElement
        //               is added to the queue.
    public void addQueue(T newElement)
    {
        QueueNode<T> newNode;

        newNode = new QueueNode<T>(newElement, null); //create
                                 //newNode and assign newElement
                                 //to newNode

        if (queueFront == null) //if initially the queue is empty
        {
            queueFront = newNode;
            queueRear = newNode;
        }
        else   //add newNode at the end
        {
            queueRear.link = newNode;
            queueRear = queueRear.link;
        }
     }//end addQueue


        //Method to remove the first element of the queue.
        //Precondition: The queue exists and is not empty.
        //Postcondition: The queue is changed and the first
        //               element is removed from the queue.
    public void deleteQueue() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        queueFront = queueFront.link; //advance queueFront

        if (queueFront == null)  //if after deletion the queue
            queueRear = null;  //is empty, set queueRear to null
    } //end deleteQueue
}
