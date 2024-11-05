# PinterestSdkClient::AdAccountCreateSubscriptionRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **webhook_url** | **String** | Standard HTTPS webhook URL. |  |
| **lead_form_id** | **String** | Lead form ID. | [optional] |
| **partner_access_token** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] |
| **partner_refresh_token** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] |
| **partner_metadata** | [**AdAccountCreateSubscriptionRequestPartnerMetadata**](AdAccountCreateSubscriptionRequestPartnerMetadata.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreateSubscriptionRequest.new(
  webhook_url: https://webhook.example.com/xyz,
  lead_form_id: 383791336903426390,
  partner_access_token: null,
  partner_refresh_token: null,
  partner_metadata: null
)
```

