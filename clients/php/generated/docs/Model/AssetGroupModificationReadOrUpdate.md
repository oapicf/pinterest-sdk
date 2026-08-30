# AssetGroupModificationReadOrUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_update** | [**\OpenAPI\Client\Model\AssetGroupUpdateItemReadOrUpdateItem[]**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional]
**exceptions** | [**\OpenAPI\Client\Model\AssetGroupUpdateError[]**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly]
**updated_asset_groups** | [**\OpenAPI\Client\Model\AssetGroupBinding[]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
