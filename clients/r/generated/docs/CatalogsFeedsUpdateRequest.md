# openapi::CatalogsFeedsUpdateRequest

Request object for updating a feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**name** | **character** | A human-friendly name associated to a given feed. | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 


