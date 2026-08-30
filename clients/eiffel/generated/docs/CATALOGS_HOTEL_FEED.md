# CATALOGS_HOTEL_FEED

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | [**STRING_32**](STRING_32.md) | Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. | [default to null]
**catalog_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) |  | [readonly] [default to null]
**credentials** | [**CATALOGS_FEED_CREDENTIALS**](CatalogsFeedCredentials.md) |  | [optional] [default to null]
**default_currency** | [**NULLABLE_CURRENCY**](NullableCurrency.md) |  | [optional] [default to null]
**default_locale** | [**STRING_32**](STRING_32.md) | The locale used within a feed for product descriptions. | [default to null]
**format** | [**CATALOGS_FORMAT**](CatalogsFormat.md) |  | [default to null]
**id** | [**STRING_32**](STRING_32.md) | ID of the feed entity. | [readonly] [default to null]
**location** | [**STRING_32**](STRING_32.md) | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to null]
**preferred_processing_schedule** | [**CATALOGS_FEED_PROCESSING_SCHEDULE**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to null]
**status** | [**CATALOGS_STATUS**](CatalogsStatus.md) |  | [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) |  | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


