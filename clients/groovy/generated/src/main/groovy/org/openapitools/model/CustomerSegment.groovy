package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TargetingTemplateStatus;

@Canonical
class CustomerSegment {
    /* The ID of the ad account that this customer segment belongs to. */
    String adAccountId
    /* Audience IDs included in the customer segment. */
    List<String> audienceIds = new ArrayList<>()
    /* Customer segment created time. Unix timestamp in seconds. */
    Integer createdTime
    /* Customer segment ID. */
    String id
    /* Customer segment name. */
    String name
    /* Indicates whether the customer segment is active or deleted. */
    TargetingTemplateStatus status
    /* Customer segment updated time. Unix timestamp in seconds. */
    Integer updatedTime
}
