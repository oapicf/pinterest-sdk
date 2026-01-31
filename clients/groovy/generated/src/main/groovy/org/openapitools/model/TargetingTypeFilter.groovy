package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TargetingTypeFilter {

    enum TargetingTypesEnum {
    
        KEYWORD("KEYWORD"),
        
        APPTYPE("APPTYPE"),
        
        GENDER("GENDER"),
        
        LOCATION("LOCATION"),
        
        PLACEMENT("PLACEMENT"),
        
        COUNTRY("COUNTRY"),
        
        TARGETED_INTEREST("TARGETED_INTEREST"),
        
        PINNER_INTEREST("PINNER_INTEREST"),
        
        AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
        
        GEO("GEO"),
        
        AGE_BUCKET("AGE_BUCKET"),
        
        REGION("REGION"),
        
        MEDIA_TYPE("MEDIA_TYPE"),
        
        AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
        
        AUDIENCE_MULTIPLIER("AUDIENCE_MULTIPLIER"),
        
        CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS"),
        
        LOCAL_ADS_STORE_CODE("LOCAL_ADS_STORE_CODE")
    
        private final String value
    
        TargetingTypesEnum(String value) {
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

    /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
    List<TargetingTypesEnum> targetingTypes = new ArrayList<>()
}
