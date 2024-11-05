package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateInvitesResultsResponseArrayItemsInnerInvite;
import org.openapitools.model.InviteExceptionResponse;

@Canonical
class CreateInvitesResultsResponseArrayItemsInner {
    
    InviteExceptionResponse exception
    
    CreateInvitesResultsResponseArrayItemsInnerInvite invite
}
