# openapi::CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**name** | **character** | A human-friendly name associated to a given feed. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [Enum: ] 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | 
**default_country** | [**Country**](Country.md) |  | [Enum: ] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [Pattern: ^(http|https|ftp|sftp):/] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**catalog_id** | **character** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. | [optional] [Pattern: ^\\d+$] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 


