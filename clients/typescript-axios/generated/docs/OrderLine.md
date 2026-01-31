# OrderLine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] [default to undefined]
**budget** | **number** | Order line budget in micro currency. | [optional] [default to undefined]
**end_time** | **number** | End time. Unix timestamp. | [optional] [default to undefined]
**id** | **string** | Order line ID. | [optional] [default to undefined]
**name** | **string** | Order line name. | [optional] [default to undefined]
**paid_budget** | **number** | Order line paid budget in micro currency. | [optional] [default to undefined]
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to undefined]
**purchase_order_id** | **string** | Purchase order ID. | [optional] [default to undefined]
**start_time** | **number** | Start time. Unix timestamp. | [optional] [default to undefined]
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [default to undefined]
**type** | **string** | Always \&quot;orderline\&quot;. | [optional] [default to undefined]
**campaign_ids** | **Array&lt;string&gt;** | Associated List of campaign IDs. | [default to undefined]

## Example

```typescript
import { OrderLine } from './api';

const instance: OrderLine = {
    ad_account_id,
    budget,
    end_time,
    id,
    name,
    paid_budget,
    paid_type,
    purchase_order_id,
    start_time,
    status,
    type,
    campaign_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
