# RetailLocalInventoryItemAttributesOptional

Local inventory attributes for retail items (all fields optional for update/get)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **string** | Ad link for the item | [optional] [default to undefined]
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] [default to undefined]
**price** | **string** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]
**sale_price** | **string** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] [default to undefined]

## Example

```typescript
import { RetailLocalInventoryItemAttributesOptional } from './api';

const instance: RetailLocalInventoryItemAttributesOptional = {
    ad_link,
    availability,
    price,
    sale_price,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
