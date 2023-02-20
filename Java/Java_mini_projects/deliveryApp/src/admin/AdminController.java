package admin;

import api.Controller;

//싱글톤 패턴 사용
public class AdminController implements Controller {
    private static AdminController instance = new AdminController();
    private int request;

    private AdminController() {
    }

    public AdminController getInstance(){
        return instance;
    }
    //점포 안내 메세지
    @Override
    public void inform(){
        System.out.println();
    }
    @Override
    public void post(){}
    @Override
    public void get(){}
    @Override
    public void patch(){}
    @Override
    public void delete(){}

    public void setRequest(int request) {
        this.request = request;
    }
}
