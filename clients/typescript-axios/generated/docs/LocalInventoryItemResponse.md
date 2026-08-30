# LocalInventoryItemResponse

Local inventory item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **string** | Ad link for the item | [optional] [default to undefined]
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] [default to undefined]
**created_at** | **number** | The millisecond timestamp when the local inventory item was created | [default to undefined]
**item_id** | **string** | The catalog item id in the merchant namespace | [default to undefined]
**last_updated_time** | **number** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | [default to undefined]
**price** | **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**sale_price** | **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**store_metadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | [default to undefined]

## Example

```typescript
import { LocalInventoryItemResponse } from './api';

const instance: LocalInventoryItemResponse = {
    ad_link,
    availability,
    created_at,
    item_id,
    last_updated_time,
    price,
    sale_price,
    store_metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
