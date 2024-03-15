
# Table `CatalogsHotelFeed`
(mapped from: CatalogsHotelFeed)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**credentials** | credentials | long NOT NULL |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | preferred_processing_schedule | long NOT NULL |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [foreignkey]
**defaultCurrency** | default_currency | long NOT NULL |  | [**NullableCurrency**](NullableCurrency.md) |  |  [foreignkey]
**defaultLocale** | default_locale | text NOT NULL |  | **kotlin.String** | The locale used within a feed for product descriptions. | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**createdAt** | created_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**updatedAt** | updated_at | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]















