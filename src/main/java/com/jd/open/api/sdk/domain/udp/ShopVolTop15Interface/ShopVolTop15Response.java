// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ShopVolTop15Response.java

package com.jd.open.api.sdk.domain.udp.ShopVolTop15Interface;

import java.io.Serializable;

public class ShopVolTop15Response
        implements Serializable {

    public ShopVolTop15Response() {
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProname() {
        return proname;
    }

    public void setRn(Integer rn) {
        this.rn = rn;
    }

    public Integer getRn() {
        return rn;
    }

    public void setSpuvolume(Integer spuvolume) {
        this.spuvolume = spuvolume;
    }

    public Integer getSpuvolume() {
        return spuvolume;
    }

    public void setSkuvolume(Integer skuvolume) {
        this.skuvolume = skuvolume;
    }

    public Integer getSkuvolume() {
        return skuvolume;
    }

    private Long wareId;
    private Long skuId;
    private String proname;
    private Integer rn;
    private Integer spuvolume;
    private Integer skuvolume;
}
