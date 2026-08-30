# CreateAssetAccessRequestItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id_to_permissions** | **Dict[str, List[Permissions]]** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. | 
**partner_id** | **str** | Unique identifier of a business partner to request asset access to. | 

## Example

```python
from pinterestsdk.models.create_asset_access_request_item import CreateAssetAccessRequestItem

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetAccessRequestItem from a JSON string
create_asset_access_request_item_instance = CreateAssetAccessRequestItem.from_json(json)
# print the JSON string representation of the object
print(CreateAssetAccessRequestItem.to_json())

# convert the object into a dict
create_asset_access_request_item_dict = create_asset_access_request_item_instance.to_dict()
# create an instance of CreateAssetAccessRequestItem from a dict
create_asset_access_request_item_from_dict = CreateAssetAccessRequestItem.from_dict(create_asset_access_request_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


