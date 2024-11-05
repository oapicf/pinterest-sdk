# FeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | [***NullableCurrency**](NullableCurrency.md) |  | [optional] [default to null]
**name** | **String!** | A human-friendly name associated to a given feed. | [default to null]
**format** | [***CatalogsFormat**](CatalogsFormat.md) |  | [default to null]
**defaultLocale** | [***CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | [default to null]
**credentials** | [***CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] [default to null]
**location** | **String!** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**preferredProcessingSchedule** | [***CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to null]
**catalogType** | [***CatalogsType**](CatalogsType.md) |  | [default to null]
**defaultCountry** | [***Country**](Country.md) |  | [default to null]
**defaultAvailability** | [***ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [default to null]
**status** | [***CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to null]
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


