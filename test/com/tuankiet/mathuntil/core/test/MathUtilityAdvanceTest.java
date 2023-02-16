/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.tuankiet.mathuntil.core.test;

import com.tuankiet.mathuntil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author tuank
 */
@RunWith(value = Parameterized.class)
public class MathUtilityAdvanceTest {

    // chuẩn bị mảng 2 chiều để chứa các data trong các test case
    // tách thì phải có kĩ thuật nhồi data trở lại
    // fill trơ lại thông qua biến - biến chứa value đc thay đổi
    // quy ước mảng phải là static public.
    @Parameterized.Parameters
    public static Object[][] initData() {

        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }
    
    // map cùng cặp Data ở trên vào 2 biến, đầy 2 biến đẩy vào
    // hàm asertEquals() đã quen    
    @Parameterized.Parameter(value = 0) // lấy cột 0 của mảng gán vào
    public int n;
    
    @Parameterized.Parameter(value = 1)  //
    public long expected;

    // test
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
