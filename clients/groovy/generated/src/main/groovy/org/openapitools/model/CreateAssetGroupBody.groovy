package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupType;

@Canonical
class CreateAssetGroupBody {
    /* Asset Group name */
    String assetGroupName
    /* Asset group description */
    String assetGroupDescription
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    List<AssetGroupType> assetGroupTypes = new ArrayList<>()
}
