package bridgelabz;

public class MyHashMap<T extends Comparable<T>, V> {
    MyLinkedList<T> myLinkedList;

    public MyHashMap() {
        myLinkedList = new MyLinkedList();
    }

    public V get(T key) {
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkedList.searchNode(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(T key, V value) {
        MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkedList.searchNode(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.addLast(myMapNode);
        } else {
            myMapNode.setValue(value);
        }

    }
}
