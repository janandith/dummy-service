package com.gmail.janandith.dummyservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "ProductDetail", description = "Product details")
public final class ProductDetail implements Serializable {
    private ProductBrand productBrand;
    private ProductSubType productSubType;
    private boolean isToken;
    private CountryCode countryCode;
    private String portNumber;
}

