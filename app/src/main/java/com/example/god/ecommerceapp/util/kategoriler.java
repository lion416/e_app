package com.example.god.ecommerceapp.util;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import java.util.ArrayList;
import java.util.List;

@Root(name = "kategoriler")
public class kategoriler {
    @ElementList(inline = true)
    public List<kategori> imeList = new ArrayList<>();
}


//class kategori {
//    @Element(name = "kategori_aktif", data = false)
//    public kategori_aktif kategori_aktif;
//
//    @Element(name = "kategori_kod", data = false)
//    public kategori_kod kategori_kod;
//
//    @Element(name = "ust_kategori_kod", data = false)
//    public ust_kategori_kod ust_kategori_kod;
////
//    @Element(name = "kategori_ad", data = false)
//    public kategori_ad kategori_ad;
////
//    @Element(name = "kategori_path", data = false)
//    public kategori_path kategori_path;
//    @Element(name = "toplam_urun", data = false)
//    public toplam_urun toplam_urun;
//}
//
//class kategori_aktif {
//    @Text
//    public String text;
//}
//
//class kategori_kod {
//    @Text
//    public String text;
//}
//
//class ust_kategori_kod {
//    @Text
//    public String text;
//}
//
//class kategori_ad {
//    @Text
//    public String text;
//}
//
//class kategori_path {
//    @Text
//    public String text;
//}
//
//class  toplam_urun{
//    @Text
//    public String text;
//}