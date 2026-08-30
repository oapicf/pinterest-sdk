
# CatalogsRetailFeed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**inline**](#CatalogType) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [readonly]
**defaultCountry** | [**Country**](Country.md) |  | 
**defaultLocale** | **kotlin.String** | The locale used within a feed for product descriptions. | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**id** | **kotlin.String** | ID of the feed entity. |  [readonly]
**location** | **kotlin.String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **kotlin.String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [readonly]
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**defaultAvailability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  |  [optional]
**defaultCurrency** | [**NullableCurrency**](NullableCurrency.md) |  |  [optional]
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]


<a id="CatalogType"></a>
## Enum: catalog_type
Name | Value
---- | -----
catalogType | RETAIL



