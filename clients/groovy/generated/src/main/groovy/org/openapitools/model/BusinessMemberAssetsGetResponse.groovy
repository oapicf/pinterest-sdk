package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetIdPermissions;
import org.openapitools.model.TotalCountByEntityStatus;

@Canonical
class BusinessMemberAssetsGetResponse {
    
    String bookmark
    
    List<AssetIdPermissions> items = new ArrayList<>()
    /* Total number of assets matching the query */
    Integer totalDataCount
    /* Breakdown of asset counts by entity status (ad accounts only) */
    TotalCountByEntityStatus totalDataCountByStatus
}
