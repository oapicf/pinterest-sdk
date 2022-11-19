# pinterestsdk.model.ad_group_response.AdGroupResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[AdGroupCommon](AdGroupCommon.md) | [**AdGroupCommon**](AdGroupCommon.md) | [**AdGroupCommon**](AdGroupCommon.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str,  | str,  | Ad group ID. | [optional] 
**ad_account_id** | str,  | str,  | Advertiser ID. | [optional] 
**created_time** | decimal.Decimal, int,  | decimal.Decimal,  | Ad group creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | decimal.Decimal, int,  | decimal.Decimal,  | Ad group last update time. Unix timestamp in seconds. | [optional] 
**type** | str,  | str,  | Always \&quot;adgroup\&quot;. | [optional] if omitted the server will use the default value of "adgroup"
**conversion_learning_mode_type** | None, str,  | NoneClass, str,  | oCPM learn mode | [optional] must be one of ["NOT_ACTIVE", "ACTIVE", None, ] 
**[summary_status](#summary_status)** | str,  | str,  | Ad group summary status. | [optional] 
**feed_profile_id** | str,  | str,  | Feed Profile ID associated to the adgroup. | [optional] 
**dca_assets** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# summary_status

Ad group summary status.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  | Ad group summary status. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[AdGroupSummaryStatus](AdGroupSummaryStatus.md) | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

