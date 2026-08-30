# CreateAssetAccessRequestBody

An object containing a list of all the asset access requests

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_requests** | [**List[CreateAssetAccessRequestItem]**](CreateAssetAccessRequestItem.md) |  | 

## Example

```python
from pinterestsdk.models.create_asset_access_request_body import CreateAssetAccessRequestBody

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetAccessRequestBody from a JSON string
create_asset_access_request_body_instance = CreateAssetAccessRequestBody.from_json(json)
# print the JSON string representation of the object
print(CreateAssetAccessRequestBody.to_json())

# convert the object into a dict
create_asset_access_request_body_dict = create_asset_access_request_body_instance.to_dict()
# create an instance of CreateAssetAccessRequestBody from a dict
create_asset_access_request_body_from_dict = CreateAssetAccessRequestBody.from_dict(create_asset_access_request_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


