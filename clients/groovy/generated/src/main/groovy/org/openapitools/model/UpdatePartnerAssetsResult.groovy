package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class UpdatePartnerAssetsResult {
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    String assetType
    /* Unique identifier of a business partner. */
    String partnerId
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
