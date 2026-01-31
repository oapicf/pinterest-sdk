# AdAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | [optional] [default to undefined]
**name** | **string** |  | [optional] [default to undefined]
**owner** | [**AdAccountOwner**](AdAccountOwner.md) |  | [optional] [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) |  | [optional] [default to undefined]
**permissions** | [**Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional] [default to undefined]
**created_time** | **number** | Creation time. Unix timestamp in seconds. | [optional] [default to undefined]
**updated_time** | **number** | Last update time. Unix timestamp in seconds. | [optional] [default to undefined]

## Example

```typescript
import { AdAccount } from './api';

const instance: AdAccount = {
    id,
    name,
    owner,
    country,
    currency,
    permissions,
    created_time,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
