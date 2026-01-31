# IntegrationLogClientError

System error details included in the log sent by the client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cause** | **str** | Original cause of the error. | [optional] 
**column_number** | **int** | Column number in the line of the file that raised the error. | [optional] 
**file_name** | **str** | Filename where the error happened. | [optional] 
**line_number** | **int** | Line number where the error happened. | [optional] 
**message** | **str** | Human-readable description of the error. | [optional] 
**message_detail** | **str** | More detail about the message. | [optional] 
**name** | **str** | Filename where the error happened. | [optional] 
**number** | **int** | Integer that specifies the error code. | [optional] 
**stack_trace** | **str** | Stack trace of where the error happened. | [optional] 

## Example

```python
from pinterestsdk.models.integration_log_client_error import IntegrationLogClientError

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogClientError from a JSON string
integration_log_client_error_instance = IntegrationLogClientError.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogClientError.to_json())

# convert the object into a dict
integration_log_client_error_dict = integration_log_client_error_instance.to_dict()
# create an instance of IntegrationLogClientError from a dict
integration_log_client_error_from_dict = IntegrationLogClientError.from_dict(integration_log_client_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


