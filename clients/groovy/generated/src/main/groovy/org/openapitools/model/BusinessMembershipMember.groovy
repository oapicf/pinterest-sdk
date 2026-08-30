package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessRoleForMembers;

@Canonical
class BusinessMembershipMember {
    
    BusinessRoleForMembers businessRole
    /* Unique identifier of the member. */
    String memberId
}
