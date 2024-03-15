# WWW::OpenAPIClient::Object::CatalogsHotelFeedsCreateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsHotelFeedsCreateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**name** | **string** | A human-friendly name associated to a given feed. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**catalog_id** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


