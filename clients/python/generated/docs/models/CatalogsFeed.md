# pinterestsdk.model.catalogs_feed.CatalogsFeed

Catalogs Feed object

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Catalogs Feed object | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[CatalogsDbItem](CatalogsDbItem.md) | [**CatalogsDbItem**](CatalogsDbItem.md) | [**CatalogsDbItem**](CatalogsDbItem.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | 
**format** | [**CatalogsFormat**](CatalogsFormat.md) | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**name** | None, str,  | NoneClass, str,  | A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. | 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | 
**default_locale** | str,  | str,  | The locale used within a feed for product descriptions. | 
**location** | str,  | str,  | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) | [**NullableCurrency**](NullableCurrency.md) |  | 
**default_country** | [**Country**](Country.md) | [**Country**](Country.md) |  | 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | 
**status** | [**CatalogsStatus**](CatalogsStatus.md) | [**CatalogsStatus**](CatalogsStatus.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

