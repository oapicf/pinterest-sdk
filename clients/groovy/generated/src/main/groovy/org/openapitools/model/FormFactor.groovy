package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum FormFactor {

    DESKTOP("desktop"),
    
    LAPTOP("laptop"),
    
    CELLPHONE("cellphone"),
    
    TABLET("tablet"),
    
    SMARTWATCH("smartwatch"),
    
    TV("tv"),
    
    VR("vr"),
    
    CONSOLE("console"),
    
    OTHER("other")

    private final String value

    FormFactor(String value) {
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
