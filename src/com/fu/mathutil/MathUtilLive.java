
package com.fu.mathutil;

public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);// hàm tính đi coi là mấy
        System.out.println("expected: 5! = 120; actual:" + result);
        // kỹ thuật kieeeemr thử phần mềm: ước lượng giá trị trả về của hàm là gì
        // expected value: 5! = 120
        // if expected = actual, hàm ngon trong tình huống này
        //MathUtil.getFactorial(-5); ném ngoại lệ thật rồi, ai biểu cà chớn 
        System.out.println("expected: 6! = 720; actual:"+ MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual:"+ MathUtil.getFactorial(0));
        
    }
    
}
