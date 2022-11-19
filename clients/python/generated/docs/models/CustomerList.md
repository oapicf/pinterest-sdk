# pinterestsdk.model.customer_list.CustomerList

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_account_id** | str,  | str,  | Associated ad account ID. | [optional] 
**created_time** | decimal.Decimal, int, float,  | decimal.Decimal,  | Creation time. Unix timestamp in seconds. | [optional] 
**id** | str,  | str,  | Customer list ID. | [optional] 
**name** | str,  | str,  | Customer list name. | [optional] 
**num_batches** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. | [optional] 
**num_removed_user_records** | decimal.Decimal, int, float,  | decimal.Decimal,  | Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list. | [optional] 
**num_uploaded_user_records** | decimal.Decimal, int, float,  | decimal.Decimal,  | Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list. | [optional] 
**status** | str,  | str,  | Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. | [optional] must be one of ["PROCESSING", "READY", "TOO_SMALL", "UPLOADING", ] 
**type** | str,  | str,  | Always \&quot;customerlist\&quot;. | [optional] 
**updated_time** | decimal.Decimal, int, float,  | decimal.Decimal,  | Last update time. Unix timestamp in seconds. | [optional] 
**[exceptions](#exceptions)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Customer list errors | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# exceptions

Customer list errors

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Customer list errors | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

