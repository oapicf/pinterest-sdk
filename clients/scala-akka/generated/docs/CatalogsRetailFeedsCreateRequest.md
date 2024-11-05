

# CatalogsRetailFeedsCreateRequest

Request object for creating a retail feed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCurrency** | **NullableCurrency** |  |  [optional]
**name** | **String** | A human-friendly name associated to a given feed. | 
**format** | **CatalogsFormat** |  | 
**defaultLocale** | [**CatalogsFeedsCreateRequestDefaultLocale**](CatalogsFeedsCreateRequestDefaultLocale.md) |  | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  |  [optional]
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  |  [optional]
**catalogType** | **CatalogsType** |  | 
**defaultCountry** | **Country** |  | 
**defaultAvailability** | **ProductAvailabilityType** |  |  [optional]
**status** | [**CatalogsStatus**](CatalogsStatus.md) |  |  [optional]



