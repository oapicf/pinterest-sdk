package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessRoleForMembers;

@Canonical
class MembersToDeleteBodyMembersInner {
    /* Unique identifier of the member */
    String memberId
    
    BusinessRoleForMembers businessRole
}
