// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TimeGetResponse.java

package com.jd.open.api.sdk.response.tools;

import com.jd.open.api.sdk.response.AbstractResponse;

public class TimeGetResponse extends AbstractResponse {

    public TimeGetResponse() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;
}
