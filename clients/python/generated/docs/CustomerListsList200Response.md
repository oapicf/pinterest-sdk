# CustomerListsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CustomerList]**](CustomerList.md) |  | 

## Example

```python
from pinterestsdk.models.customer_lists_list200_response import CustomerListsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListsList200Response from a JSON string
customer_lists_list200_response_instance = CustomerListsList200Response.from_json(json)
# print the JSON string representation of the object
print(CustomerListsList200Response.to_json())

# convert the object into a dict
customer_lists_list200_response_dict = customer_lists_list200_response_instance.to_dict()
# create an instance of CustomerListsList200Response from a dict
customer_lists_list200_response_from_dict = CustomerListsList200Response.from_dict(customer_lists_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


