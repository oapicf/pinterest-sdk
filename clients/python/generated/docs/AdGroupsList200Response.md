# AdGroupsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AdGroupResponse]**](AdGroupResponse.md) |  | 

## Example

```python
from pinterestsdk.models.ad_groups_list200_response import AdGroupsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupsList200Response from a JSON string
ad_groups_list200_response_instance = AdGroupsList200Response.from_json(json)
# print the JSON string representation of the object
print(AdGroupsList200Response.to_json())

# convert the object into a dict
ad_groups_list200_response_dict = ad_groups_list200_response_instance.to_dict()
# create an instance of AdGroupsList200Response from a dict
ad_groups_list200_response_from_dict = AdGroupsList200Response.from_dict(ad_groups_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


