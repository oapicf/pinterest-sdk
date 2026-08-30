

# CatalogsHotelFeedsUpdateRequest

Request object for updating a feed.

The class is defined in **[CatalogsHotelFeedsUpdateRequest.java](../../src/main/java/org/openapitools/model/CatalogsHotelFeedsUpdateRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogType** | [**CatalogTypeEnum**](#CatalogTypeEnum) |  | 
**credentials** | [`CatalogsFeedCredentials`](CatalogsFeedCredentials.md) |  |  [optional property]
**defaultCurrency** | `NullableCurrency` |  |  [optional property]
**_format** | `CatalogsFormat` |  |  [optional property]
**location** | `String` | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional property]
**name** | `String` | A human-friendly name associated to a given feed. |  [optional property]
**preferredProcessingSchedule** | [`CatalogsFeedProcessingSchedule`](CatalogsFeedProcessingSchedule.md) |  |  [optional property]
**status** | `CatalogsStatus` |  |  [optional property]

## CatalogTypeEnum

Name | Value
---- | -----
HOTEL | `"HOTEL"`









