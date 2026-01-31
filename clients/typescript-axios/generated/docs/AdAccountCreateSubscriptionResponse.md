# AdAccountCreateSubscriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Subscription ID. | [optional] [default to undefined]
**cryptographic_key** | **string** | Base64 encoded key for client to decrypt lead data. | [optional] [default to undefined]
**cryptographic_algorithm** | **string** | Lead data encryption algorithm. | [optional] [default to undefined]
**created_time** | **number** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to undefined]

## Example

```typescript
import { AdAccountCreateSubscriptionResponse } from './api';

const instance: AdAccountCreateSubscriptionResponse = {
    id,
    cryptographic_key,
    cryptographic_algorithm,
    created_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
