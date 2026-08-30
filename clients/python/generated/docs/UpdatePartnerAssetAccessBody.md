# UpdatePartnerAssetAccessBody

An object with a list of partner asset accesses to assign or update.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesses** | [**List[UpdatePartnerAssetAccessItem]**](UpdatePartnerAssetAccessItem.md) | List of partner asset accesses to assign or update. | 

## Example

```python
from pinterestsdk.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAssetAccessBody from a JSON string
update_partner_asset_access_body_instance = UpdatePartnerAssetAccessBody.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAssetAccessBody.to_json())

# convert the object into a dict
update_partner_asset_access_body_dict = update_partner_asset_access_body_instance.to_dict()
# create an instance of UpdatePartnerAssetAccessBody from a dict
update_partner_asset_access_body_from_dict = UpdatePartnerAssetAccessBody.from_dict(update_partner_asset_access_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


