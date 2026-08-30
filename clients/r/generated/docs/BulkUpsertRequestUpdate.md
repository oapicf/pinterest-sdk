# openapi::BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**array[AdGroupUpdateRequest]**](AdGroupUpdateRequest.md) |  | [optional] 
**ads** | [**array[AdUpdateRequest]**](AdUpdateRequest.md) |  | [optional] 
**campaigns** | [**array[CampaignUpdateRequest]**](CampaignUpdateRequest.md) |  | [optional] 
**catalog_product_groups** | [**array[BulkUpsertRequestUpdateCatalogProductGroupsItems]**](BulkUpsertRequestUpdateCatalogProductGroupsItems.md) |  | [optional] 
**keywords** | [**array[KeywordUpdateGenerated]**](KeywordUpdateGenerated.md) |  | [optional] 
**labels** | [**array[LabelBulkUpdateRequest]**](LabelBulkUpdateRequest.md) |  | [optional] 
**product_groups** | [**array[ProductGroupPromotionUpdateRequest]**](ProductGroupPromotionUpdateRequest.md) |  | [optional] 
**schedules** | [**array[ScheduleUpdateRequest]**](ScheduleUpdateRequest.md) |  | [optional] 


