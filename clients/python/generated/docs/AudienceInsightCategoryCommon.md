# AudienceInsightCategoryCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**index** | **float** |  | [optional] 
**key** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**ratio** | **float** |  | [optional] 

## Example

```python
from pinterestsdk.models.audience_insight_category_common import AudienceInsightCategoryCommon

# TODO update the JSON string below
json = "{}"
# create an instance of AudienceInsightCategoryCommon from a JSON string
audience_insight_category_common_instance = AudienceInsightCategoryCommon.from_json(json)
# print the JSON string representation of the object
print(AudienceInsightCategoryCommon.to_json())

# convert the object into a dict
audience_insight_category_common_dict = audience_insight_category_common_instance.to_dict()
# create an instance of AudienceInsightCategoryCommon from a dict
audience_insight_category_common_from_dict = AudienceInsightCategoryCommon.from_dict(audience_insight_category_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


