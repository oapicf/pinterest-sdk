# AdGroupAudienceSizingRequestKeywordsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from pinterestsdk.models.ad_group_audience_sizing_request_keywords_inner import AdGroupAudienceSizingRequestKeywordsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupAudienceSizingRequestKeywordsInner from a JSON string
ad_group_audience_sizing_request_keywords_inner_instance = AdGroupAudienceSizingRequestKeywordsInner.from_json(json)
# print the JSON string representation of the object
print(AdGroupAudienceSizingRequestKeywordsInner.to_json())

# convert the object into a dict
ad_group_audience_sizing_request_keywords_inner_dict = ad_group_audience_sizing_request_keywords_inner_instance.to_dict()
# create an instance of AdGroupAudienceSizingRequestKeywordsInner from a dict
ad_group_audience_sizing_request_keywords_inner_from_dict = AdGroupAudienceSizingRequestKeywordsInner.from_dict(ad_group_audience_sizing_request_keywords_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


