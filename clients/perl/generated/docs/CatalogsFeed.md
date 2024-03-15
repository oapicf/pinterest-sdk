# WWW::OpenAPIClient::Object::CatalogsFeed

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsFeed;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **DATE_TIME** |  | [optional] 
**id** | **string** |  | [optional] 
**updated_at** | **DATE_TIME** |  | [optional] 
**name** | **string** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **string** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**default_locale** | **string** | The locale used within a feed for product descriptions. | 
**default_country** | [**Country**](Country.md) |  | 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**catalog_id** | **string** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


