# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | 
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | 

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


