# CreateAssetGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.create_asset_group_response import CreateAssetGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetGroupResponse from a JSON string
create_asset_group_response_instance = CreateAssetGroupResponse.from_json(json)
# print the JSON string representation of the object
print(CreateAssetGroupResponse.to_json())

# convert the object into a dict
create_asset_group_response_dict = create_asset_group_response_instance.to_dict()
# create an instance of CreateAssetGroupResponse from a dict
create_asset_group_response_from_dict = CreateAssetGroupResponse.from_dict(create_asset_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


