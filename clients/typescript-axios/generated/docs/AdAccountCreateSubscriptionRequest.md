# AdAccountCreateSubscriptionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **string** | Lead form ID. | [optional] [default to undefined]
**partner_access_token** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**partner_metadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] [default to undefined]
**partner_refresh_token** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**webhook_url** | **string** | Standard HTTPS webhook URL. | [default to undefined]

## Example

```typescript
import { AdAccountCreateSubscriptionRequest } from './api';

const instance: AdAccountCreateSubscriptionRequest = {
    lead_form_id,
    partner_access_token,
    partner_metadata,
    partner_refresh_token,
    webhook_url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
