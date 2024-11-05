package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetGroupBinding;

@Canonical
class GetBusinessAssetsResponse {
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    String assetType
    
    AssetGroupBinding assetGroupInfo
}
