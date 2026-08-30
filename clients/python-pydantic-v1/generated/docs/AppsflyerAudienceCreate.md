# AppsflyerAudienceCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the audience | 
**platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience | 

## Example

```python
from openapi_client.models.appsflyer_audience_create import AppsflyerAudienceCreate

# TODO update the JSON string below
json = "{}"
# create an instance of AppsflyerAudienceCreate from a JSON string
appsflyer_audience_create_instance = AppsflyerAudienceCreate.from_json(json)
# print the JSON string representation of the object
print AppsflyerAudienceCreate.to_json()

# convert the object into a dict
appsflyer_audience_create_dict = appsflyer_audience_create_instance.to_dict()
# create an instance of AppsflyerAudienceCreate from a dict
appsflyer_audience_create_from_dict = AppsflyerAudienceCreate.from_dict(appsflyer_audience_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


