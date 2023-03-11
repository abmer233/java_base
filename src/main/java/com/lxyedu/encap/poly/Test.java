package com.lxyedu.encap.poly;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Test test = new Test();
//        test.showEmpAnnal();
        System.out.println("请输入要查找的员工");
        String worker = scanner.next();
        if (worker.equals("普通员工") || worker.equals("经理")) {
            Test test = new Test();
            test.showEmpAnnal();
        }
    }


        public void showEmpAnnal() {
            Employee[] e = new Employee[3];
            e[0] = new comWorker("吊人", 2500.0, 300.0);
            e[1] = new comWorker("牛逼", 33500.0, 500.0);
            e[2] = new Leader("啊帅", 50000.0, 5000, 63);
            for (int i = 0; i < 3; i++) {
                if (e[i] instanceof comWorker) {
                    comWorker c = (comWorker) e[i];

                    System.out.println("员工的工资为" + c.getAnnual());
                } else if (e[i] instanceof Leader) {
                    Leader leader = (Leader) e[i];
                    System.out.println("经理的工资为" + leader.getAnnual());
                }
            }
        }
    }

