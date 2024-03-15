# CATALOGS_RETAIL_FEED

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | [**DATE_TIME**](DATE_TIME.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**updated_at** | [**DATE_TIME**](DATE_TIME.md) |  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | [default to null]
**format** | [**CATALOGS_FORMAT**](CatalogsFormat.md) |  | [default to null]
**catalog_type** | [**CATALOGS_TYPE**](CatalogsType.md) |  | [default to null]
**credentials** | [**CATALOGS_FEED_CREDENTIALS**](CatalogsFeedCredentials.md) |  | [default to null]
**location** | [**STRING_32**](STRING_32.md) | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**preferred_processing_schedule** | [**CATALOGS_FEED_PROCESSING_SCHEDULE**](CatalogsFeedProcessingSchedule.md) |  | [default to null]
**status** | [**CATALOGS_STATUS**](CatalogsStatus.md) |  | [default to null]
**default_currency** | [**NULLABLE_CURRENCY**](NullableCurrency.md) |  | [default to null]
**default_locale** | [**STRING_32**](STRING_32.md) | The locale used within a feed for product descriptions. | [default to null]
**default_country** | [**COUNTRY**](Country.md) |  | [default to null]
**default_availability** | [**PRODUCT_AVAILABILITY_TYPE**](ProductAvailabilityType.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


