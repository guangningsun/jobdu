package jobdu;

import java.util.Scanner;

/**
 * Created by leosdaydream on 15/9/5.
 * 题目描述：
 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 输入：
 输入可能包含多个测试样例，对于每个测试案例，
 输入的第一行为两个整数m和n(1<=m,n<=1000)：代表将要输入的矩阵的行数和列数。
 输入的第二行包括一个整数t(1<=t<=1000000)：代表要查找的数字。
 接下来的m行，每行有n个数，代表题目所给出的m行n列的矩阵(矩阵如题目描述所示，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 输出：
 对应每个测试案例，
 输出”Yes”代表在二维数组中找到了数字t。
 输出”No”代表在二维数组中没有找到数字t。
 样例输入：
 3 3
 5
 1 2 3
 4 5 6
 7 8 9
 3 3
 1
 2 3 4
 5 6 7
 8 9 10
 3 3
 12
 2 3 4
 5 6 7
 8 9 10
 样例输出：
 Yes
 No
 No
 */
public class Jobdu3 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int index = scanner.nextInt();
        int [] a = new int[i*j];
        // 生成二维数组
        for (int k=0; k<i*j;k++){
            a[k]=k+1;
        }
        int low = 0;
        int high = a.length-1;
        int flag =0;
        while (low<=high){
            int mid= (high+low)/2;
            if (a[mid]==index) {
                flag=1;
                break;
            }
            if(a[mid]>index){
                high = mid-1;
            }else if(a[mid]<index){
                low = mid+1;
            }
        }
        if (flag==1){
            System.out.println("YES");
        }else if(flag==0){
            System.out.println("NO");
        }
    }
}
