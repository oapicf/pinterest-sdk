# Org.OpenAPITools.Model.CatalogsRetailFeed
Catalogs Retail Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | **string** |  | 
**CreatedAt** | **DateTime** |  | [readonly] 
**DefaultCountry** | **Country** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Format** | **CatalogsFormat** |  | 
**Id** | **string** | ID of the feed entity. | [readonly] 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**Status** | **CatalogsStatus** |  | 
**UpdatedAt** | **DateTime** |  | [readonly] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**Name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

