# ASSET_GROUP_BINDING

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Asset Group ID. | [optional] [default to null]
**asset_group_name** | [**STRING_32**](STRING_32.md) | Asset Group name | [optional] [default to null]
**asset_group_description** | [**STRING_32**](STRING_32.md) | Asset group description | [optional] [default to null]
**asset_group_types** | [**LIST [STRING_32]**](STRING_32.md) | Asset group types | [optional] [default to null]
**ad_accounts_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of ad account IDs under the asset group | [optional] [default to null]
**profiles_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of profile IDs under asset group | [optional] [default to null]
**created_time** | **INTEGER_32** | The creation time of the asset group | [optional] [default to null]
**updated_time** | **INTEGER_32** | The last update time of the asset group | [optional] [default to null]
**owner** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] [default to null]
**created_by** | [**BUSINESS_ACCESS_USER_SUMMARY**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


