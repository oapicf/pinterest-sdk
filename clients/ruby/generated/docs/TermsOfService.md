# PinterestSdkClient::TermsOfService

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The ID of the terms of service | [optional] |
| **html** | **String** | The terms of service content | [optional] |
| **has_accepted** | **Boolean** | Whether the ad account has accepted terms of service. | [optional] |
| **ad_account_id** | **String** | The ID of the ad account. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TermsOfService.new(
  id: 2650449554526,
  html: example test,
  has_accepted: true,
  ad_account_id: 549755885175
)
```

