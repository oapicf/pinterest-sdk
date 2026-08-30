package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class InviteAssetsSummaryItem {
    /* Unique identifier of the asset. */
    String id
    /* Permission levels member or partner has on an asset. */
    List<String> permissions = new ArrayList<>()
}
