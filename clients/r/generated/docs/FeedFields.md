# openapi::FeedFields


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [**Country**](Country.md) |  | 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | 
**name** | **character** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**default_locale** | **character** | The locale used within a feed for product descriptions. | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 


