package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.InviteExceptionResponse;

@Canonical
class RespondToInviteResultItem {
    
    InviteExceptionResponse exception
    /* An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. */
    BaseInviteDataResponse invite
}
