package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeleteInvitesResultsResponseArrayItemsInnerException {
    /* Unique identifier of an invite. */
    String inviteId
    /* Error message associated with the error in performing the action on the invite/request. */
    String message
}
