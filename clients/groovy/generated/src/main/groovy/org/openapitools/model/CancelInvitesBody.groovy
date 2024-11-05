package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class CancelInvitesBody {
    /* List of invite/request ids to be cancelled */
    List<String> inviteIds = new ArrayList<>()
}
