# AudienceInsightsResponse

Audience interests and demographics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[AudienceCategory]**](AudienceCategory.md) | Category interest distribution | [optional] 
**var_date** | **str** | Generation date | [optional] 
**demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**size** | **int** | Population count. | [optional] 
**size_is_upper_bound** | **bool** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 
**type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] [default to AudienceInsightType.YOUR_TOTAL_AUDIENCE]

## Example

```python
from pinterestsdk.models.audience_insights_response import AudienceInsightsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceInsightsResponse from a JSON string
audience_insights_response_instance = AudienceInsightsResponse.from_json(json)
# print the JSON string representation of the object
print(AudienceInsightsResponse.to_json())

# convert the object into a dict
audience_insights_response_dict = audience_insights_response_instance.to_dict()
# create an instance of AudienceInsightsResponse from a dict
audience_insights_response_from_dict = AudienceInsightsResponse.from_dict(audience_insights_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


