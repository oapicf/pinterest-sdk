# AdAccountCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**name** | **string** | Ad account name. | [optional] [default to undefined]
**owner_user_id** | **string** | Advertiser\&#39;s owning user ID. | [optional] [default to undefined]

## Example

```typescript
import { AdAccountCreate } from './api';

const instance: AdAccountCreate = {
    country,
    currency,
    name,
    owner_user_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
