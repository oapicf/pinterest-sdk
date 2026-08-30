package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;

@Canonical
class AssetIdPermissions {
    /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
    AssetGroupBinding assetGroupInfo
    /* Unique identifier of a business asset. */
    String assetId
    
    AssetTypeResponse assetType
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
