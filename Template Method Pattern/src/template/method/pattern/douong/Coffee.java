/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template.method.pattern.douong;

/**
 *
 * @author Administrator
 */
public class Coffee extends DoUong{
    
    @Override
    protected void choNguyenLieuChinh() {
        System.out.println("Cho caffe vào");
    }

    @Override
    protected void choThemToppings() {
        System.out.println("Cho thêm đường sữa");
    }
}
