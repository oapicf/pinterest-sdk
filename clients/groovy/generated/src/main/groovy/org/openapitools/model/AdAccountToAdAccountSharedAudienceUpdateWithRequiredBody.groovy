package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OperationType;

@Canonical
class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody {
    /* Unique identifier of an audience */
    String audienceId
    
    OperationType operationType
    /* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
    List<String> recipientAccountIds = new ArrayList<>()
}
