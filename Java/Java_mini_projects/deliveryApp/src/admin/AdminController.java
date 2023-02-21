package admin;

import api.Controller;
import database.AdminDatabase;
import store.Store;

import java.util.Scanner;

//싱글톤 패턴 사용
public class AdminController{

    private static AdminController instance = new AdminController();
    private int request;
    private static Scanner sc = new Scanner(System.in);

    private Store selectedStore;
    private AdminController() {
    }

    public static AdminController getInstance(){
        return instance;
    }
    //점포 안내 메세지
    public void inform(){
        System.out.println("[시스템] Admin 권한을 선택하셨습니다.");
        System.out.println("1. " + AdminDatabase.getStore(1).getName());
        System.out.println("2. " + AdminDatabase.getStore(2).getName());
        System.out.println("3. " + AdminDatabase.getStore(3).getName());
        System.out.print("입력 : ");
        int userInput = sc.nextInt();
        while(userInput < 0 || userInput > 3){
            System.out.println("잘못된 입력, 재입력 요망");
            System.out.print("입력 : ");
            userInput = sc.nextInt();
        }
        selectedStore = AdminDatabase.getStore(userInput);

        out: while(true){
            System.out.println("선택 점포 : " + selectedStore.getName());
            System.out.println("메뉴 정보");
            for (int i = 1; i <= 3; i++) {
                System.out.println((i) + ". 메뉴명 : " + selectedStore.getMenu(i).getName() + " || 가격 : " + selectedStore.getMenu(i).getPrice() + " || 재고 : " + selectedStore.getMenu(i).getStock() + " ||");
            }
            System.out.println("------------------------------------");
            System.out.println("옵션 선택\n1. 점포 이름 수정\n2. 메뉴 정보 수정\n3. 종료");

            System.out.print("옵션 입력 : ");
            switch (sc.nextInt()){
                case 1: updateStore();
                    break;
                case 2:
                    break;
                case 3:
                    break out;
                default:
                    System.out.println("Error");
                    break;
            }
        }

    }
    public void updateStore(){
        System.out.print("점포명 수정\n입력 : ");
        sc.nextLine();
        String newName = sc.nextLine();
        selectedStore.setName(newName);
        System.out.println(selectedStore.getName());
    }
    public void get(){}
    public void patch(){}
    public void delete(){}

    public void setRequest(int request) {
        this.request = request;
    }
}
