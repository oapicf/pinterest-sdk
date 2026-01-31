# PinterestSdkClient::TermsOfService

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the ad account. | [optional] |
| **has_accepted** | **Boolean** | Whether the ad account has accepted terms of service. | [optional] |
| **html** | **String** | The terms of service content | [optional] |
| **id** | **String** | The ID of the terms of service | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TermsOfService.new(
  ad_account_id: 549755885175,
  has_accepted: true,
  html: example test,
  id: 2650449554526
)
```

