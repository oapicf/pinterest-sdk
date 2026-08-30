# AudienceDemographics

Audience demographics

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ages** | [**List[AudienceDemographicValue]**](AudienceDemographicValue.md) | Ages distribution. | [optional] 
**countries** | [**List[AudienceDemographicValue]**](AudienceDemographicValue.md) | Country area distribution. | [optional] 
**devices** | [**List[AudienceDemographicValue]**](AudienceDemographicValue.md) | Device usage distribution. | [optional] 
**genders** | [**List[AudienceDemographicValue]**](AudienceDemographicValue.md) | Gender distribution. | [optional] 
**metros** | [**List[AudienceDemographicValue]**](AudienceDemographicValue.md) | Geographic metro area distribution. | [optional] 

## Example

```python
from openapi_client.models.audience_demographics import AudienceDemographics

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDemographics from a JSON string
audience_demographics_instance = AudienceDemographics.from_json(json)
# print the JSON string representation of the object
print AudienceDemographics.to_json()

# convert the object into a dict
audience_demographics_dict = audience_demographics_instance.to_dict()
# create an instance of AudienceDemographics from a dict
audience_demographics_from_dict = AudienceDemographics.from_dict(audience_demographics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


