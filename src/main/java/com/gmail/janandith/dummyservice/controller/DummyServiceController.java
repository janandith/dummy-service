package com.gmail.janandith.dummyservice.controller;

import com.gmail.janandith.dummyservice.config.Configuration;
import com.gmail.janandith.dummyservice.model.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/service-details")
@Api("/api/v1/service-details")
public class DummyServiceController {

    private Logger logger = LoggerFactory.getLogger(DummyServiceController.class);
    private Configuration configuration;
    private Environment environment;

    @Autowired
    public DummyServiceController(Configuration configuration, Environment environment) {
        this.configuration = configuration;
        this.environment = environment;
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Find product details", notes = "Find for product details", response = ProductDetail.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK")
    })
    public ProductDetail checkProductDetails(@RequestBody ProductInfo productInfo) {
        logger.info("Getting product info from the dummy service: " + productInfo);
        return new ProductDetail();
    }
}
