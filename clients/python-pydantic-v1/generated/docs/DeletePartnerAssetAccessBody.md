# DeletePartnerAssetAccessBody

An object with a list of partner asset accesses to delete.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesses** | [**List[DeletePartnerAssetAccessItem]**](DeletePartnerAssetAccessItem.md) | List of partner asset accesses to delete. | 

## Example

```python
from openapi_client.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetAccessBody from a JSON string
delete_partner_asset_access_body_instance = DeletePartnerAssetAccessBody.from_json(json)
# print the JSON string representation of the object
print DeletePartnerAssetAccessBody.to_json()

# convert the object into a dict
delete_partner_asset_access_body_dict = delete_partner_asset_access_body_instance.to_dict()
# create an instance of DeletePartnerAssetAccessBody from a dict
delete_partner_asset_access_body_from_dict = DeletePartnerAssetAccessBody.from_dict(delete_partner_asset_access_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


