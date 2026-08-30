
# Table `CatalogsVerticalFeedsCreateRequest`
(mapped from: CatalogsVerticalFeedsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | text NOT NULL |  | [**catalog_type**](#CatalogType) |  | 
**defaultCountry** | default_country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**defaultLocale** | default_locale | long NOT NULL |  | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  |  [foreignkey]
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. |  [optional]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] [foreignkey]














