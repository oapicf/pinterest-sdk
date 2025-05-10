# Org.OpenAPITools.Model.CatalogsCreativeAssetsFeed
Catalogs Creative Asset Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **DateTime** |  | 
**Id** | **string** |  | 
**UpdatedAt** | **DateTime** |  | 
**Format** | **CatalogsFormat** |  | 
**CatalogType** | **CatalogsType** |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Status** | **CatalogsStatus** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**DefaultCountry** | **Country** |  | 
**Name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**DefaultCurrency** | **NullableCurrency** |  | 
**CatalogId** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

