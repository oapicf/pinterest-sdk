# LeadSubscriptionPostParams


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
**partner_access_token** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**partner_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to undefined]
**partner_refresh_token** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]

## Example

```typescript
import { LeadSubscriptionPostParams } from './api';

const instance: LeadSubscriptionPostParams = {
    ad_account_id,
    api_version,
    created_time,
    cryptographic_algorithm,
    cryptographic_key,
    id,
    lead_form_id,
    user_account_id,
    webhook_url,
    partner_access_token,
    partner_metadata,
    partner_refresh_token,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
