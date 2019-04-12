package com.gwalior.android.zaika_e_gwalior.Data;

/**
 * Created by hp on 8/17/2017.
 */

public class Names {
    String[] abc=new String[10000];

    public String get_name(String x){
        abc[0]="Bahadur Sweets";
        abc[1]="Morena Gajak Bhandar";
        //.....TODO...

        if(x.equals("00"))
            return abc[0];
        else if(x.equals("01"))
            return abc[1];
        else
            return "";
    }
}
