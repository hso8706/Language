import admin.AdminController;
import user.UserController;

import java.util.Scanner;

public class DeliveryApp_V1 {
    public static void main(String[] args) {
        AdminController adminInstance = null;
        UserController userInstance = null;

        Scanner sc = new Scanner(System.in);
        int userInput = -1;

        System.out.println("====================DeliveryApp_V1====================\n");
        System.out.println("[시스템] 접근 권한을 설정하십시오.");
        System.out.println("| 1. Admin | 2. User | 3. Exit |");
        exit: while(true){
            System.out.print("입력 : ");
            userInput = sc.nextInt();
            switch (userInput){
                case 1:
                    //TODO. Admin 권한 기능 호출
                    adminInstance = AdminController.getInstance();
                    adminInstance.inform();
                    break;
                case 2:
                    //TODO. User 권한 기능 호출
                    break;
                case 3:
                    System.out.println("[시스템] DeliveryApp_V1을 종료하겠습니다.");
                    break exit;
                default:
                    System.out.println("[시스템] 잘못된 입력입니다. 주어진 선택지 번호만을 입력하여 주십시오.");
                    break;
            }
        }



    }
}

