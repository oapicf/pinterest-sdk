package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InviteAssetsSummaryItem;

@Canonical
class InviteAssetsSummary {
    /* List of ad account IDs and respective permission levels that will be assigned. */
    List<InviteAssetsSummaryItem> adAccounts = new ArrayList<>()
    /* List of profile IDs and respective permission levels that will be assigned. */
    List<InviteAssetsSummaryItem> profiles = new ArrayList<>()
}
