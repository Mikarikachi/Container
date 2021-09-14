package com.company;

/* Создать класс контейнер, позволяющий хранить произвольное количество объектов.
 Задание можно реализовать с помощью связанного списка.
 Контейнер должен позволять добавлять, извлекать, удалять элементы*/
public class Container {

    private Node head;
    private int size;

    public void filling(Object ob) {
        size++;
        Node temp = new Node(ob);
        if (head == null) {
            head = temp;
            return;
        }
        Node counter = head;
        while (counter.next != null) {
            counter = counter.next;
        }
        counter.next = temp;
    }

    public Object getByIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.out.println("Индекс лежит за пределами допустимых границ");
            return -1;
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.value;
    }

    public void deleteByIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.out.println("Индекс лежит за пределами допустимых границ");
            return;
        }
        size--;
        Node result1 = head;
        if (index == 0) {
            head = head.next;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            result1 = result1.next;
        }
        if (result1.next.next == null) {
            result1.next = null;
        } else {
            result1.next = result1.next.next;
        }
    }


}
