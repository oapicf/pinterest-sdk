package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteBusinessRoleBinding;
import org.openapitools.model.InviteExceptionResponse;

@Canonical
class UpdateInvitesResultsResponseArrayItemsInner {
    
    InviteExceptionResponse exception
    
    InviteBusinessRoleBinding invite
}
