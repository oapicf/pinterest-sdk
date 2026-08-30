# LeadSubscriptionPostParamsCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **string** | Lead form ID. | [optional] [default to undefined]
**webhook_url** | **string** | Standard HTTPS webhook URL. | [default to undefined]
**partner_access_token** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]
**partner_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to undefined]
**partner_refresh_token** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to undefined]

## Example

```typescript
import { LeadSubscriptionPostParamsCreate } from './api';

const instance: LeadSubscriptionPostParamsCreate = {
    lead_form_id,
    webhook_url,
    partner_access_token,
    partner_metadata,
    partner_refresh_token,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
