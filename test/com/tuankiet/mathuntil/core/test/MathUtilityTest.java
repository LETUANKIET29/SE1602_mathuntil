/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuankiet.mathuntil.core.test;

import com.tuankiet.mathuntil.core.MathUtility;
import java.text.NumberFormat;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author tuank
 */
public class MathUtilityTest {

    @Test(expected = Exception.class)    // dùng hàm này để đo xem nó có xuất hiện hay không
    
    public void testFactorialGivenWrongArgumentRunsWell(){
        // test case - 5           
        // expected result: An exception is thrown: Illegal Argument        
        // nếu chỉ gõ lệnh trên thì bị màu đỏ vì lệnh này gây ra exception và exception màu đỏ
        // nhưng hàm này mình kì vọng ra exception, nếu có exp
        // thì hàm đúng như thiết kê, đúng thiết kế thì phải xanh
        // lỗi của ta là không đo, không so sánh, chưa nhận
        // diện là đã có ngoại lệ rồi
        // thêm 1 lênh đã có ngoại lệ chưa, nếu có rồi ==> xanh
        // chưa ==> đỏ
        // Junit4 thì không dùng hàm assert để đo ngoại lệ
        // Junit 5 dùng hàm assert để đo ngoại lệ
        MathUtility.getFactorial(-5);
        
        
    }
    
    @Test
    // trong hàm này sẽ chứa các test case để test getF()
    public void testFactorialGivenRightArgumentRunsWell() {
        // Test case 1: test getF() with n = 0;
        //        expected result = 1; hi vọng bằng 1
        // static cho phép dùng "." trực tiếp
        int n = 0;
        long expectedValue = 1; // giá trị kì vọng
        long actualValue =  MathUtility.getFactorial(n);  // giá trị thực tế
        
        // assert: đo lượng, equals: so sánh, đánh giá
        Assert.assertEquals(expectedValue,actualValue); // expected: giá trị kì vọng, actual: thực tế
        
        // Test case 2: test getF() with n =5;
        // Expected result = 120; // xem thử máy có tính đúng như vậy không
        Assert.assertEquals(120,MathUtility.getFactorial(5));
        
        // Test case 3: getF() with n 6
        Assert.assertEquals(720,MathUtility.getFactorial(6));
        
        // Test case 4: getF() with n = 4, expected = 24
        Assert.assertEquals(24,MathUtility.getFactorial(4));
        
        /*  kiểm thử ngoại lệ
              Tức là hàm getF() được thiết kế rằng nếu đưa n cà chớn
        thì hàm phải ném ra ngoài ngoại lệ
        vd getF(-5) thì exception == ngoại lệ*/
    }
}
