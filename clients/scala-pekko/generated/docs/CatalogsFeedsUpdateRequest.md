

# CatalogsFeedsUpdateRequest

Request object for updating a feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**defaultAvailability** | **ProductAvailabilityType** |  |  [optional]
**defaultCurrency** | **NullableCurrency** |  |  [optional]
**format** | **CatalogsFormat** |  |  [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. |  [optional]
**name** | **String** | A human-friendly name associated to a given feed. |  [optional]
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**status** | **CatalogsStatus** |  |  [optional]



