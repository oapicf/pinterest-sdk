package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInnerException;

@Canonical
class DeleteInvitesResultsResponseArrayItemsInner {
    
    DeleteInvitesResultsResponseArrayItemsInnerException exception
    
    BaseInviteDataResponse invite
}
