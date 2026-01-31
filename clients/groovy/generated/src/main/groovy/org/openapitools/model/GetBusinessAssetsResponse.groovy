package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.GetBusinessAssetsResponseCatalogInfo;

@Canonical
class GetBusinessAssetsResponse {
    
    AssetGroupBinding assetGroupInfo
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    String assetType
    
    GetBusinessAssetsResponseCatalogInfo catalogInfo
}
