package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdatePartnerAssetsResult;

@Canonical
class UpdatePartnerAssetsResultsResponseArray {
    /* List of assigned/updated partner asset access. */
    List<UpdatePartnerAssetsResult> items = new ArrayList<>()
}
