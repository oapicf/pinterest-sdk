# CustomerSegmentUpdateRequestUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_ids** | **List[str]** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. | [optional] 
**id** | **str** | Customer segment ID. | 
**operation_type** | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  | 

## Example

```python
from openapi_client.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody from a JSON string
customer_segment_update_request_update_with_required_body_instance = CustomerSegmentUpdateRequestUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print CustomerSegmentUpdateRequestUpdateWithRequiredBody.to_json()

# convert the object into a dict
customer_segment_update_request_update_with_required_body_dict = customer_segment_update_request_update_with_required_body_instance.to_dict()
# create an instance of CustomerSegmentUpdateRequestUpdateWithRequiredBody from a dict
customer_segment_update_request_update_with_required_body_from_dict = CustomerSegmentUpdateRequestUpdateWithRequiredBody.from_dict(customer_segment_update_request_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


