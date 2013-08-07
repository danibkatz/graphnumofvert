
package graphproj;

public interface QueueADT<T>
{
    public void initializeQueue();
       //Method to initialize the queue to an empty state.

    public boolean isEmptyQueue();
       //Method to determine whether the queue is empty.
       //Postcondition: Returns true if the queue is empty;
       //               otherwise, returns false.

    public boolean isFullQueue();
       //Method to determine whether the queue is full.
       //Postcondition: Returns true if the queue is full;
       //               otherwise, returns false.

    public T front() throws QueueUnderflowException;
       //Method to return the first element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: If the queue is empty, the method throws
       //               QueueUnderflowException; otherwise, a
       //               reference to the first element of the
       //               queue is returned.

    public T back() throws QueueUnderflowException;
       //Method to return the last element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: If the queue is empty, the method throws
       //               QueueUnderflowException; otherwise, a
       //               reference to the last element of the
       //               queue is returned.

    public void addQueue(T queueElement)
                            throws QueueOverflowException;
       //Method to add queueElement to the queue.
       //Precondition: The queue exists and is not full.
       //Postcondition: The queue is changed and queueElement
       //               is added to the queue.

    public void deleteQueue() throws QueueUnderflowException;
       //Method to remove the first element of the queue.
       //Precondition: The queue exists and is not empty.
       //Postcondition: The queue is changed and the first
       //               element is removed from the queue.
}



