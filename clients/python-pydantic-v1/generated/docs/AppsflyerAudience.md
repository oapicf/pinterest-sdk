# AppsflyerAudience

Request model for creating an AppsFlyer audience

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container_id** | **str** | The ID of the audience container | [readonly] 
**name** | **str** | The name of the audience | 
**platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | 

## Example

```python
from openapi_client.models.appsflyer_audience import AppsflyerAudience

# TODO update the JSON string below
json = "{}"
# create an instance of AppsflyerAudience from a JSON string
appsflyer_audience_instance = AppsflyerAudience.from_json(json)
# print the JSON string representation of the object
print AppsflyerAudience.to_json()

# convert the object into a dict
appsflyer_audience_dict = appsflyer_audience_instance.to_dict()
# create an instance of AppsflyerAudience from a dict
appsflyer_audience_from_dict = AppsflyerAudience.from_dict(appsflyer_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


