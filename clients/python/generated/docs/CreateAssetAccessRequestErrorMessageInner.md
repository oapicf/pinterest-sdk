# CreateAssetAccessRequestErrorMessageInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** | Error code associated with the error in requesting asset access. | [optional] 
**messages** | **List[str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.create_asset_access_request_error_message_inner import CreateAssetAccessRequestErrorMessageInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetAccessRequestErrorMessageInner from a JSON string
create_asset_access_request_error_message_inner_instance = CreateAssetAccessRequestErrorMessageInner.from_json(json)
# print the JSON string representation of the object
print(CreateAssetAccessRequestErrorMessageInner.to_json())

# convert the object into a dict
create_asset_access_request_error_message_inner_dict = create_asset_access_request_error_message_inner_instance.to_dict()
# create an instance of CreateAssetAccessRequestErrorMessageInner from a dict
create_asset_access_request_error_message_inner_from_dict = CreateAssetAccessRequestErrorMessageInner.from_dict(create_asset_access_request_error_message_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


