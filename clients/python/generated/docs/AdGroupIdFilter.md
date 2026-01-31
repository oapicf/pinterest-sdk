# AdGroupIdFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **List[str]** | List of ad group ids | [optional] 

## Example

```python
from pinterestsdk.models.ad_group_id_filter import AdGroupIdFilter

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupIdFilter from a JSON string
ad_group_id_filter_instance = AdGroupIdFilter.from_json(json)
# print the JSON string representation of the object
print(AdGroupIdFilter.to_json())

# convert the object into a dict
ad_group_id_filter_dict = ad_group_id_filter_instance.to_dict()
# create an instance of AdGroupIdFilter from a dict
ad_group_id_filter_from_dict = AdGroupIdFilter.from_dict(ad_group_id_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


