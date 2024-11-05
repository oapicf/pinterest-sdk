package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner;

@Canonical
class UpdateAssetGroupBody {
    /* A list of asset groups and the data that will be used to update them. */
    List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = new ArrayList<>()
}
