package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdGroupAudienceSizingRequestKeywordsInner;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;

@Canonical
class AdGroupAudienceSizingRequest {
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    Boolean autoTargetingEnabled = true
    /* <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>. */
    PlacementGroupType placementGroup = "ALL"

    enum CreativeTypesEnum {
    
        REGULAR("REGULAR"),
        
        VIDEO("VIDEO"),
        
        SHOPPING("SHOPPING"),
        
        CAROUSEL("CAROUSEL"),
        
        MAX_VIDEO("MAX_VIDEO"),
        
        SHOP_THE_PIN("SHOP_THE_PIN"),
        
        COLLECTION("COLLECTION"),
        
        IDEA("IDEA")
    
        private final String value
    
        CreativeTypesEnum(String value) {
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

    /* Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
    List<CreativeTypesEnum> creativeTypes
    
    TargetingSpec targetingSpec
    /* Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
    List<String> productGroupIds
    /* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
    List<AdGroupAudienceSizingRequestKeywordsInner> keywords
}
