package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AudienceUpdateOperationType;

@Canonical
class CustomerSegmentUpdateRequestUpdateWithRequiredBody {
    /* Audience IDs to update the customer segment to. Only applicable for UPDATE operations. */
    List<String> audienceIds = new ArrayList<>()
    /* Customer segment ID. */
    String id
    
    AudienceUpdateOperationType operationType
}
