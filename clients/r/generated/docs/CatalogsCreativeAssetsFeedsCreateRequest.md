# openapi::CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] [Pattern: ^\\d+$] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_country** | [**Country**](Country.md) |  | [Enum: ] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**default_locale** | [**CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequest_default_locale.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [Enum: ] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [Pattern: ^(http|https|ftp|sftp):/] 
**name** | **character** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] [Enum: ] 


