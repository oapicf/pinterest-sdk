# PinterestSdkClient::AdAccountCreateSubscriptionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The Ad Account ID that this lead form belongs to. | [optional] |
| **api_version** | **String** | API version. | [optional] |
| **created_time** | **Integer** | Subscription creation time. Unix timestamp in milliseconds. | [optional] |
| **cryptographic_algorithm** | **String** | Lead data encryption algorithm. | [optional] |
| **cryptographic_key** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] |
| **id** | **String** | Subscription ID. | [optional] |
| **lead_form_id** | **String** | Lead form ID. | [optional] |
| **user_account_id** | **String** | User account used to subscribe lead data. | [optional] |
| **webhook_url** | **String** | Standard HTTPS webhook URL. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreateSubscriptionResponse.new(
  ad_account_id: 549755885176,
  api_version: v5,
  created_time: 1699209842000,
  cryptographic_algorithm: AES-256-GCM,
  cryptographic_key: ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54,
  id: 8078432025948590686,
  lead_form_id: 383791336903426390,
  user_account_id: 549755885175,
  webhook_url: https://webhook.example.com/xyz
)
```

