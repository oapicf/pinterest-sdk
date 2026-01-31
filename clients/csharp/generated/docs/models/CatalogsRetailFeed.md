# Org.OpenAPITools.Model.CatalogsRetailFeed
Catalogs Retail Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **DateTime** |  | 
**Id** | **string** |  | 
**UpdatedAt** | **DateTime** |  | 
**CatalogType** | **CatalogsType** |  | 
**DefaultCountry** | **Country** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Format** | **CatalogsFormat** |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Status** | **CatalogsStatus** |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**DefaultAvailability** | **ProductAvailabilityType** |  | 
**DefaultCurrency** | **NullableCurrency** |  | 
**Name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

