# AudienceInsightCategoryArrayResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AudienceInsightCategoryCommon]**](AudienceInsightCategoryCommon.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_insight_category_array_response import AudienceInsightCategoryArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceInsightCategoryArrayResponse from a JSON string
audience_insight_category_array_response_instance = AudienceInsightCategoryArrayResponse.from_json(json)
# print the JSON string representation of the object
print(AudienceInsightCategoryArrayResponse.to_json())

# convert the object into a dict
audience_insight_category_array_response_dict = audience_insight_category_array_response_instance.to_dict()
# create an instance of AudienceInsightCategoryArrayResponse from a dict
audience_insight_category_array_response_from_dict = AudienceInsightCategoryArrayResponse.from_dict(audience_insight_category_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


