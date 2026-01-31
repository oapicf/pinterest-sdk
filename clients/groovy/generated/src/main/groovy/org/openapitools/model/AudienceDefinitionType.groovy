package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AudienceDefinitionType {

    enum ScopeEnum {
    
        IMPRESSION_PLUS_ENGAGEMENT("IMPRESSION_PLUS_ENGAGEMENT"),
        
        ENGAGEMENT("ENGAGEMENT")
    
        private final String value
    
        ScopeEnum(String value) {
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

    
    ScopeEnum scope
}
