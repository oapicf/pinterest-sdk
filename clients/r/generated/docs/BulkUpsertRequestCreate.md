# openapi::BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**array[AdGroupCreateRequest]**](AdGroupCreateRequest.md) |  | [optional] 
**ads** | [**array[AdCreateRequest]**](AdCreateRequest.md) |  | [optional] 
**campaigns** | [**array[CampaignCreateRequest]**](CampaignCreateRequest.md) |  | [optional] 
**catalog_product_groups** | [**array[BulkUpsertRequestCreateCatalogProductGroupsItems]**](BulkUpsertRequestCreateCatalogProductGroupsItems.md) |  | [optional] 
**keywords** | [**array[KeywordsRequest]**](KeywordsRequest.md) |  | [optional] 
**labels** | [**array[LabelBulkCreateRequest]**](LabelBulkCreateRequest.md) |  | [optional] 
**product_groups** | [**array[ProductGroupPromotionCreateRequest]**](ProductGroupPromotionCreateRequest.md) |  | [optional] 
**schedules** | [**array[ScheduleCreateRequest]**](ScheduleCreateRequest.md) |  | [optional] 


