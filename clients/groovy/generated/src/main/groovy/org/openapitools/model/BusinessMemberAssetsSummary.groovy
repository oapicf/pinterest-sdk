package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssetIdWithPermissions;

@Canonical
class BusinessMemberAssetsSummary {
    /* List of ad account IDs and respective permission levels. */
    List<AssetIdWithPermissions> adAccounts = new ArrayList<>()
    /* List of profile IDs and respective permission levels. */
    List<AssetIdWithPermissions> profiles = new ArrayList<>()
}
