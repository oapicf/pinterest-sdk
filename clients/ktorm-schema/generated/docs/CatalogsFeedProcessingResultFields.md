
# Table `catalogs_feed_processing_result_fields`
(mapped from: CatalogsFeedProcessingResultFields)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ingestionDetails** | ingestion_details | long NOT NULL |  | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]
**productCounts** | product_counts | long NOT NULL |  | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  [foreignkey]
**validationDetails** | validation_details | long NOT NULL |  | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  [foreignkey]






