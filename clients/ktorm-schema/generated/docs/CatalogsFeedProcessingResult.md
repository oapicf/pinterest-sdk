
# Table `CatalogsFeedProcessingResult`
(mapped from: CatalogsFeedProcessingResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the feed processing result. | 
**ingestionDetails** | ingestion_details | long NOT NULL |  | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  [foreignkey]
**productCounts** | product_counts | long NOT NULL |  | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]
**validationDetails** | validation_details | long NOT NULL |  | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  [foreignkey]
**videoCounts** | video_counts | long |  | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  |  [optional] [foreignkey]










