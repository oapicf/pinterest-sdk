# AudienceInsights

Audience interests and demographics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[AudienceCategory]**](AudienceCategory.md) | Category interest distribution | [optional] 
**var_date** | **str** | Generation date | [optional] 
**demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**size** | **int** | Population count. | [optional] 
**size_is_upper_bound** | **bool** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 
**type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] 

## Example

```python
from openapi_client.models.audience_insights import AudienceInsights

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceInsights from a JSON string
audience_insights_instance = AudienceInsights.from_json(json)
# print the JSON string representation of the object
print AudienceInsights.to_json()

# convert the object into a dict
audience_insights_dict = audience_insights_instance.to_dict()
# create an instance of AudienceInsights from a dict
audience_insights_from_dict = AudienceInsights.from_dict(audience_insights_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


