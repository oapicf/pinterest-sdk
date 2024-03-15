package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UserWebsiteVerifyRequest {
    
    String website

    enum VerificationMethodEnum {
    
        FILENAME("FILENAME"),
        
        METATAG("METATAG"),
        
        DNSTXT("DNSTXT")
    
        private final String value
    
        VerificationMethodEnum(String value) {
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

    
    VerificationMethodEnum verificationMethod = VerificationMethodEnum.METATAG
}
