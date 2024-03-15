
# Table `feeds_create_request`
(mapped from: FeedsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**defaultLocale** | default_locale | long |  | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  [optional] [foreignkey]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
**defaultCountry** | default_country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]
**catalogId** | catalog_id | text |  | **kotlin.String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. |  [optional]













