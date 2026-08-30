# PinterestSdkClient::TotalCountByEntityStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Integer** | Count of ACTIVE assets | [optional] |
| **archived** | **Integer** | Count of ARCHIVED assets | [optional] |
| **paused** | **Integer** | Count of PAUSED assets | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TotalCountByEntityStatus.new(
  active: null,
  archived: null,
  paused: null
)
```

