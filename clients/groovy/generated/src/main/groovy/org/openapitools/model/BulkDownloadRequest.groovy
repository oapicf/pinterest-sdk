package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BulkDownloadRequestCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;

@Canonical
class BulkDownloadRequest {
    /* All entity types specified will be downloaded. Fewer types result in faster downloads. */
    List<BulkEntityType> entityTypes
    /* All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
    List<String> entityIds
    /* Unix UTC timestamp to retrieve all entities that have changed since this time. */
    String updatedSince
    
    BulkDownloadRequestCampaignFilter campaignFilter
    
    BulkOutputFormat outputFormat = "JSON"
}
