# PinterestSdkClient::SingleInterestTargetingOptionResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **child_interests** | **Array&lt;String&gt;** |  | [optional] |
| **level** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SingleInterestTargetingOptionResponse.new(
  id: 945391946569,
  name: Dress,
  child_interests: null,
  level: 2
)
```

