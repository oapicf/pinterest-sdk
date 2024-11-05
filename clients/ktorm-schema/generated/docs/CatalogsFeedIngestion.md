
# Table `CatalogsFeedIngestion`
(mapped from: CatalogsFeedIngestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** |  | 
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]






