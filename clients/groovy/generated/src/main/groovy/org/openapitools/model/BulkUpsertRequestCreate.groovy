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
    
    List<CampaignCreateRequest> campaigns = new ArrayList<>()
    
    List<AdGroupCreateRequest> adGroups = new ArrayList<>()
    
    List<AdCreateRequest> ads = new ArrayList<>()
    
    List<ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>()
    
    List<KeywordsRequest> keywords = new ArrayList<>()
}
