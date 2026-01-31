
# Table `CatalogsCreativeAssetsFeed`
(mapped from: CatalogsCreativeAssetsFeed)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**catalogId** | catalog_id | text NOT NULL |  | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**credentials** | credentials | long NOT NULL |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [foreignkey]
**defaultCountry** | default_country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**defaultCurrency** | default_currency | long NOT NULL |  | [**NullableCurrency**](NullableCurrency.md) |  |  [foreignkey]
**defaultLocale** | default_locale | text NOT NULL |  | **kotlin.String** | The locale used within a feed for product descriptions. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | preferred_processing_schedule | long NOT NULL |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [foreignkey]
**status** | status | long NOT NULL |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [foreignkey]
















