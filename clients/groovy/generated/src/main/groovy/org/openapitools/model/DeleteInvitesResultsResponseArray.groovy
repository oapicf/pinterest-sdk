package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInner;

@Canonical
class DeleteInvitesResultsResponseArray {
    /* List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. */
    List<DeleteInvitesResultsResponseArrayItemsInner> items = new ArrayList<>()
}
