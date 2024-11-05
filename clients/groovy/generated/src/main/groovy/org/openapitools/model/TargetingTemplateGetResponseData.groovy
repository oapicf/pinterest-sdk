package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;

@Canonical
class TargetingTemplateGetResponseData {
    /* targeting template name */
    String name
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    Boolean autoTargetingEnabled = true
    
    TargetingSpec targetingAttributes
    
    PlacementGroupType placementGroup = PlacementGroupType.ALL
    
    List<TargetingTemplateKeyword> keywords = new ArrayList<>()
    
    TrackingUrls trackingUrls
    /* Targeting template ID. */
    String id
    /* Targeting template created time. Unix timestamp in seconds. */
    Integer createdTime
    /* Targeting template updated time.Unix timestamp in seconds. */
    Integer updatedTime
    /* The ID of the advertiser that this targeting template belongs to. */
    String adAccountId

    enum StatusEnum {
    
        ACTIVE("ACTIVE"),
        
        DELETED("DELETED")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Indicate targeting template is active or Deleted */
    StatusEnum status = StatusEnum.ACTIVE
    
    TargetingTemplateAudienceSizing sizing
    /* Inform if the targeting template is valid (ex. would be false if has revoked audience) */
    Boolean valid
}
