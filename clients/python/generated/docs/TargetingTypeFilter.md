# TargetingTypeFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**targeting_types** | **List[str]** | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] 

## Example

```python
from pinterestsdk.models.targeting_type_filter import TargetingTypeFilter

# TODO update the JSON string below
json = "{}"
# create an instance of TargetingTypeFilter from a JSON string
targeting_type_filter_instance = TargetingTypeFilter.from_json(json)
# print the JSON string representation of the object
print(TargetingTypeFilter.to_json())

# convert the object into a dict
targeting_type_filter_dict = targeting_type_filter_instance.to_dict()
# create an instance of TargetingTypeFilter from a dict
targeting_type_filter_from_dict = TargetingTypeFilter.from_dict(targeting_type_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


