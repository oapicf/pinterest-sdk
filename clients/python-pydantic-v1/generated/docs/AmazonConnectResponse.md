# AmazonConnectResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Amazon connect response message | [optional] 

## Example

```python
from openapi_client.models.amazon_connect_response import AmazonConnectResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonConnectResponse from a JSON string
amazon_connect_response_instance = AmazonConnectResponse.from_json(json)
# print the JSON string representation of the object
print AmazonConnectResponse.to_json()

# convert the object into a dict
amazon_connect_response_dict = amazon_connect_response_instance.to_dict()
# create an instance of AmazonConnectResponse from a dict
amazon_connect_response_from_dict = AmazonConnectResponse.from_dict(amazon_connect_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


