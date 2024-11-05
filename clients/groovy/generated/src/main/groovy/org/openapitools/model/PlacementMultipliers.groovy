package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class PlacementMultipliers {

    enum PLACEMENTEnum {
    
        SEARCH("SEARCH"),
        
        BROWSE("BROWSE")
    
        private final String value
    
        PLACEMENTEnum(String value) {
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

    
    PLACEMENTEnum PLACEMENT
}
