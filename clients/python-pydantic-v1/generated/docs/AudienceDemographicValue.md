# AudienceDemographicValue

Demographic detail for a single audience demographic

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Unique key for demographic item | [optional] 
**name** | **str** | Display name for demographic | [optional] 
**ratio** | **float** | Value of demographic item as a percent of total audience | [optional] 

## Example

```python
from openapi_client.models.audience_demographic_value import AudienceDemographicValue

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceDemographicValue from a JSON string
audience_demographic_value_instance = AudienceDemographicValue.from_json(json)
# print the JSON string representation of the object
print AudienceDemographicValue.to_json()

# convert the object into a dict
audience_demographic_value_dict = audience_demographic_value_instance.to_dict()
# create an instance of AudienceDemographicValue from a dict
audience_demographic_value_from_dict = AudienceDemographicValue.from_dict(audience_demographic_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


