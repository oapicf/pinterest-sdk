# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.asset_id_permissions import AssetIdPermissions

# TODO update the JSON string below
json = "{}"
# create an instance of AssetIdPermissions from a JSON string
asset_id_permissions_instance = AssetIdPermissions.from_json(json)
# print the JSON string representation of the object
print(AssetIdPermissions.to_json())

# convert the object into a dict
asset_id_permissions_dict = asset_id_permissions_instance.to_dict()
# create an instance of AssetIdPermissions from a dict
asset_id_permissions_from_dict = AssetIdPermissions.from_dict(asset_id_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


