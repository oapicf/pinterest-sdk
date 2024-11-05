
# Table `CatalogsFeedProcessingResult`
(mapped from: CatalogsFeedProcessingResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**ingestionDetails** | ingestion_details | long NOT NULL |  | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]
**productCounts** | product_counts | long NOT NULL |  | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  [foreignkey]
**validationDetails** | validation_details | long NOT NULL |  | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  [foreignkey]









