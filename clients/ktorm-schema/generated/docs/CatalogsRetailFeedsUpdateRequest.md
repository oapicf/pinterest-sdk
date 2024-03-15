
# Table `CatalogsRetailFeedsUpdateRequest`
(mapped from: CatalogsRetailFeedsUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | A human-friendly name associated to a given feed. |  [optional]
**format** | format | long |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [optional] [foreignkey]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**location** | location | text |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] [foreignkey]
**defaultAvailability** | default_availability | long |  | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional] [foreignkey]











