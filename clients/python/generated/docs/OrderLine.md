# OrderLine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Ad account ID. | [optional] 
**budget** | **float** | Order line budget in micro currency. | [optional] 
**end_time** | **float** | End time. Unix timestamp. | [optional] 
**id** | **str** | Order line ID. | [optional] 
**name** | **str** | Order line name. | [optional] 
**paid_budget** | **float** | Order line paid budget in micro currency. | [optional] 
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**purchase_order_id** | **str** | Purchase order ID. | [optional] 
**start_time** | **float** | Start time. Unix timestamp. | [optional] 
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**type** | **str** | Always \&quot;orderline\&quot;. | [optional] 
**campaign_ids** | **List[str]** | Associated List of campaign IDs. | 

## Example

```python
from pinterestsdk.models.order_line import OrderLine

# TODO update the JSON string below
json = "{}"
# create an instance of OrderLine from a JSON string
order_line_instance = OrderLine.from_json(json)
# print the JSON string representation of the object
print(OrderLine.to_json())

# convert the object into a dict
order_line_dict = order_line_instance.to_dict()
# create an instance of OrderLine from a dict
order_line_from_dict = OrderLine.from_dict(order_line_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


