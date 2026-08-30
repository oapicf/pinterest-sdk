# openapi::CatalogsFeedProcessingResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **character** |  | [readonly] 
**id** | **character** | ID of the feed processing result. | [Pattern: ^\\d+$] 
**ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | [Enum: ] 
**updated_at** | **character** |  | [readonly] 
**validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**video_counts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] 


