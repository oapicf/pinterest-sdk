# AudiencesList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AdAccountsAudience]**](AdAccountsAudience.md) |  | 

## Example

```python
from pinterestsdk.models.audiences_list200_response import AudiencesList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AudiencesList200Response from a JSON string
audiences_list200_response_instance = AudiencesList200Response.from_json(json)
# print the JSON string representation of the object
print(AudiencesList200Response.to_json())

# convert the object into a dict
audiences_list200_response_dict = audiences_list200_response_instance.to_dict()
# create an instance of AudiencesList200Response from a dict
audiences_list200_response_from_dict = AudiencesList200Response.from_dict(audiences_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


