package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Role;

@Canonical
class BusinessSharedAudienceResponse {
    /* Audience ID that was shared */
    String audienceId
    
    List<Role> permissions = new ArrayList<>()
    /* Business IDs that received the audience */
    List<String> recipientBusinessIds = new ArrayList<>()
}
