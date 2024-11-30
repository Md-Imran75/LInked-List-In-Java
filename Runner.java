public class Runner {
  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(6);
    list.insert(7);
    list.insert(8);
    list.insertAtFirst(10);
    list.insertAtFirst(11);
    list.insertAtIndex(60, 3);
    list.insertAtIndex(50, 1);
    list.insertAtIndex(70, 0);
    list.removeAt(0);

    list.show();

  }
}