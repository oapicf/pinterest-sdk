package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateMemberResult;

@Canonical
class UpdateMemberResultsResponseArray {
    /* List of members with updated business access role. */
    List<UpdateMemberResult> items = new ArrayList<>()
}
