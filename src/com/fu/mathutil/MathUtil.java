/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
// ta viết cái class để cung cấp tiện ích cho nơi khác sài
// khi ta cung cấp tiện ích cho nơi khác sài đó là lúc ta không cần nhớ cái gì cho riêng ta
// hàm static giúp ta làm việc này
public class MathUtil {
    //n! = 1.2.3.4.5.6..n
    //quy ước : 0! =1 ! =1
    //không tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long
    // nếu đưa vào âm hay 21 giai thừa ta éo tính, ta đập vào mặt ai xài hàm 1 cái ngoại lệ
    // chửi , éo tính được
    public static long getFactorial(int n){
        if (n<0 || n>20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        // hàm dừng liền đéo cần return
        
        // xuống đây là n = 0..20 òi
        if ( n==0 || n==1)
            return 1;// dừng ngay khi n đặc biệt
        // xuống đén đây, n = 2..0 òi
        // chơi for hoặc đệ quy - recursion
        // kỹ thuật nhồi con heo đất, ốc bu dồn thịt
        // i = 2, i = 3, i =4.. i = n nhồi liên tục i vào tích
        long product =1; // tích khởi đầu abnwgf 1, nhồi 2,3,3,4,5..n
        for (int i = 2; i <= n; i++) 
            product *= i;
        //product = product đang có nhân con i, đạp ngược lại product
        // nhân từ 2 đến
        return product;
            
        
      
    }
}
