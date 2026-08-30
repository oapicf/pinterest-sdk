# CatalogsFeedProcessingResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [readonly] 
**id** | **String** | ID of the feed processing result. | 
**ingestion_details** | [***models::CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**product_counts** | [***swagger::Nullable<models::CatalogsFeedProductCounts>**](CatalogsFeedProductCounts.md) |  | 
**status** | [***models::CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**updated_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) |  | [readonly] 
**validation_details** | [***models::CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**video_counts** | [***models::CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


