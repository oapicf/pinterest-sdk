
# Table `CatalogsHotelFeedsUpdateRequest`
(mapped from: CatalogsHotelFeedsUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**catalogType** | catalog_type | long NOT NULL |  | [**CatalogsType**](CatalogsType.md) |  |  [foreignkey]
**credentials** | credentials | long |  | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional] [foreignkey]
**defaultCurrency** | default_currency | long |  | [**NullableCurrency**](NullableCurrency.md) |  |  [optional] [foreignkey]
**format** | format | long |  | [**CatalogsFormat**](CatalogsFormat.md) |  |  [optional] [foreignkey]
**location** | location | text |  | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional]
**name** | name | text |  | **kotlin.String** | A human-friendly name associated to a given feed. |  [optional]
**preferredProcessingSchedule** | preferred_processing_schedule | long |  | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional] [foreignkey]










