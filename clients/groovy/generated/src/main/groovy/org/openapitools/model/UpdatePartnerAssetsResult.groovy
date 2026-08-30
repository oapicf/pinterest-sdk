package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetTypeResponse;

@Canonical
class UpdatePartnerAssetsResult {
    /* Unique identifier of a business asset. */
    String assetId
    
    AssetTypeResponse assetType
    /* Unique identifier of a business partner. */
    String partnerId
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
