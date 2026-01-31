# CreateAssetAccessRequestResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**List[CreateAssetAccessRequestErrorMessageInner]**](CreateAssetAccessRequestErrorMessageInner.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] 
**invites** | **Dict[str, str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.create_asset_access_request_response import CreateAssetAccessRequestResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetAccessRequestResponse from a JSON string
create_asset_access_request_response_instance = CreateAssetAccessRequestResponse.from_json(json)
# print the JSON string representation of the object
print(CreateAssetAccessRequestResponse.to_json())

# convert the object into a dict
create_asset_access_request_response_dict = create_asset_access_request_response_instance.to_dict()
# create an instance of CreateAssetAccessRequestResponse from a dict
create_asset_access_request_response_from_dict = CreateAssetAccessRequestResponse.from_dict(create_asset_access_request_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


