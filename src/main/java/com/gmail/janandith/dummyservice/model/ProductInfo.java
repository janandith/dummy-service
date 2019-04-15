package com.gmail.janandith.dummyservice.model;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@ApiModel(value = "ProductInfo", description = "Product request details")
public final class ProductInfo implements Serializable {
    private String productPrefix;

    private ProductInfo() {
    }

    private ProductInfo(String productPrefix) {
        this.productPrefix = productPrefix;
    }

    @XmlElement(name = "productPrefix")
    public String getProductPrefix() {
        return productPrefix;
    }

    private void setProductPrefix(String productPrefix) {
        this.productPrefix = productPrefix;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductInfo{");
        sb.append("productPrefix='").append(productPrefix).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
