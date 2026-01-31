# PinterestSdkClient::LeadSubscription

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

instance = PinterestSdkClient::LeadSubscription.new(
  ad_account_id: null,
  api_version: null,
  created_time: null,
  cryptographic_algorithm: null,
  cryptographic_key: null,
  id: null,
  lead_form_id: null,
  user_account_id: null,
  webhook_url: null
)
```

