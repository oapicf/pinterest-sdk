# AssetGroupModificationReadOrUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_update** | [**List[AssetGroupUpdateItemReadOrUpdateItem]**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional] 
**exceptions** | [**List[AssetGroupUpdateError]**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] 
**updated_asset_groups** | [**List[AssetGroupBinding]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] 

## Example

```python
from openapi_client.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupModificationReadOrUpdate from a JSON string
asset_group_modification_read_or_update_instance = AssetGroupModificationReadOrUpdate.from_json(json)
# print the JSON string representation of the object
print AssetGroupModificationReadOrUpdate.to_json()

# convert the object into a dict
asset_group_modification_read_or_update_dict = asset_group_modification_read_or_update_instance.to_dict()
# create an instance of AssetGroupModificationReadOrUpdate from a dict
asset_group_modification_read_or_update_from_dict = AssetGroupModificationReadOrUpdate.from_dict(asset_group_modification_read_or_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


