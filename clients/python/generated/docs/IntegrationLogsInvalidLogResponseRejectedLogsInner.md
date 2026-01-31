# IntegrationLogsInvalidLogResponseRejectedLogsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_field** | **str** | The field name containing an invalid value. | 
**log_index** | **int** | Index of the log in the batch. | [optional] 
**reason** | **str** | The reason the value is invalid. | 
**value** | **str** | The value that is invalid. | 

## Example

```python
from pinterestsdk.models.integration_logs_invalid_log_response_rejected_logs_inner import IntegrationLogsInvalidLogResponseRejectedLogsInner

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsInvalidLogResponseRejectedLogsInner from a JSON string
integration_logs_invalid_log_response_rejected_logs_inner_instance = IntegrationLogsInvalidLogResponseRejectedLogsInner.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogsInvalidLogResponseRejectedLogsInner.to_json())

# convert the object into a dict
integration_logs_invalid_log_response_rejected_logs_inner_dict = integration_logs_invalid_log_response_rejected_logs_inner_instance.to_dict()
# create an instance of IntegrationLogsInvalidLogResponseRejectedLogsInner from a dict
integration_logs_invalid_log_response_rejected_logs_inner_from_dict = IntegrationLogsInvalidLogResponseRejectedLogsInner.from_dict(integration_logs_invalid_log_response_rejected_logs_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


