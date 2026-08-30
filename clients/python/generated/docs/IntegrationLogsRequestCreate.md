# IntegrationLogsRequestCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | [**List[IntegrationLog]**](IntegrationLog.md) |  | 

## Example

```python
from pinterestsdk.models.integration_logs_request_create import IntegrationLogsRequestCreate

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsRequestCreate from a JSON string
integration_logs_request_create_instance = IntegrationLogsRequestCreate.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogsRequestCreate.to_json())

# convert the object into a dict
integration_logs_request_create_dict = integration_logs_request_create_instance.to_dict()
# create an instance of IntegrationLogsRequestCreate from a dict
integration_logs_request_create_from_dict = IntegrationLogsRequestCreate.from_dict(integration_logs_request_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


