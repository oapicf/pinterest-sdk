# openapi::CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **character** |  | [optional] 
**id** | **character** |  | [optional] 
**updated_at** | **character** |  | [optional] 
**name** | **character** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [Enum: ] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | [Enum: ] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [Enum: ] 
**default_locale** | **character** | The locale used within a feed for product descriptions. | 
**catalog_id** | **character** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [Pattern: ^\\d+$] 


