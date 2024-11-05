# WWW::OpenAPIClient::Object::AssetGroupBinding

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AssetGroupBinding;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Asset Group ID. | [optional] 
**asset_group_name** | **string** | Asset Group name | [optional] 
**asset_group_description** | **string** | Asset group description | [optional] 
**asset_group_types** | **ARRAY[string]** | Asset group types | [optional] 
**ad_accounts_ids** | **ARRAY[string]** | A list of ad account IDs under the asset group | [optional] 
**profiles_ids** | **ARRAY[string]** | A list of profile IDs under asset group | [optional] 
**created_time** | **int** | The creation time of the asset group | [optional] 
**updated_time** | **int** | The last update time of the asset group | [optional] 
**owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] 
**created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


