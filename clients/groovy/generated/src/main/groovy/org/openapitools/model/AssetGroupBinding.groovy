package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessAccessUserSummary;

@Canonical
class AssetGroupBinding {
    /* A list of ad account IDs under the asset group */
    List<String> adAccountsIds = new ArrayList<>()
    /* Asset group description */
    String assetGroupDescription
    /* Asset Group name */
    String assetGroupName
    /* Asset group types */
    List<String> assetGroupTypes = new ArrayList<>()
    /* A list of catalog IDs under asset group */
    List<String> catalogsIds = new ArrayList<>()
    /* The data of the user that created the asset group. */
    BusinessAccessUserSummary createdBy
    /* The creation time of the asset group */
    Integer createdTime
    /* Asset Group ID. */
    String id
    /* The data of the business that owns the asset group. */
    BusinessAccessUserSummary owner
    /* A list of profile IDs under asset group */
    List<String> profilesIds = new ArrayList<>()
    /* The last update time of the asset group */
    Integer updatedTime
}
