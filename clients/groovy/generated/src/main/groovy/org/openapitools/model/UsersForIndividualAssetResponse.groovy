package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class UsersForIndividualAssetResponse {
    /* Unique identifier of a business asset. */
    String assetId
    /* Unique identifier of the business member with asset access. */
    String memberId
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
