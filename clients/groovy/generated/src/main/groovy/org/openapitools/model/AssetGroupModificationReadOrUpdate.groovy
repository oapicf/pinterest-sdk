package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;

@Canonical
class AssetGroupModificationReadOrUpdate {
    /* A list of asset groups and the data that will be used to update them. */
    List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>()
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    List<AssetGroupUpdateError> exceptions = new ArrayList<>()
    /* A list of successfully edited asset groups. */
    List<AssetGroupBinding> updatedAssetGroups = new ArrayList<>()
}
