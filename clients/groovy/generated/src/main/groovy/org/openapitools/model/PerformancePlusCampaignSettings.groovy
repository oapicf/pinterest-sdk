package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class PerformancePlusCampaignSettings {
    /* Whether to boost prospecting ad group bid. */
    Boolean boostProspectingAdGroupBid
    /* List of campaign-level exclusion pinner list IDs. */
    List<String> pinnerListExclusions = new ArrayList<>()
}
