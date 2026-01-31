package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;

@Canonical
class TargetingTemplateCommon {
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    Boolean autoTargetingEnabled = true
    
    List<TargetingTemplateKeyword> keywords = new ArrayList<>()
    /* targeting template name */
    String name
    
    PlacementGroupType placementGroup = PlacementGroupType.ALL
    
    TargetingSpec targetingAttributes
    
    TrackingUrls trackingUrls
}
