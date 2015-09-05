package jobdu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leosdaydream on 15/9/5.
 *
 * 题目描述：
 输入一个链表，从尾到头打印链表每个节点的值。
 输入：
 每个输入文件仅包含一组测试样例。
 每一组测试案例包含多行，每行一个大于0的整数，代表一个链表的节点。第一行是链表第一个节点的值，依次类推。当输入到-1时代表链表输入完毕。-1本身不属于链表。
 输出：
 对应每个测试案例，以从尾到头的顺序输出链表每个节点的值，每个值占一行。
 样例输入：
 1
 2
 3
 4
 5
 -1
 样例输出：
 5
 4
 3
 2
 1
 */

public class Jobdu5 {
    // 定义链表节点
//    public static class Node{
//        int value;
//        Node next;
//        public Node(int value){
//            this.value= value;
//        }
//
//    }
//    public static void main(String []args){
//
//        Scanner scanner = new Scanner(System.in);
//        Node head =null;
//        if (scanner.hasNext()){
//            head = new Node(scanner.nextInt());
//        }
//        Node temp = head;
//        while (scanner.hasNext()){
//            int a = scanner.nextInt();
//            if (a>0) {
//                temp.next = new Node(a);
//                temp = temp.next;
//            }else {
//
//                System.exit(0);
//            }
//        }
//        scanner.close();
//    }


    public static void main(String []args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(scanner.hasNext()) {
            int addint = scanner.nextInt();
            if (addint > 0) {
                arrayList.add(i++, addint);
            } else {
                for (int j=arrayList.size()-1;j>=0;j--) {
                    System.out.println(arrayList.get(j));
                }
            }
        }
    }
}
