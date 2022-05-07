# CATALOGS_FEEDS_CREATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default_country** | [**COUNTRY**](Country.md) |  | [optional] [default to null]
**default_availability** | [**PRODUCT_AVAILABILITY_TYPE**](ProductAvailabilityType.md) |  | [optional] [default to null]
**default_currency** | [**NULLABLE_CURRENCY**](NullableCurrency.md) |  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | A human-friendly name associated to a given feed. | [default to null]
**format** | [**CATALOGS_FORMAT**](CatalogsFormat.md) |  | [default to null]
**default_locale** | [**STRING_32**](STRING_32.md) | The locale used within a feed for product descriptions. | [optional] [default to null]
**credentials** | [**CATALOGS_FEED_CREDENTIALS**](CatalogsFeedCredentials.md) |  | [optional] [default to null]
**location** | [**STRING_32**](STRING_32.md) | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [default to null]
**preferred_processing_schedule** | [**CATALOGS_FEED_PROCESSING_SCHEDULE**](CatalogsFeedProcessingSchedule.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


