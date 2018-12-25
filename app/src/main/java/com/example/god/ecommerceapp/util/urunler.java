//package com.example.god.ecommerceapp.util;
//
//import org.simpleframework.xml.Element;
//import org.simpleframework.xml.ElementList;
//import org.simpleframework.xml.Root;
//import org.simpleframework.xml.Text;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Root(name = "urunler")
//public class urunler {
//    @ElementList(inline = true)
//    public List<urun> imeList = new ArrayList<>();
//}
//class urun {
//    @Element(name = "urun_aktif", data = false)
//    public urun_aktif urun_aktif;
//    @Element(name = "urun_metaKeywords", data = false)
//    public urun_metaKeywords urun_metaKeywords;
//    @Element(name = "urun_metaDescription", data = false)
//    public urun_metaDescription urun_metaDescription;
//    @Element(name = "urun_url", data = false)
//    public urun_url urun_url;
//    @Element(name = "urun_ID", data = false)
//    public urun_ID urun_ID;
//    @Element(name = "urun_kod", data = false)
//    public urun_kod urun_kod;
//    @Element(name = "urun_gtin", data = false)
//    public urun_gtin urun_gtin;
//    @Element(name = "urun_xml_kod", data = false)
//    public urun_xml_kod urun_xml_kod;
//    @Element(name = "urun_ad", data = false)
//    public urun_ad urun_ad;
//    @Element(name = "urun_ana_kategori_kod_l4", data = false)
//    public urun_ana_kategori_kod_l4 urun_ana_kategori_kod_l4;
//    @Element(name = "urun_ana_kategori_ad_l4", data = false)
//    public urun_ana_kategori_ad_l4 urun_ana_kategori_ad_l4;
//    @Element(name = "urun_ana_kategori_kod_l3", data = false)
//    public urun_ana_kategori_kod_l3 urun_ana_kategori_kod_l3;
//    @Element(name = "urun_ana_kategori_ad_l3", data = false)
//    public urun_ana_kategori_ad_l3 urun_ana_kategori_ad_l3;
//    @Element(name = "urun_ana_kategori_kod_l2", data = false)
//    public urun_ana_kategori_kod_l2 urun_ana_kategori_kod_l2;
//    @Element(name = "urun_ana_kategori_ad_l2", data = false)
//    public urun_ana_kategori_ad_l2 urun_ana_kategori_ad_l2;
//    @Element(name = "urun_ana_kategori_kod", data = false)
//    public urun_ana_kategori_kod urun_ana_kategori_kod;
//    @Element(name = "urun_ana_kategori_ad", data = false)
//    public urun_ana_kategori_ad urun_ana_kategori_ad;
//    @Element(name = "urun_ust_kategori_kod", data = false)
//    public urun_ust_kategori_kod urun_ust_kategori_kod;
//    @Element(name = "urun_ust_kategori_ad", data = false)
//    public urun_ust_kategori_ad urun_ust_kategori_ad;
//    @Element(name = "urun_kategori_kod", data = false)
//    public urun_kategori_kod urun_kategori_kod;
//    @Element(name = "urun_kategori_ggkod", data = false)
//    public urun_kategori_ggkod urun_kategori_ggkod;
//    @Element(name = "urun_kategori_ad", data = false)
//    public urun_kategori_ad urun_kategori_ad;
//    @Element(name = "urun_marka_kod", data = false)
//    public urun_marka_kod urun_marka_kod;
//    @Element(name = "urun_marka_ad", data = false)
//    public urun_marka_ad urun_marka_ad;
//    @Element(name = "urun_varyasyonlari", data = false)
//    public urun_varyasyonlari urun_varyasyonlari;
//    @Element(name = "data1", data = false)
//    public data1 data1;
//    @Element(name = "data2", data = false)
//    public data2 data2;
//    @Element(name = "data3", data = false)
//    public data3 data3;
//    @Element(name = "data4", data = false)
//    public urun_kod data4;
//    @Element(name = "data5", data = false)
//    public data5 data5;
//    @Element(name = "urun_ucretsizKargo", data = false)
//    public urun_ucretsizKargo urun_ucretsizKargo;
//    @Element(name = "urun_tanim", data = false)
//    public urun_tanim urun_tanim;
//    @Element(name = "urun_aciklama", data = false)
//    public urun_aciklama urun_aciklama;
//    @Element(name = "urun_ozellikler", data = false)
//    public urun_ozellikler urun_ozellikler;
//    @Element(name = "urun_resim1", data = false)
//    public urun_resim1 urun_resim1;
//    @Element(name = "urun_resim2", data = false)
//    public urun_resim2 urun_resim2;
//    @Element(name = "urun_resim3", data = false)
//    public urun_resim3 urun_resim3;
//    @Element(name = "urun_resim4", data = false)
//    public urun_resim4 urun_resim4;
//    @Element(name = "urun_resim5", data = false)
//    public urun_resim5 urun_resim5;
//    @Element(name = "urun_fiyat", data = false)
//    public urun_fiyat urun_fiyat;
//    @Element(name = "urun_fiyat_TL", data = false)
//    public urun_fiyat_TL urun_fiyat_TL;
//    @Element(name = "urun_havale_fiyat_TL", data = false)
//    public urun_havale_fiyat_TL urun_havale_fiyat_TL;
//    @Element(name = "urun_fiyat_son_kullanici", data = false)
//    public urun_fiyat_son_kullanici urun_fiyat_son_kullanici;
//    @Element(name = "urun_fiyat_bayi_ozel", data = false)
//    public urun_fiyat_bayi_ozel urun_fiyat_bayi_ozel;
//    @Element(name = "urun_fiyat_site", data = false)
//    public urun_fiyat_site urun_fiyat_site;
//    @Element(name = "urun_fiyat_piyasa", data = false)
//    public urun_fiyat_piyasa urun_fiyat_piyasa;
//    @Element(name = "urun_doviz", data = false)
//    public urun_doviz urun_doviz;
//    @Element(name = "urun_kdv", data = false)
//    public urun_kdv urun_kdv;
//    @Element(name = "urun_stok", data = false)
//    public urun_stok urun_stok;
//    @Element(name = "urun_garanti", data = false)
//    public urun_garanti urun_garanti;
//
//}
//
//class urun_aktif {
//    @Text
//    public String text;
//}
//class urun_metaKeywords {
//    @Text
//    public String text;
//}
//class urun_metaDescription {
//    @Text
//    public String text;
//}
//class urun_url {
//    @Text
//    public String text;
//}
//class urun_ID {
//    @Text
//    public String text;
//}
//class urun_kod {
//    @Text
//    public String text;
//}
//class urun_gtin {
//    @Text
//    public String text;
//}
//class urun_xml_kod {
//    @Text
//    public String text;
//}
//class urun_ad {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_kod_l4 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_ad_l4 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_kod_l3 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_ad_l3 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_kod_l2 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_ad_l2 {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_kod {
//    @Text
//    public String text;
//}
//class urun_ana_kategori_ad {
//    @Text
//    public String text;
//}
//class urun_ust_kategori_kod {
//    @Text
//    public String text;
//}
//class urun_ust_kategori_ad {
//    @Text
//    public String text;
//}
//class urun_kategori_kod {
//    @Text
//    public String text;
//}
//class urun_kategori_ggkod {
//    @Text
//    public String text;
//}
//class urun_kategori_ad {
//    @Text
//    public String text;
//}
//class urun_marka_kod {
//    @Text
//    public String text;
//}
//class urun_marka_ad {
//    @Text
//    public String text;
//}
//class urun_varyasyonlari {
//    @Text
//    public String text;
//}
//class data1 {
//    @Text
//    public String text;
//}
//class data2 {
//    @Text
//    public String text;
//}
//class data3 {
//    @Text
//    public String text;
//}
//class data4 {
//    @Text
//    public String text;
//}
//class data5 {
//    @Text
//    public String text;
//}
//class urun_ucretsizKargo {
//    @Text
//    public String text;
//}
//class urun_tanim {
//    @Text
//    public String text;
//}
//class urun_aciklama {
//    @Text
//    public String text;
//}
//class urun_ozellikler {
//    @Text
//    public String text;
//}
//class urun_resim1 {
//    @Text
//    public String text;
//}
//class urun_resim2 {
//    @Text
//    public String text;
//}
//class urun_resim3 {
//    @Text
//    public String text;
//}
//class urun_resim4 {
//    @Text
//    public String text;
//}
//class urun_resim5 {
//    @Text
//    public String text;
//}
//class urun_fiyat {
//    @Text
//    public String text;
//}
//class urun_fiyat_TL {
//    @Text
//    public String text;
//}
//class urun_havale_fiyat_TL {
//    @Text
//    public String text;
//}
//class urun_fiyat_son_kullanici {
//    @Text
//    public String text;
//}
//class urun_fiyat_bayi_ozel {
//    @Text
//    public String text;
//}
//class urun_fiyat_site {
//    @Text
//    public String text;
//}
//class urun_fiyat_piyasa {
//    @Text
//    public String text;
//}
//class urun_doviz {
//    @Text
//    public String text;
//}
//class urun_kdv {
//    @Text
//    public String text;
//}
//class urun_stok {
//    @Text
//    public String text;
//}
//class urun_garanti {
//    @Text
//    public String text;
//}
//
