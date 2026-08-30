package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;

@Canonical
class AudienceInsights {
    /* Category interest distribution */
    List<AudienceCategory> categories = new ArrayList<>()
    /* Generation date */
    String date
    
    AudienceDemographics demographics
    /* Population count. */
    Integer size
    /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    Boolean sizeIsUpperBound
    
    AudienceInsightType type
}
