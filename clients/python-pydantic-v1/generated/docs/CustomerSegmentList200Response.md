# CustomerSegmentList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CustomerSegment]**](CustomerSegment.md) |  | 

## Example

```python
from openapi_client.models.customer_segment_list200_response import CustomerSegmentList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerSegmentList200Response from a JSON string
customer_segment_list200_response_instance = CustomerSegmentList200Response.from_json(json)
# print the JSON string representation of the object
print CustomerSegmentList200Response.to_json()

# convert the object into a dict
customer_segment_list200_response_dict = customer_segment_list200_response_instance.to_dict()
# create an instance of CustomerSegmentList200Response from a dict
customer_segment_list200_response_from_dict = CustomerSegmentList200Response.from_dict(customer_segment_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


