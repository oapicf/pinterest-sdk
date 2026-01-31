# Org.OpenAPITools.Model.CatalogsRetailFeedsCreateRequest
Request object for creating a retail feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Format** | **CatalogsFormat** |  | 
**DefaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**CatalogType** | **CatalogsType** |  | 
**DefaultCountry** | **Country** |  | 
**DefaultCurrency** | **NullableCurrency** |  | [optional] 
**Credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**PreferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**DefaultAvailability** | **ProductAvailabilityType** |  | [optional] 
**Status** | **CatalogsStatus** |  | [optional] [default to "ACTIVE"]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

