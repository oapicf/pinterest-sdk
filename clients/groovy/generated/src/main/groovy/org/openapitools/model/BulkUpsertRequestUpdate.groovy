package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.BulkUpsertRequestUpdateCatalogProductGroupsItems;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.KeywordUpdateGenerated;
import org.openapitools.model.LabelBulkUpdateRequest;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ScheduleUpdateRequest;

@Canonical
class BulkUpsertRequestUpdate {
    
    List<AdGroupUpdateRequest> adGroups = new ArrayList<>()
    
    List<AdUpdateRequest> ads = new ArrayList<>()
    
    List<CampaignUpdateRequest> campaigns = new ArrayList<>()
    
    List<BulkUpsertRequestUpdateCatalogProductGroupsItems> catalogProductGroups = new ArrayList<>()
    
    List<KeywordUpdateGenerated> keywords = new ArrayList<>()
    
    List<LabelBulkUpdateRequest> labels = new ArrayList<>()
    
    List<ProductGroupPromotionUpdateRequest> productGroups = new ArrayList<>()
    
    List<ScheduleUpdateRequest> schedules = new ArrayList<>()
}
