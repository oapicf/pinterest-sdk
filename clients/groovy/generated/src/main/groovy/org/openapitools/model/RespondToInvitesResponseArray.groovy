package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RespondToInviteResultItem;

@Canonical
class RespondToInvitesResponseArray {
    /* List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. */
    List<RespondToInviteResultItem> items = new ArrayList<>()
}
