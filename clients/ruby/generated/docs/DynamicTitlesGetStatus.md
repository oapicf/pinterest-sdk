# PinterestSdkClient::DynamicTitlesGetStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generated_count** | **Integer** | The count of generated titles. | [optional] |
| **is_ready** | **Boolean** | Whether dynamic titles have been generated and are ready to be reviewed for the ad group. | [optional] |
| **reviewed_count** | **Integer** | The count of advertiser reviewed titles. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DynamicTitlesGetStatus.new(
  generated_count: 987,
  is_ready: true,
  reviewed_count: 456
)
```

