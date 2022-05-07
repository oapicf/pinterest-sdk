# FeedFields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefaultCountry** | [**Country**](Country.md) |  | 
**DefaultAvailability** | Pointer to [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**DefaultCurrency** | Pointer to [**NullableCurrency**](NullableCurrency.md) |  | 
**Name** | Pointer to **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**Format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**DefaultLocale** | **string** | The locale used within a feed for product descriptions. | 
**Credentials** | Pointer to [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**Location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**PreferredProcessingSchedule** | Pointer to [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**Status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


