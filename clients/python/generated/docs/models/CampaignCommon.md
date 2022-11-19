# pinterestsdk.model.campaign_common.CampaignCommon

Campaign Data

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Campaign Data | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_account_id** | str,  | str,  | Campaign&#x27;s Advertiser ID. | [optional] 
**name** | str,  | str,  | Campaign name. | [optional] 
**[status](#status)** | str,  | str,  |  | [optional] 
**lifetime_spend_cap** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Campaign total spending cap. | [optional] 
**daily_spend_cap** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Campaign daily spending cap. | [optional] 
**order_line_id** | None, str,  | NoneClass, str,  | Order line ID that appears on the invoice. | [optional] 
**[tracking_urls](#tracking_urls)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | [optional] 
**start_time** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**end_time** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# status

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[EntityStatus](EntityStatus.md) | [**EntityStatus**](EntityStatus.md) | [**EntityStatus**](EntityStatus.md) |  | 

# tracking_urls

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[TrackingUrls](TrackingUrls.md) | [**TrackingUrls**](TrackingUrls.md) | [**TrackingUrls**](TrackingUrls.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

