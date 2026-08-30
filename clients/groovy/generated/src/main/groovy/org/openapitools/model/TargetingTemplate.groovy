package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TargetingTemplateStatus;
import org.openapitools.model.TrackingUrls;

@Canonical
class TargetingTemplate {
    /* The ID of the advertiser that this targeting template belongs to. */
    String adAccountId
    /* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
    Boolean autoTargetingEnabled = true
    /* Targeting template created time. Unix timestamp in seconds. */
    Integer createdTime
    /* Targeting template ID. */
    String id
    
    List<TargetingTemplateKeyword> keywords = new ArrayList<>()
    /* targeting template name */
    String name
    
    PlacementGroupType placementGroup = PlacementGroupType.ALL
    
    TargetingTemplateAudienceSizing sizing
    /* Indicate targeting template is active or Deleted */
    TargetingTemplateStatus status
    /* targeting profile attributes */
    TargetingSpecOptimal targetingAttributes
    
    TrackingUrls trackingUrls
    /* Targeting template updated time.Unix timestamp in seconds. */
    Integer updatedTime
    /* Inform if the targeting template is valid (ex. would be false if has revoked audience) */
    Boolean valid
}
