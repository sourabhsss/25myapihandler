package com.techyrh.sourabhupreti.myapi_hndler;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    public static VolleySingleton minstance;
    private RequestQueue mrequestQueue;

    public VolleySingleton(Context context) {
        mrequestQueue= Volley.newRequestQueue(context.getApplicationContext());
    }
    public static synchronized VolleySingleton getInstance(Context context){
        if(minstance==null){
        minstance=new VolleySingleton(context);
        }
        return minstance;
    }

    public RequestQueue getMrequestQueue() {
        return mrequestQueue;
    }
}
