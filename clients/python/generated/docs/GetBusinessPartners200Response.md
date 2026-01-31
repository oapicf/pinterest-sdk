# GetBusinessPartners200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserBusinessRoleBinding]**](UserBusinessRoleBinding.md) | List of business partners. | 

## Example

```python
from pinterestsdk.models.get_business_partners200_response import GetBusinessPartners200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessPartners200Response from a JSON string
get_business_partners200_response_instance = GetBusinessPartners200Response.from_json(json)
# print the JSON string representation of the object
print(GetBusinessPartners200Response.to_json())

# convert the object into a dict
get_business_partners200_response_dict = get_business_partners200_response_instance.to_dict()
# create an instance of GetBusinessPartners200Response from a dict
get_business_partners200_response_from_dict = GetBusinessPartners200Response.from_dict(get_business_partners200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


