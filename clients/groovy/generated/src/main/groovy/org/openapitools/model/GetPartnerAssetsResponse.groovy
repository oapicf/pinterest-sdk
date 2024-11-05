package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetGroupBinding;

@Canonical
class GetPartnerAssetsResponse {
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    String assetType
    /* The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. */
    List<String> permissions = new ArrayList<>()
    
    AssetGroupBinding assetGroupInfo
}
