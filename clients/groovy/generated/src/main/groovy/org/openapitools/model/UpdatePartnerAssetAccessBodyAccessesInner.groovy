package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Permissions;

@Canonical
class UpdatePartnerAssetAccessBodyAccessesInner {
    /* Unique identifier of a business partner to update asset access to. */
    String partnerId
    /* Unique identifier of the business asset. */
    String assetId
    /* A non-empty array of permissions to assign to the partner. */
    List<Permissions> permissions = new ArrayList<>()
}
