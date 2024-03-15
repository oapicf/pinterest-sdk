# openapi::FeedsUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**name** | **character** | A human-friendly name associated to a given feed. | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] [Enum: ] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] [Pattern: ^(http|https|ftp|sftp):/] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [Enum: ] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [Enum: ] 


