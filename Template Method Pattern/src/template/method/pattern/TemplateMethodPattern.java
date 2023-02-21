/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template.method.pattern;

import template.method.pattern.douong.Coffee;
import template.method.pattern.douong.DoUong;
import template.method.pattern.douong.Tea;

/**
 *
 * @author Administrator
 */
public class TemplateMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Đóng gói các phương thức chung và bảo "
                + "vệ quy trình của lớp abstract, nhưng vẫn\n giữ tính "
                + "linh hoạt bằng cách cho sự quyết định các method riêng "
                + "cho các lớp con\n như đổ caffe, đổ chè, cho đường sữa "
                + "thay vì cho lát chanh");
        
        System.out.println("==== Template Method Pattern ===");
     
        System.out.println("==== Make a Coffee ===");
        DoUong caffe = new Coffee();
        caffe.chuanBi();
        System.out.println("==== Make a Tea ===");
        DoUong tea = new Tea();
        tea.chuanBi();
        
        System.out.println("==== Template Method Pattern Sample End===");
    }
    
}
