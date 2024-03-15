
# Table `CatalogsFeedProcessingResult`
(mapped from: CatalogsFeedProcessingResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ingestionDetails** | ingestion_details | long NOT NULL |  | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]
**productCounts** | product_counts | long NOT NULL |  | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  [foreignkey]
**validationDetails** | validation_details | long NOT NULL |  | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  [foreignkey]
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**updatedAt** | updated_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]









