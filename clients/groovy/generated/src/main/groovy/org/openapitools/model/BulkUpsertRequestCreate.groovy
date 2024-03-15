package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.ProductGroupPromotionCreateRequest;

@Canonical
class BulkUpsertRequestCreate {
    
    List<CampaignCreateRequest> campaigns
    
    List<AdGroupCreateRequest> adGroups
    
    List<AdCreateRequest> ads
    
    List<ProductGroupPromotionCreateRequest> productGroups
    
    List<KeywordsRequest> keywords
}
