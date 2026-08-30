package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.BulkUpsertRequestCreateCatalogProductGroupsItems;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.LabelBulkCreateRequest;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ScheduleCreateRequest;

@Canonical
class BulkUpsertRequestCreate {
    
    List<AdGroupCreateRequest> adGroups = new ArrayList<>()
    
    List<AdCreateRequest> ads = new ArrayList<>()
    
    List<CampaignCreateRequest> campaigns = new ArrayList<>()
    
    List<BulkUpsertRequestCreateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>()
    
    List<KeywordsRequest> keywords = new ArrayList<>()
    
    List<LabelBulkCreateRequest> labels = new ArrayList<>()
    
    List<ProductGroupPromotionCreateRequest> productGroups = new ArrayList<>()
    
    List<ScheduleCreateRequest> schedules = new ArrayList<>()
}
