# pinterestsdk.model.campaign_response.CampaignResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[CampaignId](CampaignId.md) | [**CampaignId**](CampaignId.md) | [**CampaignId**](CampaignId.md) |  | 
[CampaignCommon](CampaignCommon.md) | [**CampaignCommon**](CampaignCommon.md) | [**CampaignCommon**](CampaignCommon.md) |  | 
[all_of_2](#all_of_2) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**items** | [**ObjectiveType**](ObjectiveType.md) | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**created_time** | decimal.Decimal, int,  | decimal.Decimal,  | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | decimal.Decimal, int,  | decimal.Decimal,  | UTC timestamp. Last update time. | [optional] 
**type** | str,  | str,  | Always \&quot;campaign\&quot;. | [optional] 
**is_flexible_daily_budgets** | None, bool,  | NoneClass, BoolClass,  | Determines if a campaign has flexible daily budgets setup. | [optional] 
**is_campaign_budget_optimization** | None, bool,  | NoneClass, BoolClass,  | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

