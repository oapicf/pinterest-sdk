package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;

@Canonical
class TargetingTemplateCreate {
    /* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
    Boolean autoTargetingEnabled = true
    
    List<TargetingTemplateKeyword> keywords = new ArrayList<>()
    /* targeting template name */
    String name
    
    PlacementGroupType placementGroup = PlacementGroupType.ALL
    /* targeting profile attributes */
    TargetingSpecOptimal targetingAttributes
    
    TrackingUrls trackingUrls
}
