# InviteAssetsSummaryItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of the asset. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from openapi_client.models.invite_assets_summary_item import InviteAssetsSummaryItem

# TODO update the JSON string below
json = "{}"
# create an instance of InviteAssetsSummaryItem from a JSON string
invite_assets_summary_item_instance = InviteAssetsSummaryItem.from_json(json)
# print the JSON string representation of the object
print InviteAssetsSummaryItem.to_json()

# convert the object into a dict
invite_assets_summary_item_dict = invite_assets_summary_item_instance.to_dict()
# create an instance of InviteAssetsSummaryItem from a dict
invite_assets_summary_item_from_dict = InviteAssetsSummaryItem.from_dict(invite_assets_summary_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


