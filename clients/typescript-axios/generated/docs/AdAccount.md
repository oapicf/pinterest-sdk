# AdAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**created_time** | **number** |  Creation time. Unix timestamp in seconds. | [optional] [readonly] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**id** | **string** |  | [default to undefined]
**name** | **string** | Ad account name. | [optional] [default to undefined]
**owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional] [readonly] [default to undefined]
**permissions** | [**Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional] [readonly] [default to undefined]
**updated_time** | **number** |  | [optional] [readonly] [default to undefined]

## Example

```typescript
import { AdAccount } from './api';

const instance: AdAccount = {
    country,
    created_time,
    currency,
    id,
    name,
    owner,
    permissions,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
