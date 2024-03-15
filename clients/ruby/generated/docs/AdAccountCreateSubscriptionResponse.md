# PinterestSdkClient::AdAccountCreateSubscriptionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Subscription ID. | [optional] |
| **cryptographic_key** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] |
| **cryptographic_algorithm** | **String** | Lead data encryption algorithm. | [optional] |
| **created_time** | **Integer** | Subscription creation time. Unix timestamp in milliseconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreateSubscriptionResponse.new(
  id: 8078432025948590686,
  cryptographic_key: ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54,
  cryptographic_algorithm: AES-256-GCM,
  created_time: 1699209842000
)
```

