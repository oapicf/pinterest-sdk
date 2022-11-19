# pinterestsdk.model.catalogs_feeds_update_request.CatalogsFeedsUpdateRequest

Request object for updating a feed.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object for updating a feed. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**name** | str,  | str,  | A human-friendly name associated to a given feed. | [optional] 
**format** | [**CatalogsFormat**](CatalogsFormat.md) | [**CatalogsFormat**](CatalogsFormat.md) |  | [optional] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**location** | str,  | str,  | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**status** | [**CatalogsStatus**](CatalogsStatus.md) | [**CatalogsStatus**](CatalogsStatus.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

