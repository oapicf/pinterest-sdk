# CreateAssetInvitesRequest

Request body for updating asset roles for existing invites.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invites** | [**List[CreateAssetInvitesRequestItem]**](CreateAssetInvitesRequestItem.md) |  | 

## Example

```python
from pinterestsdk.models.create_asset_invites_request import CreateAssetInvitesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetInvitesRequest from a JSON string
create_asset_invites_request_instance = CreateAssetInvitesRequest.from_json(json)
# print the JSON string representation of the object
print(CreateAssetInvitesRequest.to_json())

# convert the object into a dict
create_asset_invites_request_dict = create_asset_invites_request_instance.to_dict()
# create an instance of CreateAssetInvitesRequest from a dict
create_asset_invites_request_from_dict = CreateAssetInvitesRequest.from_dict(create_asset_invites_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


