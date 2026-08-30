# UserSingleAssetBinding

An object containing the permissions a business member/partner has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  | [optional] 

## Example

```python
from openapi_client.models.user_single_asset_binding import UserSingleAssetBinding

# TODO update the JSON string below
json = "{}"
# create an instance of UserSingleAssetBinding from a JSON string
user_single_asset_binding_instance = UserSingleAssetBinding.from_json(json)
# print the JSON string representation of the object
print UserSingleAssetBinding.to_json()

# convert the object into a dict
user_single_asset_binding_dict = user_single_asset_binding_instance.to_dict()
# create an instance of UserSingleAssetBinding from a dict
user_single_asset_binding_from_dict = UserSingleAssetBinding.from_dict(user_single_asset_binding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


