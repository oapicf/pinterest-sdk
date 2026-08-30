# CatalogsCreativeAssetsFeedsCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_id`** | **`String`** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] [default to nothing]
**`catalog_type`** | **`String`** |  | [default to nothing]
**`credentials`** | [**`*CatalogsFeedCredentials`**](CatalogsFeedCredentials.md) |  | [optional] [default to nothing]
**`default_country`** | [**`*Country`**](Country.md) |  | [default to nothing]
**`default_currency`** | [**`*NullableCurrency`**](NullableCurrency.md) |  | [optional] [default to nothing]
**`default_locale`** | [**`*CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale`**](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md) |  | [default to nothing]
**`format`** | [**`*CatalogsFormat`**](CatalogsFormat.md) |  | [default to nothing]
**`location`** | **`String`** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to nothing]
**`name`** | **`String`** | A human-friendly name associated to a given feed. | [default to nothing]
**`preferred_processing_schedule`** | [**`*CatalogsFeedProcessingSchedule`**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to nothing]
**`status`** | [**`*CatalogsStatus`**](CatalogsStatus.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


