
# Table `CatalogsFeedIngestion`
(mapped from: CatalogsFeedIngestion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**feedId** | feed_id | text NOT NULL |  | **kotlin.String** |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**status** | status | long NOT NULL |  | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  [foreignkey]






