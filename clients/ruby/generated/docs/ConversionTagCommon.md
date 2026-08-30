# PinterestSdkClient::ConversionTagCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code_snippet** | **String** | Tag code snippet. | [optional][readonly] |
| **configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional][readonly] |
| **enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional][readonly] |
| **id** | **String** | Tag ID. | [optional][readonly] |
| **last_fired_time_ms** | **Float** | Time for the last event fired. | [optional][readonly] |
| **name** | **String** | Conversion tag name. |  |
| **version** | **String** | Version number. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionTagCommon.new(
  code_snippet: &lt;script type&#x3D;text/javascript&gt; [...],
  configs: null,
  enhanced_match_status: VALIDATION_COMPLETE,
  id: 2617998078212,
  last_fired_time_ms: 1599030000000,
  name: download_picture,
  version: 3
)
```

