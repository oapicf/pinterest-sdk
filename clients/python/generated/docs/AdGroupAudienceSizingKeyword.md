# AdGroupAudienceSizingKeyword


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_type** | [**MatchType**](MatchType.md) |  | 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from pinterestsdk.models.ad_group_audience_sizing_keyword import AdGroupAudienceSizingKeyword

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupAudienceSizingKeyword from a JSON string
ad_group_audience_sizing_keyword_instance = AdGroupAudienceSizingKeyword.from_json(json)
# print the JSON string representation of the object
print(AdGroupAudienceSizingKeyword.to_json())

# convert the object into a dict
ad_group_audience_sizing_keyword_dict = ad_group_audience_sizing_keyword_instance.to_dict()
# create an instance of AdGroupAudienceSizingKeyword from a dict
ad_group_audience_sizing_keyword_from_dict = AdGroupAudienceSizingKeyword.from_dict(ad_group_audience_sizing_keyword_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


