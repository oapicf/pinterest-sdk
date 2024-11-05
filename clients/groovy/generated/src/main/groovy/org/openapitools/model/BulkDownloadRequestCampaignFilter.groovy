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
    /* Unix UTC timestamp. */
    String startTime
    /* Unix UTC timestamp. */
    String endTime
    /* Campaign name */
    String name
    
    List<CampaignSummaryStatus> campaignStatus = new ArrayList<>()
    
    List<ObjectiveType> objectiveType = new ArrayList<>()
}
