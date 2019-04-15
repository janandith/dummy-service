package com.gmail.janandith.dummyservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class ProductBrand implements Serializable {
    private int id;
    private String name;
}
