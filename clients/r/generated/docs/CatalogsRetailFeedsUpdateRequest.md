# openapi::CatalogsRetailFeedsUpdateRequest

Request object for updating a feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [Enum: ] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] [Enum: ] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] [Pattern: ^(http|https|ftp|sftp):/] 
**name** | **character** | A human-friendly name associated to a given feed. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [Enum: ] 


