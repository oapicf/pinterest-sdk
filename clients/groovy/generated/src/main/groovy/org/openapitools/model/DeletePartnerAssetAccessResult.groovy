package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class DeletePartnerAssetAccessResult {
    /* Unique identifier of a business asset. */
    String assetId
    /* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    String assetType
    /* If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. */
    Boolean isSharedPartner
    /* Unique identifier of a business partner. */
    String partnerId
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
