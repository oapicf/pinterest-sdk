package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeleteMemberAccessResult;

@Canonical
class DeleteMemberAccessResultsResponseArray {
    /* List of member asset permissions that were deleted. */
    List<DeleteMemberAccessResult> items = new ArrayList<>()
}
