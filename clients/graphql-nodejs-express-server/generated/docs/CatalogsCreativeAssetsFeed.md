# CatalogsCreativeAssetsFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **String!** |  | [default to null]
**Id_** | **String!** |  | [default to null]
**updatedAt** | **String!** |  | [default to null]
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to null]
**format** | [***CatalogsFormat**](CatalogsFormat.md) |  | [default to null]
**catalogType** | [***CatalogsType**](CatalogsType.md) |  | [default to null]
**credentials** | [***CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [default to null]
**location** | **String!** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**preferredProcessingSchedule** | [***CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [default to null]
**status** | [***CatalogsStatus**](CatalogsStatus.md) |  | [default to null]
**defaultCurrency** | [***NullableCurrency**](NullableCurrency.md) |  | [default to null]
**defaultLocale** | **String!** | The locale used within a feed for product descriptions. | [default to null]
**defaultCountry** | [***Country**](Country.md) |  | [default to null]
**catalogId** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


