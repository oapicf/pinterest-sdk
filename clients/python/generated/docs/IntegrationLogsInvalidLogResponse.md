# IntegrationLogsInvalidLogResponse

Schema describing the response when a log has invalid fields.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rejected_logs** | [**List[IntegrationLogsInvalidLogResponseRejectedLogsInner]**](IntegrationLogsInvalidLogResponseRejectedLogsInner.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_logs_invalid_log_response import IntegrationLogsInvalidLogResponse

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsInvalidLogResponse from a JSON string
integration_logs_invalid_log_response_instance = IntegrationLogsInvalidLogResponse.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogsInvalidLogResponse.to_json())

# convert the object into a dict
integration_logs_invalid_log_response_dict = integration_logs_invalid_log_response_instance.to_dict()
# create an instance of IntegrationLogsInvalidLogResponse from a dict
integration_logs_invalid_log_response_from_dict = IntegrationLogsInvalidLogResponse.from_dict(integration_logs_invalid_log_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


