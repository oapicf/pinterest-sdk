# Org.OpenAPITools.Model.CatalogsRetailFeedsCreateRequest
Request object for creating a retail feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**DefaultCountry** | **Country** |  | 
**DefaultLocale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | 
**Format** | **CatalogsFormat** |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**CatalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**Status** | **CatalogsStatus** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

