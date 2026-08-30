# AssetIdWithPermissions

Asset ID with permission levels.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of a business asset. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.asset_id_with_permissions import AssetIdWithPermissions

# TODO update the JSON string below
json = "{}"
# create an instance of AssetIdWithPermissions from a JSON string
asset_id_with_permissions_instance = AssetIdWithPermissions.from_json(json)
# print the JSON string representation of the object
print(AssetIdWithPermissions.to_json())

# convert the object into a dict
asset_id_with_permissions_dict = asset_id_with_permissions_instance.to_dict()
# create an instance of AssetIdWithPermissions from a dict
asset_id_with_permissions_from_dict = AssetIdWithPermissions.from_dict(asset_id_with_permissions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


