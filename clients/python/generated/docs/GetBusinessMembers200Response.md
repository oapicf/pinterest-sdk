# GetBusinessMembers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserBusinessRoleBinding]**](UserBusinessRoleBinding.md) | List of business members. | 

## Example

```python
from pinterestsdk.models.get_business_members200_response import GetBusinessMembers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessMembers200Response from a JSON string
get_business_members200_response_instance = GetBusinessMembers200Response.from_json(json)
# print the JSON string representation of the object
print(GetBusinessMembers200Response.to_json())

# convert the object into a dict
get_business_members200_response_dict = get_business_members200_response_instance.to_dict()
# create an instance of GetBusinessMembers200Response from a dict
get_business_members200_response_from_dict = GetBusinessMembers200Response.from_dict(get_business_members200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


