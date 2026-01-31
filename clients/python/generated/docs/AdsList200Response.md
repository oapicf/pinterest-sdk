# AdsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AdResponse]**](AdResponse.md) |  | 

## Example

```python
from pinterestsdk.models.ads_list200_response import AdsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdsList200Response from a JSON string
ads_list200_response_instance = AdsList200Response.from_json(json)
# print the JSON string representation of the object
print(AdsList200Response.to_json())

# convert the object into a dict
ads_list200_response_dict = ads_list200_response_instance.to_dict()
# create an instance of AdsList200Response from a dict
ads_list200_response_from_dict = AdsList200Response.from_dict(ads_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


