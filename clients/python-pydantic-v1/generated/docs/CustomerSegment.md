# CustomerSegment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the ad account that this customer segment belongs to. | [optional] [readonly] 
**audience_ids** | **List[str]** | Audience IDs included in the customer segment. | 
**created_time** | **int** | Customer segment created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **str** | Customer segment ID. | [optional] [readonly] 
**name** | **str** | Customer segment name. | 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional] [readonly] 
**updated_time** | **int** | Customer segment updated time. Unix timestamp in seconds. | [optional] [readonly] 

## Example

```python
from openapi_client.models.customer_segment import CustomerSegment

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerSegment from a JSON string
customer_segment_instance = CustomerSegment.from_json(json)
# print the JSON string representation of the object
print CustomerSegment.to_json()

# convert the object into a dict
customer_segment_dict = customer_segment_instance.to_dict()
# create an instance of CustomerSegment from a dict
customer_segment_from_dict = CustomerSegment.from_dict(customer_segment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


