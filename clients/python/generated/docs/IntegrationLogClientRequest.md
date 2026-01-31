# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **str** | HTTP request host from host header. | 
**method** | **str** |  | 
**path** | **str** | HTTP request path. | 
**request_headers** | **Dict[str, str]** | HTTP request headers as key-value pairs. | [optional] 
**response_headers** | **Dict[str, str]** | HTTP response headers as key-value pairs. | [optional] 
**response_status_code** | **int** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_log_client_request import IntegrationLogClientRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogClientRequest from a JSON string
integration_log_client_request_instance = IntegrationLogClientRequest.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogClientRequest.to_json())

# convert the object into a dict
integration_log_client_request_dict = integration_log_client_request_instance.to_dict()
# create an instance of IntegrationLogClientRequest from a dict
integration_log_client_request_from_dict = IntegrationLogClientRequest.from_dict(integration_log_client_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


