package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class DeletedMembersResponse {
    /* List of members whose business membership have been terminated. */
    List<String> deletedMembers = new ArrayList<>()
}
