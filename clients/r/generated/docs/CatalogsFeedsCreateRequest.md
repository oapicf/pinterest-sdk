# openapi::CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [**Country**](Country.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**name** | **character** | A human-friendly name associated to a given feed. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | **character** | The locale used within a feed for product descriptions. | [optional] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 


