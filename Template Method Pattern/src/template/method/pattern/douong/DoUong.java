/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method.pattern.douong;

/**
 *
 * @author Administrator
 */
public abstract class DoUong {
    
    // Dùng final để bảo vệ method tránh cho lớp con sửa quy trình này
    public final void chuanBi(){
        dunNuoc();
        choNguyenLieuChinh();
        doRaCoc();
        choThemToppings();
    }
    
    // Tối ưu sử dụng lại code của các lớp con dùng chung 1 method
    protected void dunNuoc(){
        System.out.println("Đun nước");
    }
    protected void doRaCoc(){
        System.out.println("Đổ ra cốc");
    }
    
    // Giữ lại method riêng cho class con tự quyết định
    protected abstract void choNguyenLieuChinh();
    protected abstract void choThemToppings();
}
