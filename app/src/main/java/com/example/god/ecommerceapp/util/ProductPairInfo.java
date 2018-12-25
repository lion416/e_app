package com.example.god.ecommerceapp.util;

public class ProductPairInfo {
    private ProductInfo m_product00;
    private ProductInfo m_product01;

    public ProductPairInfo(ProductInfo first_product, ProductInfo second_product) {
        m_product00  = first_product;
        m_product01 = second_product;
    }

    public ProductInfo getFirstProduct(){
        return m_product00;
    }

    public ProductInfo getSecondProduct(){
        return m_product01;
    }
}
