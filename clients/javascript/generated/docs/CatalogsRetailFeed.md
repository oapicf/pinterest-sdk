# PinterestSdk.CatalogsRetailFeed

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | **String** |  | 
**createdAt** | **Date** |  | [readonly] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**defaultCountry** | [**Country**](Country.md) |  | 
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**defaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **String** | ID of the feed entity. | [readonly] 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**updatedAt** | **Date** |  | [readonly] 



## Enum: CatalogTypeEnum


* `RETAIL` (value: `"RETAIL"`)




