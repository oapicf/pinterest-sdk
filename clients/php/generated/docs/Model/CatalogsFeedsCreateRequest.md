# # CatalogsFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  | [optional]
**default_availability** | [**\OpenAPI\Client\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional]
**default_currency** | [**\OpenAPI\Client\Model\NullableCurrency**](NullableCurrency.md) |  | [optional]
**name** | **string** | A human-friendly name associated to a given feed. |
**format** | [**\OpenAPI\Client\Model\CatalogsFormat**](CatalogsFormat.md) |  |
**default_locale** | **string** | The locale used within a feed for product descriptions. | [optional]
**credentials** | [**\OpenAPI\Client\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |
**preferred_processing_schedule** | [**\OpenAPI\Client\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
