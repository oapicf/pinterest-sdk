package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateInvitesResultsResponseArrayItemsInner;

@Canonical
class CreateInvitesResultsResponseArray {
    /* List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
    List<CreateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>()
}
