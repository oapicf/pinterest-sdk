package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessMembershipMember;

@Canonical
class UpdateBusinessMembershipsResponse {
    /* List of members with updated business access role. */
    List<BusinessMembershipMember> items = new ArrayList<>()
}
