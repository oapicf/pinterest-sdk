# AdAccountCreateSubscriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**webhook_url** | **string** | Standard HTTPS webhook URL. | [default to undefined]
**lead_form_id** | **string** | Lead form ID. | [optional] [default to undefined]
**partner_access_token** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**partner_refresh_token** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**partner_metadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdAccountCreateSubscriptionRequest } from './api';

const instance: AdAccountCreateSubscriptionRequest = {
    webhook_url,
    lead_form_id,
    partner_access_token,
    partner_refresh_token,
    partner_metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
