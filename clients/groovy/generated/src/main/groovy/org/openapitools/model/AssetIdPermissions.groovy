package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupBinding;

@Canonical
class AssetIdPermissions {
    
    AssetGroupBinding assetGroupInfo
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    String assetType
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
