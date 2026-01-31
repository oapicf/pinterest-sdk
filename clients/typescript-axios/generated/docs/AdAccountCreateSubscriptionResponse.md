# AdAccountCreateSubscriptionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The Ad Account ID that this lead form belongs to. | [optional] [default to undefined]
**api_version** | **string** | API version. | [optional] [default to undefined]
**created_time** | **number** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to undefined]
**cryptographic_algorithm** | **string** | Lead data encryption algorithm. | [optional] [default to undefined]
**cryptographic_key** | **string** | Base64 encoded key for client to decrypt lead data. | [optional] [default to undefined]
**id** | **string** | Subscription ID. | [optional] [default to undefined]
**lead_form_id** | **string** | Lead form ID. | [optional] [default to undefined]
**user_account_id** | **string** | User account used to subscribe lead data. | [optional] [default to undefined]
**webhook_url** | **string** | Standard HTTPS webhook URL. | [optional] [default to undefined]

## Example

```typescript
import { AdAccountCreateSubscriptionResponse } from './api';

const instance: AdAccountCreateSubscriptionResponse = {
    ad_account_id,
    api_version,
    created_time,
    cryptographic_algorithm,
    cryptographic_key,
    id,
    lead_form_id,
    user_account_id,
    webhook_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
