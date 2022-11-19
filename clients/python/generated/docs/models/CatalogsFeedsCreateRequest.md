# pinterestsdk.model.catalogs_feeds_create_request.CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**format** | [**CatalogsFormat**](CatalogsFormat.md) | [**CatalogsFormat**](CatalogsFormat.md) |  | 
**name** | str,  | str,  | A human-friendly name associated to a given feed. | 
**location** | str,  | str,  | The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. | 
**default_country** | [**Country**](Country.md) | [**Country**](Country.md) |  | [optional] 
**default_availability** | [**ProductAvailabilityType**](ProductAvailabilityType.md) | [**ProductAvailabilityType**](ProductAvailabilityType.md) |  | [optional] 
**default_currency** | [**NullableCurrency**](NullableCurrency.md) | [**NullableCurrency**](NullableCurrency.md) |  | [optional] 
**default_locale** | str,  | str,  | The locale used within a feed for product descriptions. | [optional] 
**credentials** | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) | [**CatalogsFeedCredentials**](CatalogsFeedCredentials.md) |  | [optional] 
**preferred_processing_schedule** | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) | [**CatalogsFeedProcessingSchedule**](CatalogsFeedProcessingSchedule.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

