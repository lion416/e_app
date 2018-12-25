package com.example.god.ecommerceapp.util;

public class ProductInfo {
    private String m_urun_aktif;
    private String m_urun_ID;
    private String m_urun_resim1;

    public ProductInfo(String urun_aktif, String urun_ID, String urun_resim1)
    {
        m_urun_aktif = urun_aktif;
        m_urun_ID = urun_ID;
        m_urun_resim1 = urun_resim1;
    }

    public String getUrl(){
        return m_urun_resim1;
    }
}
