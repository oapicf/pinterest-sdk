# Org.OpenAPITools.Model.CatalogsRetailFeedsCreateRequest
Request object for creating a retail feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Format** | **CatalogsFormat** |  | 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**CatalogType** | **CatalogsType** |  | 
**DefaultCountry** | **Country** |  | 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

