# # CatalogsVerticalFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**\OpenAPI\Client\Model\NullableCurrency**](NullableCurrency.md) |  | [optional]
**name** | **string** | A human-friendly name associated to a given feed. |
**format** | [**\OpenAPI\Client\Model\CatalogsFormat**](CatalogsFormat.md) |  |
**default_locale** | [**\OpenAPI\Client\Model\CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  |
**credentials** | [**\OpenAPI\Client\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |
**preferred_processing_schedule** | [**\OpenAPI\Client\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional]
**catalog_type** | [**\OpenAPI\Client\Model\CatalogsType**](CatalogsType.md) |  |
**default_country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  |
**default_availability** | [**\OpenAPI\Client\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional]
**catalog_id** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
