# CatalogsFeedProcessingResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **chrono::DateTime<chrono::FixedOffset>** |  | [readonly]
**id** | **String** | ID of the feed processing result. | 
**ingestion_details** | [**models::CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**product_counts** | Option<[**models::CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md)> |  | 
**status** | [**models::CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**updated_at** | **chrono::DateTime<chrono::FixedOffset>** |  | [readonly]
**validation_details** | [**models::CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**video_counts** | Option<[**models::CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


