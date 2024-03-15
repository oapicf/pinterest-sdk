# # CatalogsRetailFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **\DateTime** |  | [optional]
**id** | **string** |  | [optional]
**updated_at** | **\DateTime** |  | [optional]
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. |
**format** | [**\OpenAPI\Client\Model\CatalogsFormat**](CatalogsFormat.md) |  |
**catalog_type** | [**\OpenAPI\Client\Model\CatalogsType**](CatalogsType.md) |  |
**credentials** | [**\OpenAPI\Client\Model\CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |
**preferred_processing_schedule** | [**\OpenAPI\Client\Model\CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |
**status** | [**\OpenAPI\Client\Model\CatalogsStatus**](CatalogsStatus.md) |  |
**default_currency** | [**\OpenAPI\Client\Model\NullableCurrency**](NullableCurrency.md) |  |
**default_locale** | **string** | The locale used within a feed for product descriptions. |
**default_country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  |
**default_availability** | [**\OpenAPI\Client\Model\ProductAvailabilityType**](ProductAvailabilityType.md) |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
