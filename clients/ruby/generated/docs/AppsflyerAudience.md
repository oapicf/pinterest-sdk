# PinterestSdkClient::AppsflyerAudience

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **container_id** | **String** | The ID of the audience container | [readonly] |
| **name** | **String** | The name of the audience |  |
| **platform** | [**AppsflyerPlatform**](AppsflyerPlatform.md) | The platform of the audience |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AppsflyerAudience.new(
  container_id: null,
  name: null,
  platform: null
)
```

