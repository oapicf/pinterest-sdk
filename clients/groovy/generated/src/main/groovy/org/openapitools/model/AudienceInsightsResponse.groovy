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
class AudienceInsightsResponse {
    /* Category interest distribution */
    List<AudienceCategory> categories
    
    AudienceDemographics demographics
    
    AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE
    /* Generation date */
    String date
    /* Population count. */
    Integer size
    /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    Boolean sizeIsUpperBound
}
