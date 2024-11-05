package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Permissions;

@Canonical
class UpdateMemberAssetAccessBodyAccessesInner {
    /* Id of the asset to update. */
    String assetId
    /* Unique identifier of the member on which to perform the update */
    String memberId
    /* A non-empty array of permissions to assign to the member. */
    List<Permissions> permissions = new ArrayList<>()
}
