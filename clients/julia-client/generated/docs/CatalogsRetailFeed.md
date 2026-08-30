# CatalogsRetailFeed


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_type`** | **`String`** |  | [default to nothing]
**`created_at`** | **`ZonedDateTime`** |  | [readonly] [default to nothing]
**`credentials`** | [**`*CatalogsFeedCredentials`**](CatalogsFeedCredentials.md) |  | [optional] [default to nothing]
**`default_availability`** | [**`*ProductAvailabilityType`**](ProductAvailabilityType.md) |  | [optional] [default to nothing]
**`default_country`** | [**`*Country`**](Country.md) |  | [default to nothing]
**`default_currency`** | [**`*NullableCurrency`**](NullableCurrency.md) |  | [optional] [default to nothing]
**`default_locale`** | **`String`** | The locale used within a feed for product descriptions. | [default to nothing]
**`format`** | [**`*CatalogsFormat`**](CatalogsFormat.md) |  | [default to nothing]
**`id`** | **`String`** | ID of the feed entity. | [readonly] [default to nothing]
**`location`** | **`String`** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to nothing]
**`name`** | **`String`** | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to nothing]
**`preferred_processing_schedule`** | [**`*CatalogsFeedProcessingSchedule`**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to nothing]
**`status`** | [**`*CatalogsStatus`**](CatalogsStatus.md) |  | [default to nothing]
**`updated_at`** | **`ZonedDateTime`** |  | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


