# CustomerSegmentCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_ids** | **List[str]** | Audience IDs included in the customer segment. | 
**name** | **str** | Customer segment name. | 

## Example

```python
from pinterestsdk.models.customer_segment_create import CustomerSegmentCreate

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerSegmentCreate from a JSON string
customer_segment_create_instance = CustomerSegmentCreate.from_json(json)
# print the JSON string representation of the object
print(CustomerSegmentCreate.to_json())

# convert the object into a dict
customer_segment_create_dict = customer_segment_create_instance.to_dict()
# create an instance of CustomerSegmentCreate from a dict
customer_segment_create_from_dict = CustomerSegmentCreate.from_dict(customer_segment_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


