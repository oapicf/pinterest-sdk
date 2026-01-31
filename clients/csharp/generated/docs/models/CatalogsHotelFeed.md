# Org.OpenAPITools.Model.CatalogsHotelFeed
Catalogs Hotel Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **DateTime** |  | 
**Id** | **string** |  | 
**UpdatedAt** | **DateTime** |  | 
**CatalogType** | **CatalogsType** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Format** | **CatalogsFormat** |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Status** | **CatalogsStatus** |  | 
**CatalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**DefaultCurrency** | **NullableCurrency** |  | 
**Name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

