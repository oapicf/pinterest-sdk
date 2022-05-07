# Org.OpenAPITools.Model.CatalogsFeed
Catalogs Catalogs Feed object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedAt** | **DateTime** |  | [optional] 
**Id** | **string** |  | [optional] 
**UpdatedAt** | **DateTime** |  | [optional] 
**DefaultCountry** | **Country** |  | 
**DefaultAvailability** | **ProductAvailabilityType** |  | 
**DefaultCurrency** | **NullableCurrency** |  | 
**Name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Format** | **CatalogsFormat** |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | **CatalogsStatus** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

