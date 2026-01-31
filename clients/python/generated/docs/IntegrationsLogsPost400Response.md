# IntegrationsLogsPost400Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**message** | **str** |  | 
**details** | **object** |  | 

## Example

```python
from pinterestsdk.models.integrations_logs_post400_response import IntegrationsLogsPost400Response

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationsLogsPost400Response from a JSON string
integrations_logs_post400_response_instance = IntegrationsLogsPost400Response.from_json(json)
# print the JSON string representation of the object
print(IntegrationsLogsPost400Response.to_json())

# convert the object into a dict
integrations_logs_post400_response_dict = integrations_logs_post400_response_instance.to_dict()
# create an instance of IntegrationsLogsPost400Response from a dict
integrations_logs_post400_response_from_dict = IntegrationsLogsPost400Response.from_dict(integrations_logs_post400_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


