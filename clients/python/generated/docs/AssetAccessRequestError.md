# AssetAccessRequestError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** | Error code associated with the error in requesting asset access. | [optional] 
**messages** | **List[str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.asset_access_request_error import AssetAccessRequestError

# TODO update the JSON string below
json = "{}"
# create an instance of AssetAccessRequestError from a JSON string
asset_access_request_error_instance = AssetAccessRequestError.from_json(json)
# print the JSON string representation of the object
print(AssetAccessRequestError.to_json())

# convert the object into a dict
asset_access_request_error_dict = asset_access_request_error_instance.to_dict()
# create an instance of AssetAccessRequestError from a dict
asset_access_request_error_from_dict = AssetAccessRequestError.from_dict(asset_access_request_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


