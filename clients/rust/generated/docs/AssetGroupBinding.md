# AssetGroupBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Asset Group ID. | [optional]
**asset_group_name** | Option<**String**> | Asset Group name | [optional]
**asset_group_description** | Option<**String**> | Asset group description | [optional]
**asset_group_types** | Option<**Vec<String>**> | Asset group types | [optional]
**ad_accounts_ids** | Option<**Vec<String>**> | A list of ad account IDs under the asset group | [optional]
**profiles_ids** | Option<**Vec<String>**> | A list of profile IDs under asset group | [optional]
**created_time** | Option<**i32**> | The creation time of the asset group | [optional]
**updated_time** | Option<**i32**> | The last update time of the asset group | [optional]
**owner** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | The data of the business that owns the asset group. | [optional]
**created_by** | Option<[**models::BusinessAccessUserSummary**](BusinessAccessUserSummary.md)> | The data of the user that created the asset group. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


