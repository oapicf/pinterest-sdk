package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PinMediaSourcePinURL {

    enum SourceTypeEnum {
    
        PIN_URL("pin_url")
    
        private final String value
    
        SourceTypeEnum(String value) {
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

    
    SourceTypeEnum sourceType
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    Boolean isAffiliateLink = false
}
