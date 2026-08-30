# UsersForIndividualAssetResponse

An object containing the permissions a business member has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**member_id** | **str** | Unique identifier of the business member with asset access. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from openapi_client.models.users_for_individual_asset_response import UsersForIndividualAssetResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UsersForIndividualAssetResponse from a JSON string
users_for_individual_asset_response_instance = UsersForIndividualAssetResponse.from_json(json)
# print the JSON string representation of the object
print UsersForIndividualAssetResponse.to_json()

# convert the object into a dict
users_for_individual_asset_response_dict = users_for_individual_asset_response_instance.to_dict()
# create an instance of UsersForIndividualAssetResponse from a dict
users_for_individual_asset_response_from_dict = UsersForIndividualAssetResponse.from_dict(users_for_individual_asset_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


