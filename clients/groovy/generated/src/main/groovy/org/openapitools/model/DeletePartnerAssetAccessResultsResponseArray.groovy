package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DeletePartnerAssetAccessResult;

@Canonical
class DeletePartnerAssetAccessResultsResponseArray {
    /* List of terminated partner asset accesses. */
    List<DeletePartnerAssetAccessResult> items = new ArrayList<>()
}
