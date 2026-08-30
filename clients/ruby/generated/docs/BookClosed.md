# PinterestSdkClient::BookClosed

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conversion_metrics_ready** | **Boolean** | Are conversion metrics ready? |  |
| **non_conversion_metrics_ready** | **Boolean** | Are non-conversion metrics ready? |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BookClosed.new(
  conversion_metrics_ready: false,
  non_conversion_metrics_ready: false
)
```

