# ConversionDeletionRequestList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[ConversionDeletionRequest]**](ConversionDeletionRequest.md) |  | 

## Example

```python
from openapi_client.models.conversion_deletion_request_list200_response import ConversionDeletionRequestList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionDeletionRequestList200Response from a JSON string
conversion_deletion_request_list200_response_instance = ConversionDeletionRequestList200Response.from_json(json)
# print the JSON string representation of the object
print ConversionDeletionRequestList200Response.to_json()

# convert the object into a dict
conversion_deletion_request_list200_response_dict = conversion_deletion_request_list200_response_instance.to_dict()
# create an instance of ConversionDeletionRequestList200Response from a dict
conversion_deletion_request_list200_response_from_dict = ConversionDeletionRequestList200Response.from_dict(conversion_deletion_request_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


