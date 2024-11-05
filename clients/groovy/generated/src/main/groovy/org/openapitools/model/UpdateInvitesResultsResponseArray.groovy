package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateInvitesResultsResponseArrayItemsInner;

@Canonical
class UpdateInvitesResultsResponseArray {
    /* List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. */
    List<UpdateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>()
}
