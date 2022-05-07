
# Table `CatalogsFeedsCreateRequest`
(mapped from: CatalogsFeedsCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | A human-friendly name associated to a given feed. | 
**format** | format | long NOT NULL |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [foreignkey]
**location** | location | text NOT NULL |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**defaultCountry** | default_country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**defaultLocale** | default_locale | text |  | **kotlin.String** | The locale used within a feed for product descriptions. |  [optional]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]











