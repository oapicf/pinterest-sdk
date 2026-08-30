# GenderDemographics

Gender demographic distribution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**female** | **float** | Percentage of female users | 
**male** | **float** | Percentage of male users | 
**unspecified** | **float** | Percentage of users with unspecified gender | 

## Example

```python
from openapi_client.models.gender_demographics import GenderDemographics

# TODO update the JSON string below
json = "{}"
# create an instance of GenderDemographics from a JSON string
gender_demographics_instance = GenderDemographics.from_json(json)
# print the JSON string representation of the object
print GenderDemographics.to_json()

# convert the object into a dict
gender_demographics_dict = gender_demographics_instance.to_dict()
# create an instance of GenderDemographics from a dict
gender_demographics_from_dict = GenderDemographics.from_dict(gender_demographics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


