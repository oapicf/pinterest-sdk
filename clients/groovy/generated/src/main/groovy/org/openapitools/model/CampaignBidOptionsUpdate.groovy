package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.PlacementMultipliers;

@Canonical
class CampaignBidOptionsUpdate {
    
    AppTypeMultipliers appTypeMultipliers
    
    CampaignAudienceMultipliers audienceMultipliers
    
    PlacementMultipliers placementMultipliers

    enum UpdateMaskEnum {
    
        AUDIENCE("AUDIENCE"),
        
        APP_TYPE("APP_TYPE"),
        
        PLACEMENT("PLACEMENT"),
        
        GENDER("GENDER"),
        
        AGE_BUCKET("AGE_BUCKET")
    
        private final String value
    
        UpdateMaskEnum(String value) {
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

    /* List of fields to update, only the fields in the list will be updated. */
    List<UpdateMaskEnum> updateMask = new ArrayList<>()
}
