package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SharedAudienceAccount {
    /* Account ID (ad account or business ID). */
    String accountId
    /* Account name. */
    String accountName

    enum AccountTypeEnum {
    
        AD_ACCOUNT("AD_ACCOUNT"),
        
        BUSINESS_ACCOUNT("BUSINESS_ACCOUNT")
    
        private final String value
    
        AccountTypeEnum(String value) {
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

    /* account type */
    AccountTypeEnum accountType
    /* Epoch timestamp in seconds for the shared audience event */
    Integer sharedOnTimestamp
}
