# UpdatePartnerAssetAccessItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of the business asset. | 
**partner_id** | **str** | Unique identifier of a business partner to update asset access to. | 
**permissions** | [**List[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Example

```python
from pinterestsdk.models.update_partner_asset_access_item import UpdatePartnerAssetAccessItem

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAssetAccessItem from a JSON string
update_partner_asset_access_item_instance = UpdatePartnerAssetAccessItem.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAssetAccessItem.to_json())

# convert the object into a dict
update_partner_asset_access_item_dict = update_partner_asset_access_item_instance.to_dict()
# create an instance of UpdatePartnerAssetAccessItem from a dict
update_partner_asset_access_item_from_dict = UpdatePartnerAssetAccessItem.from_dict(update_partner_asset_access_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


