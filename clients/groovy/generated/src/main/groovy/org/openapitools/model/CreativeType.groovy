package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CreativeType {

    REGULAR("REGULAR"),
    
    VIDEO("VIDEO"),
    
    SHOPPING("SHOPPING"),
    
    CAROUSEL("CAROUSEL"),
    
    MAX_VIDEO("MAX_VIDEO"),
    
    SHOP_THE_PIN("SHOP_THE_PIN"),
    
    COLLECTION("COLLECTION"),
    
    IDEA("IDEA"),
    
    SHOWCASE("SHOWCASE"),
    
    QUIZ("QUIZ"),
    
    COLLAGE("COLLAGE"),
    
    MAX_WIDTH_REGULAR_COLLECTION("MAX_WIDTH_REGULAR_COLLECTION"),
    
    MAX_WIDTH_VIDEO_COLLECTION("MAX_WIDTH_VIDEO_COLLECTION"),
    
    APP("APP")

    private final String value

    CreativeType(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
