# PinterestSdkClient::BookClosedResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conversion_metrics_ready** | **Boolean** | Are conversion metrics ready? | [optional] |
| **non_conversion_metrics_ready** | **Boolean** | Are non-conversion metrics ready? | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BookClosedResponse.new(
  conversion_metrics_ready: false,
  non_conversion_metrics_ready: false
)
```

