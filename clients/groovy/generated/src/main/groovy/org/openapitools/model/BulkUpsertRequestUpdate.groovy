package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.KeywordUpdate;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;

@Canonical
class BulkUpsertRequestUpdate {
    
    List<CampaignUpdateRequest> campaigns
    
    List<AdGroupUpdateRequest> adGroups
    
    List<AdUpdateRequest> ads
    
    List<ProductGroupPromotionUpdateRequest> productGroups
    
    List<KeywordUpdate> keywords
}
