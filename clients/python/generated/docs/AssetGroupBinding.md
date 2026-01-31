# AssetGroupBinding


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts_ids** | **List[str]** | A list of ad account IDs under the asset group | [optional] 
**asset_group_description** | **str** | Asset group description | [optional] 
**asset_group_name** | **str** | Asset Group name | [optional] 
**asset_group_types** | **List[str]** | Asset group types | [optional] 
**catalogs_ids** | **List[str]** | A list of catalog IDs under asset group | [optional] 
**created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] 
**created_time** | **int** | The creation time of the asset group | [optional] 
**id** | **str** | Asset Group ID. | [optional] 
**owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] 
**profiles_ids** | **List[str]** | A list of profile IDs under asset group | [optional] 
**updated_time** | **int** | The last update time of the asset group | [optional] 

## Example

```python
from pinterestsdk.models.asset_group_binding import AssetGroupBinding

# TODO update the JSON string below
json = "{}"
# create an instance of AssetGroupBinding from a JSON string
asset_group_binding_instance = AssetGroupBinding.from_json(json)
# print the JSON string representation of the object
print(AssetGroupBinding.to_json())

# convert the object into a dict
asset_group_binding_dict = asset_group_binding_instance.to_dict()
# create an instance of AssetGroupBinding from a dict
asset_group_binding_from_dict = AssetGroupBinding.from_dict(asset_group_binding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


