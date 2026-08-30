# openapi::CatalogsFeed

Catalogs Feed object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**created_at** | **character** |  | [readonly] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] [Enum: ] 
**default_country** | [**Country**](Country.md) |  | [Enum: ] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**default_locale** | **character** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [Enum: ] 
**id** | **character** | ID of the feed entity. | [readonly] [Pattern: ^\\d+$] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [Pattern: ^(http|https|ftp|sftp):/] 
**name** | **character** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [Enum: ] 
**updated_at** | **character** |  | [readonly] 
**catalog_id** | **character** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [Pattern: ^\\d+$] 


