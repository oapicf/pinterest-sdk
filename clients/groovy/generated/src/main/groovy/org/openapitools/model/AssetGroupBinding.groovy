package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class AssetGroupBinding {
    /* Asset Group ID. */
    String id
    /* Asset Group name */
    String assetGroupName
    /* Asset group description */
    String assetGroupDescription
    /* Asset group types */
    List<String> assetGroupTypes = new ArrayList<>()
    /* A list of ad account IDs under the asset group */
    List<String> adAccountsIds
    /* A list of profile IDs under asset group */
    List<String> profilesIds
    /* The creation time of the asset group */
    Integer createdTime
    /* The last update time of the asset group */
    Integer updatedTime
    /* The data of the business that owns the asset group. */
    BusinessAccessUserSummary owner
    /* The data of the user that created the asset group. */
    BusinessAccessUserSummary createdBy
}
