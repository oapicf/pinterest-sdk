# CatalogsVerticalFeedsCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **String** | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [optional] [default to None]
**catalog_type** | [***models::CatalogsCreativeAssetsAvailableFilterValuesCatalogType**](CatalogsCreativeAssetsAvailableFilterValues_catalog_type.md) |  | 
**credentials** | [***swagger::Nullable<models::CatalogsFeedCredentials>**](CatalogsFeedCredentials.md) |  | [optional] [default to None]
**default_availability** | [***swagger::Nullable<models::ProductAvailabilityType>**](ProductAvailabilityType.md) |  | [optional] [default to None]
**default_country** | [***models::Country**](Country.md) |  | 
**default_currency** | [***swagger::Nullable<models::NullableCurrency>**](NullableCurrency.md) |  | [optional] [default to None]
**default_locale** | [***models::CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale**](CatalogsCreativeAssetsFeedsCreateRequest_default_locale.md) |  | 
**format** | [***models::CatalogsFormat**](CatalogsFormat.md) |  | 
**location** | **String** | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**name** | **String** | A human-friendly name associated to a given feed. | 
**preferred_processing_schedule** | [***swagger::Nullable<models::CatalogsFeedProcessingSchedule>**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to None]
**status** | [***models::CatalogsStatus**](CatalogsStatus.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


