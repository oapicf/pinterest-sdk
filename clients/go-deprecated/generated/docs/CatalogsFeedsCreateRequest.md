# CatalogsFeedsCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCountry** | [**Country**](Country.md) |  | [optional] 
**DefaultAvailability** | Pointer to [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**DefaultCurrency** | Pointer to [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**Name** | **string** | A human-friendly name associated to a given feed. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | [optional] 
**Credentials** | Pointer to [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | Pointer to [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


