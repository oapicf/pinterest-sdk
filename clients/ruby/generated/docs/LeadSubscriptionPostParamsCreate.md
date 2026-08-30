# PinterestSdkClient::LeadSubscriptionPostParamsCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **lead_form_id** | **String** | Lead form ID. | [optional] |
| **webhook_url** | **String** | Standard HTTPS webhook URL. |  |
| **partner_access_token** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] |
| **partner_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] |
| **partner_refresh_token** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadSubscriptionPostParamsCreate.new(
  lead_form_id: null,
  webhook_url: null,
  partner_access_token: null,
  partner_metadata: null,
  partner_refresh_token: null
)
```

