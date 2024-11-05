# CATALOGS_HOTEL_FEEDS_CREATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_currency** | [**NULLABLE_CURRENCY**](NullableCurrency.md) |  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | A human-friendly name associated to a given feed. | [default to null]
**format** | [**CATALOGS_FORMAT**](CatalogsFormat.md) |  | [default to null]
**default_locale** | [**CATALOGS_FEEDS_CREATE_REQUEST_DEFAULT_LOCALE**](CatalogsFeedsCreateRequest_default_locale.md) |  | [default to null]
**credentials** | [**CATALOGS_FEED_CREDENTIALS**](CatalogsFeedCredentials.md) |  | [optional] [default to null]
**location** | [**STRING_32**](STRING_32.md) | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**preferred_processing_schedule** | [**CATALOGS_FEED_PROCESSING_SCHEDULE**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to null]
**catalog_type** | [**CATALOGS_TYPE**](CatalogsType.md) |  | [default to null]
**catalog_id** | [**STRING_32**](STRING_32.md) | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. | [optional] [default to null]
**status** | [**CATALOGS_STATUS**](CatalogsStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


