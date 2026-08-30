package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;

@Canonical
class AssetGroupModification {
    /* A list of errors associated with the asset groups. Will be returned if there is an error. */
    List<AssetGroupUpdateError> exceptions = new ArrayList<>()
    /* A list of successfully edited asset groups. */
    List<AssetGroupBinding> updatedAssetGroups = new ArrayList<>()
}
