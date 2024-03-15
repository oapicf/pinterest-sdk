# openapi::CatalogsHotelFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] [Enum: ] 
**name** | **character** | A human-friendly name associated to a given feed. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | [Enum: ] 
**default_locale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequest_default_locale.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | **character** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [Pattern: ^(http|https|ftp|sftp):/] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**catalog_id** | **character** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] [Pattern: ^\\d+$] 


