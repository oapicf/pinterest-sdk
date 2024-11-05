package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeletePartnerAssetsResult;

@Canonical
class DeletePartnerAssetsResultsResponseArray {
    /* List of terminated asset access. */
    List<DeletePartnerAssetsResult> items = new ArrayList<>()
}
