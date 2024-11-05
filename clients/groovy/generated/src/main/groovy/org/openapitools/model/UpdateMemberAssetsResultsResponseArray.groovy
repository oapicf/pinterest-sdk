package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArrayItemsInner;

@Canonical
class UpdateMemberAssetsResultsResponseArray {
    /* List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. */
    List<UpdateMemberAssetsResultsResponseArrayItemsInner> items = new ArrayList<>()
}
