# IntegrationLogsRequest

Batch of logs sent from an integration application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logs** | [**List[IntegrationLog]**](IntegrationLog.md) |  | 

## Example

```python
from pinterestsdk.models.integration_logs_request import IntegrationLogsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsRequest from a JSON string
integration_logs_request_instance = IntegrationLogsRequest.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogsRequest.to_json())

# convert the object into a dict
integration_logs_request_dict = integration_logs_request_instance.to_dict()
# create an instance of IntegrationLogsRequest from a dict
integration_logs_request_from_dict = IntegrationLogsRequest.from_dict(integration_logs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


