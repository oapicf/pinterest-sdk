package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BusinessMembersAssetAccessDeleteRequestAccessesInner {
    /* Id of the asset on which to remove member permissions. */
    String assetId
    /* Unique identifier of the member on which to perform the asset permission removal */
    String memberId
}
