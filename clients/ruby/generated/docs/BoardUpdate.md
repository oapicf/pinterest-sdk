# PinterestSdkClient::BoardUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **privacy** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BoardUpdate.new(
  name: Summer Recipes,
  description: My favorite summer recipes,
  privacy: null
)
```

