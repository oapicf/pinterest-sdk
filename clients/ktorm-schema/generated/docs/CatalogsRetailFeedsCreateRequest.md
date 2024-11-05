
# Table `CatalogsRetailFeedsCreateRequest`
(mapped from: CatalogsRetailFeedsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**defaultLocale** | default_locale | long NOT NULL |  | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**defaultCountry** | default_country | long NOT NULL |  | [**Country**](Country.md) |  |  [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] [foreignkey]













