package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BusinessMemberAssetsSummaryAdAccountsInner;
import org.openapitools.model.BusinessMemberAssetsSummaryProfilesInner;

@Canonical
class BusinessMemberAssetsSummary {
    /* List of ad account IDs and respective permission levels. */
    List<BusinessMemberAssetsSummaryAdAccountsInner> adAccounts = new ArrayList<>()
    /* List of profile IDs and respective permission levels. */
    List<BusinessMemberAssetsSummaryProfilesInner> profiles = new ArrayList<>()
}
