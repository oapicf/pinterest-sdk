package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.SummaryStatus;

@Canonical
class BulkDownloadCampaignFilter {
    
    List<SummaryStatus> campaignStatus = new ArrayList<>()
    /* Unix UTC timestamp. */
    String endTime
    /* Campaign name */
    String name
    
    List<ConversionObjectiveType> objectiveType = new ArrayList<>()
    /* Unix UTC timestamp. */
    String startTime
}
