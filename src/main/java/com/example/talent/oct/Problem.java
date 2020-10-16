package com.example.talent.oct;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem {
    public int collect(int[] coins) {
//        System.out.println(Arrays.stream(dp)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining(",")));
            	int result = 0;
    	if(coins.length <= 1) {
        	return 0;
        }
        else if(coins.length == 2){
        	return coins[1];
        	
        }
        else if(coins.length == 3) {
        	return Math.max(coins[1],coins[2]);
        }
        else {
        	int a1 = coins[1];
            int a2 = coins[2];
            int a3 = coins[3] + a1;
            int p = -1;
        	
        	for(int i = 4;i < coins.length; i++) {
        		p = Math.max(a1,a2) + coins[i];
        		a1 = a2;
        		a2 = a3;
        		a3 = p;        		        	
        	}
        	result = Math.max( a2, a3);       	
        }
       
    	return result;
    }
}
