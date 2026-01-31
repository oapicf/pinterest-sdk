package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ObjectiveType;

@Canonical
class BulkDownloadRequestCampaignFilter {
    
    List<CampaignSummaryStatus> campaignStatus = new ArrayList<>()
    /* Unix UTC timestamp. */
    String endTime
    /* Campaign name */
    String name
    
    List<ObjectiveType> objectiveType = new ArrayList<>()
    /* Unix UTC timestamp. */
    String startTime
}
