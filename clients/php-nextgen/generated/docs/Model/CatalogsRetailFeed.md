# CatalogsRetailFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  |
**created_at** | **\DateTime** |  | [readonly]
**credentials** | [**\OpenAPI\Client\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional]
**default_availability** | [**\OpenAPI\Client\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional]
**default_country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  |
**default_currency** | [**\OpenAPI\Client\Model\NullableCurrency**](NullableCurrency.md) |  | [optional]
**default_locale** | **string** | The locale used within a feed for product descriptions. |
**format** | [**\OpenAPI\Client\Model\CatalogsFormat**](CatalogsFormat.md) |  |
**id** | **string** | ID of the feed entity. | [readonly]
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |
**preferred_processing_schedule** | [**\OpenAPI\Client\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional]
**status** | [**\OpenAPI\Client\Model\CatalogsStatus**](CatalogsStatus.md) |  |
**updated_at** | **\DateTime** |  | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
