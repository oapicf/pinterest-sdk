# pinterestsdk.model.audience.Audience

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_account_id** | str,  | str,  | Ad account ID. | [optional] 
**id** | str,  | str,  | Audience ID. | [optional] 
**name** | str,  | str,  | Audience name. | [optional] 
**audience_type** | str,  | str,  | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Pinner-(audience)-list-type\&quot;&gt;Audience type&lt;/a&gt; | [optional] 
**description** | None, str,  | NoneClass, str,  | Audience description. | [optional] 
**rule** | [**AudienceRule**](AudienceRule.md) | [**AudienceRule**](AudienceRule.md) |  | [optional] 
**size** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Audience size. | [optional] 
**status** | str,  | str,  | Audience status. TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] 
**type** | str,  | str,  | Always \&quot;audience\&quot;. | [optional] 
**created_timestamp** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Creation time. Unix timestamp in seconds. | [optional] 
**updated_timestamp** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Last update time. Unix timestamp in seconds. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

