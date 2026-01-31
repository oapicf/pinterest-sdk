# IntegrationsGetList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[IntegrationRecord]**](IntegrationRecord.md) |  | 

## Example

```python
from pinterestsdk.models.integrations_get_list200_response import IntegrationsGetList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of IntegrationsGetList200Response from a JSON string
integrations_get_list200_response_instance = IntegrationsGetList200Response.from_json(json)
# print the JSON string representation of the object
print(IntegrationsGetList200Response.to_json())

# convert the object into a dict
integrations_get_list200_response_dict = integrations_get_list200_response_instance.to_dict()
# create an instance of IntegrationsGetList200Response from a dict
integrations_get_list200_response_from_dict = IntegrationsGetList200Response.from_dict(integrations_get_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


