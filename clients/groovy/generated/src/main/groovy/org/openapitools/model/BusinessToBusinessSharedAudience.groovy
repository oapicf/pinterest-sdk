package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Role;

@Canonical
class BusinessToBusinessSharedAudience {
    /* Unique identifier of an audience */
    String audienceId
    /* Permissions granted to the recipients. */
    List<Role> permissions = new ArrayList<>()
    /* Business IDs to share with or revoke from (request) / that received the audience (response). */
    List<String> recipientBusinessIds = new ArrayList<>()
}
