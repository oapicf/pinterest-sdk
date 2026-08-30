
# Table `CatalogsFeedIngestion`
(mapped from: CatalogsFeedIngestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Timestamp of the feed ingestion. | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** | Catalog Feed id pertaining to the feed ingestion. | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Unique identifier of a feed ingestion. | 
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) | Status of the feed ingestion. |  [foreignkey]






