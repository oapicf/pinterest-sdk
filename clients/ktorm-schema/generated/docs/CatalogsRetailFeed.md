
# Table `CatalogsRetailFeed`
(mapped from: CatalogsRetailFeed)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**createdAt** | created_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]
**defaultCountry** | default_country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**defaultLocale** | default_locale | text NOT NULL |  | **kotlin.String** | The locale used within a feed for product descriptions. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | ID of the feed entity. |  [readonly]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**status** | status | long NOT NULL |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [foreignkey]
**updatedAt** | updated_at | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [readonly]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
















