package com.gmail.janandith.dummyservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductSubType implements Serializable {
    private int id;
    private String name;
}