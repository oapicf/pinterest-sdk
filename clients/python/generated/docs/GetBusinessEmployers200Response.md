# GetBusinessEmployers200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[UserBusinessRoleBinding]**](UserBusinessRoleBinding.md) | List of employers. | 

## Example

```python
from pinterestsdk.models.get_business_employers200_response import GetBusinessEmployers200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessEmployers200Response from a JSON string
get_business_employers200_response_instance = GetBusinessEmployers200Response.from_json(json)
# print the JSON string representation of the object
print(GetBusinessEmployers200Response.to_json())

# convert the object into a dict
get_business_employers200_response_dict = get_business_employers200_response_instance.to_dict()
# create an instance of GetBusinessEmployers200Response from a dict
get_business_employers200_response_from_dict = GetBusinessEmployers200Response.from_dict(get_business_employers200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


