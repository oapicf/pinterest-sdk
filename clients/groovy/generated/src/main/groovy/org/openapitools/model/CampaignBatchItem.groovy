package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignBatchResponseData;
import org.openapitools.model.Exception;

@Canonical
class CampaignBatchItem {
    /* Campaign data on success. */
    CampaignBatchResponseData data
    /* Exceptions on failure. */
    List<Exception> exceptions = new ArrayList<>()
}
