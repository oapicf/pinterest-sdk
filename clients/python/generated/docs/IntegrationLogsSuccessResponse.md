# IntegrationLogsSuccessResponse

Response when logs are successfully processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.integration_logs_success_response import IntegrationLogsSuccessResponse

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationLogsSuccessResponse from a JSON string
integration_logs_success_response_instance = IntegrationLogsSuccessResponse.from_json(json)
# print the JSON string representation of the object
print(IntegrationLogsSuccessResponse.to_json())

# convert the object into a dict
integration_logs_success_response_dict = integration_logs_success_response_instance.to_dict()
# create an instance of IntegrationLogsSuccessResponse from a dict
integration_logs_success_response_from_dict = IntegrationLogsSuccessResponse.from_dict(integration_logs_success_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


