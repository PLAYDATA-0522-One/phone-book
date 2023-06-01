package controller;

import service.Service;

import java.util.Scanner;

public class Controller {
    private Scanner sc;
    private Service service;

    public Controller(Scanner sc) {
        this.sc = sc;
        this.service = Service.getInstance();
    }

    public void selectMode() {
        System.out.println("1. 전화번호 정보 입력 2.전화번호 정보 찾기 3. 특정 정보가 포함된 정보 찾기 4. 전화번호 정보 업데이트 5.전화번호 정보 삭제 6. 전화번호부 출력");
        int mode;
        try {
            mode = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            mode = 0;
        }
        if (mode == 1) {
            // TODO: insert 기능 만들 것
            System.out.println("새로운 전화번호 입력 >>");
            String  number = sc.nextLine();
            System.out.println("새로운 지역 입력 >>");
            String region = sc.nextLine();
            System.out.println("새로운 이름 입력 >>");
            String name = sc.nextLine();
            System.out.println("새로운 성별 입력 >>");
            String sex = sc.nextLine();
            service.insert(number, region, name, sex);

        } else if (mode == 2) {
            // TODO : find 기능 만들 것
            System.out.println("찾을 전화번호 입력 >>");
            String  number = sc.nextLine();
            service.find(number);
        } else if (mode == 3) {
            // TODO : filter 기능 만들 것
            System.out.println("특정 정보 입력 >> ");
            String str = sc.nextLine();
            service.filter(str);

        } else if (mode == 4) {
//            TODO: update 기능 만들 것
            System.out.println("변경할 전화번호 입력 >>");
            String  number = sc.nextLine();
            System.out.println("수정할 지역 입력 >>");
            String region = sc.nextLine();
            System.out.println("수정할 이름 입력 >>");
            String name = sc.nextLine();
            System.out.println("수정할 성별 입력 >>");
            String sex = sc.nextLine();
            service.update(number, region, name, sex);
        }
        else if (mode == 5) {
//            TODO: delete 기능 만들 것
            System.out.println("삭제할 전화번호 입력 >>");
            String  number = sc.nextLine();
            service.delete(number);
        }
        else if (mode == 6) {
            service.findAll();
        }
    }


}
