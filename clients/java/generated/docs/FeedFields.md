

# FeedFields


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCountry** | **Country** |  | 
**defaultAvailability** | **ProductAvailabilityType** |  | 
**defaultCurrency** | **NullableCurrency** |  | 
**name** | **String** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**format** | **CatalogsFormat** |  | 
**defaultLocale** | **String** | The locale used within a feed for product descriptions. | 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**preferredProcessingSchedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**status** | **CatalogsStatus** |  | 



