package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignCreateResponseData;
import org.openapitools.model.Exception;

@Canonical
class CampaignCreateResponseItem {
    
    CampaignCreateResponseData data
    
    List<Exception> exceptions
}
