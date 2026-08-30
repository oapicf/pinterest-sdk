# SSIOAccountAddress

Salesforce address information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_id** | **string** | Salesforce id for address | [optional] [default to undefined]
**display** | **string** | Address display | [optional] [default to undefined]
**order_legal_entity** | **string** | Legal entity for this insertion order | [optional] [default to undefined]
**purpose** | **string** | Purpose for which the address is used, usually Billing or Businness | [optional] [default to undefined]

## Example

```typescript
import { SSIOAccountAddress } from './api';

const instance: SSIOAccountAddress = {
    address_id,
    display,
    order_legal_entity,
    purpose,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
