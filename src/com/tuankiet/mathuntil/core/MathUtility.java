/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuankiet.mathuntil.core;

/**
 *
 * @author tuank
 */
public class MathUtility {

    public static final double PI = 3.145;

    // hàm tính N! =  1 x 2 x 3 x 4 x ... x n
    // trong đó không có giai thừa âm
    // 0! = 1 quy ước 0! = 1
    // vì giai thừa tăng giá trị rất nhanh, 20! vừa đủ cho kiểu long, 18 số 0
    // 21! tràn kiểu LONG
    // quy ước hàm này chỉ tính từ 0 đến 20!
    /*
        có 2 cách viết hàm này: for truyền thống và đệ quy - recursion
     */
    public static final long getFactorial(long n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. must be between 0 to 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // biến khởi động cho tích nhân dồn

        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
