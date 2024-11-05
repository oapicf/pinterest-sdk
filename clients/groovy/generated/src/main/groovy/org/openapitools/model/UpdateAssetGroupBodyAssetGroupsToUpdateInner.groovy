package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupType;

@Canonical
class UpdateAssetGroupBodyAssetGroupsToUpdateInner {
    /* Unique identifier of the asset group to update. */
    String assetGroupId
    /* Asset Group name */
    String name
    /* Asset group description */
    String description
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    List<AssetGroupType> assetGroupTypes = new ArrayList<>()
    /* A list of asset ids to add to the asset group. */
    List<String> assetsToAdd = new ArrayList<>()
    /* A list of asset ids to remove from the asset group. */
    List<String> assetsToRemove = new ArrayList<>()
}
