package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class DeleteAssetGroupBody {
    /* List of ids of asset groups to be deleted */
    List<String> assetGroupsToDelete = new ArrayList<>()
}
