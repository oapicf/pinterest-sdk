package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteResponse;

@Canonical
class GetInvites200Response {
    /* List of invite and request data. */
    List<InviteResponse> items = new ArrayList<>()
    
    String bookmark
}
