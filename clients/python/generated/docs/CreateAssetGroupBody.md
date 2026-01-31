# CreateAssetGroupBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_description** | **str** | Asset group description | 
**asset_group_name** | **str** | Asset Group name | 
**asset_group_types** | [**List[AssetGroupType]**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 

## Example

```python
from pinterestsdk.models.create_asset_group_body import CreateAssetGroupBody

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetGroupBody from a JSON string
create_asset_group_body_instance = CreateAssetGroupBody.from_json(json)
# print the JSON string representation of the object
print(CreateAssetGroupBody.to_json())

# convert the object into a dict
create_asset_group_body_dict = create_asset_group_body_instance.to_dict()
# create an instance of CreateAssetGroupBody from a dict
create_asset_group_body_from_dict = CreateAssetGroupBody.from_dict(create_asset_group_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


