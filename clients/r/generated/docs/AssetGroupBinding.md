# openapi::AssetGroupBinding


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Asset Group ID. | [optional] [Pattern: ^\\d+$] 
**asset_group_name** | **character** | Asset Group name | [optional] 
**asset_group_description** | **character** | Asset group description | [optional] 
**asset_group_types** | **array[character]** | Asset group types | [optional] 
**ad_accounts_ids** | **array[character]** | A list of ad account IDs under the asset group | [optional] 
**profiles_ids** | **array[character]** | A list of profile IDs under asset group | [optional] 
**created_time** | **integer** | The creation time of the asset group | [optional] 
**updated_time** | **integer** | The last update time of the asset group | [optional] 
**owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] 
**created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] 


