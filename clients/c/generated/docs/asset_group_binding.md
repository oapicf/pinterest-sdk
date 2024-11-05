# asset_group_binding_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Asset Group ID. | [optional] 
**asset_group_name** | **char \*** | Asset Group name | [optional] 
**asset_group_description** | **char \*** | Asset group description | [optional] 
**asset_group_types** | **list_t \*** | Asset group types | [optional] 
**ad_accounts_ids** | **list_t \*** | A list of ad account IDs under the asset group | [optional] 
**profiles_ids** | **list_t \*** | A list of profile IDs under asset group | [optional] 
**created_time** | **int** | The creation time of the asset group | [optional] 
**updated_time** | **int** | The last update time of the asset group | [optional] 
**owner** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | The data of the business that owns the asset group. | [optional] 
**created_by** | [**business_access_user_summary_t**](business_access_user_summary.md) \* | The data of the user that created the asset group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


