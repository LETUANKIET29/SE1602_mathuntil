/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuankiet.mathuntil.main;

import com.tuankiet.mathuntil.core.MathUtility;

/**
 *
 * @author tuank
 */
public class Main {

    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentRunsWell();
    }

    // Thiết kế hàm getF() là: chỉ tính n! từ 0..20
    // nếu đưa n<0 hoặc n>20 THÌ HÀM SẼ KHÔNG TÍNH BẰNG CÁCH NÉM RA NGOẠI LỆ !!!
    // thực tế hàm getF() khi chạy có làm được như thực tế hay không thì phải chạy thử mới biết được
    public static void testFactorialGivenWrongArgumentRunsWell() {
        // Test case 4 test getF() with n = 5, wrong argument
        // expected value: an exception thrown IllegalArgumentException
        System.out.println("Test -5!: expected = Illegal Argument Exception is thrown");
        MathUtility.getFactorial(-5);
    }

    // kiểm thử xem dân dev phải có trách nhiệm test code của mình chạy đúng hay sai trước khi 
    // lắp ráp nó để hình thành
    // dùng để test hàm tính giai thừa
    /*
        trong tình huống test case đúng chuẩn, thì ta hy vọng expected
        hàm chạy ngon như thiết kế, ví dụ n = 5 thì hàm phải trả về 120, tức là 5! hy vọng hàm tính ra 120
     */
    public static void testFactorialGivenRightArgumentRunsWell() {
        // test case 1: Test getFactorial with n = 0, return 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + "! : expected =" + expectedValue + " actual: " + actualValue);

        // test case 2: test getFactoria() with n = 1
        // expected value = 1- hi vọng 1! app trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + " !: expected = " + expectedValue + "actual: " + actualValue);

        // TEST CASE 3 getfactorial(3)
        // expected value = 6!!
        n = 3;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + " !: expected = " + expectedValue + "actual: " + MathUtility.getFactorial(3));
    }
}
