# IntegrationLogsInvalidLogResponseRejectedLogsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** | The field name containing an invalid value. | 
**log_index** | **int** | Index of the log in the batch. | [optional] 
**reason** | **str** | The reason the value is invalid. | 
**value** | **str** | The value that is invalid. | 

## Example

```python
from openapi_client.models.integration_logs_invalid_log_response_rejected_logs_items import IntegrationLogsInvalidLogResponseRejectedLogsItems

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsInvalidLogResponseRejectedLogsItems from a JSON string
integration_logs_invalid_log_response_rejected_logs_items_instance = IntegrationLogsInvalidLogResponseRejectedLogsItems.from_json(json)
# print the JSON string representation of the object
print IntegrationLogsInvalidLogResponseRejectedLogsItems.to_json()

# convert the object into a dict
integration_logs_invalid_log_response_rejected_logs_items_dict = integration_logs_invalid_log_response_rejected_logs_items_instance.to_dict()
# create an instance of IntegrationLogsInvalidLogResponseRejectedLogsItems from a dict
integration_logs_invalid_log_response_rejected_logs_items_from_dict = IntegrationLogsInvalidLogResponseRejectedLogsItems.from_dict(integration_logs_invalid_log_response_rejected_logs_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


