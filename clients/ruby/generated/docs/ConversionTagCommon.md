# PinterestSdkClient::ConversionTagCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **code_snippet** | **String** | Tag code snippet. | [optional] |
| **enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) |  | [optional] |
| **id** | **String** | Tag ID. | [optional] |
| **last_fired_time_ms** | **Float** | Time for the last event fired. | [optional] |
| **name** | **String** | Conversion tag name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **version** | **String** | Version number. | [optional] |
| **configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionTagCommon.new(
  ad_account_id: 549755885175,
  code_snippet: &lt;script type&#x3D;text/javascript&gt; [...],
  enhanced_match_status: null,
  id: 2617998078212,
  last_fired_time_ms: 1599030000000,
  name: ACME Checkout Test Tag,
  status: null,
  version: 3,
  configs: null
)
```

