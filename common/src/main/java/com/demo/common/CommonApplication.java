package com.demo.common;



import cn.hutool.core.date.DateUtil;
import io.netty.util.HashedWheelTimer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class CommonApplication {

    public static HashedWheelTimer hashedWheelTimer = new HashedWheelTimer(100, TimeUnit.MILLISECONDS);

    public static int countDigitOne(int n) {
        int res = 0;
        int digit = 1;
        int high =n/10;
        int low = 0;
        int cur = n%10;
        while (high != 0 || cur != 0){
            if(cur == 0){
                res = high*digit+ res;
            }else if(cur==1){
                res = res + high*digit+low+1;
            }else {
                res = res + (high+1)*digit;
            }

            low = low+cur*digit;
            cur = high % 10;
            digit = digit*10;
            high = high /10;
        }
        return res;
    }


    public static int findNthDigit(int n) {
        long digit = 1;
        long i = 0;
        long p = (digit - digit/10)*i;
        while (n -p > 0){
            n = (int) (n-p);
            digit = digit*10;
            i++;
            p = (digit - digit/10)*i;
        }

        digit = digit /10;
        if(n ==0){
            String s = String.valueOf(digit-1);
            char c = s.charAt(s.length()-1);
            System.out.println(c-'0');
            return c-'0';
        }


        long pos = n%i;

        if(pos ==0){
            long num = -1+digit + n/(i);
            String s = String.valueOf(num);
            char c = s.charAt(s.length()-1);
            System.out.println(c-'0');
            return c-'0';
        }else {
            long num = digit + n/(i);
            String s = String.valueOf(num);
            char c = s.charAt((int) (pos-1));
            System.out.println(c-'0');
            return c-'0';
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }


}