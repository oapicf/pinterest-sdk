# # AssetGroupBinding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Asset Group ID. | [optional]
**asset_group_name** | **string** | Asset Group name | [optional]
**asset_group_description** | **string** | Asset group description | [optional]
**asset_group_types** | **string[]** | Asset group types | [optional]
**ad_accounts_ids** | **string[]** | A list of ad account IDs under the asset group | [optional]
**profiles_ids** | **string[]** | A list of profile IDs under asset group | [optional]
**created_time** | **int** | The creation time of the asset group | [optional]
**updated_time** | **int** | The last update time of the asset group | [optional]
**owner** | [**\OpenAPI\Client\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional]
**created_by** | [**\OpenAPI\Client\Model\BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
