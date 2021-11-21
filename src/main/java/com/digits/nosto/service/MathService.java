package com.digits.nosto.service;

import com.digits.nosto.model.MathModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class MathService {
        public static MathModel mathModel = new MathModel() ;

        public static MathModel GetBiggerNumberService(String number) {
        char a[]=number.toCharArray();
        int i, n=a.length;
        String result = null;

        for(i=n-1; i>0; i--){
            if(a[i-1] < a[i])
                break;
        }

        if(i==0){
            for(i=0; i<n; i++)
                result = "No answer";
        }
        else {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i - 1] && a[j] < a[min]) {
                    min = j;
                }
            }

            char temp = a[i - 1];
            a[i - 1] = a[min];
            a[min] = temp;

            Arrays.sort(a, i, n);
            result =  String.valueOf(a);
        }
        mathModel.setNumber(result);
        return mathModel;
    }
}
