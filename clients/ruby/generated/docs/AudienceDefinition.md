# PinterestSdkClient::AudienceDefinition

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **String** | Generation date | [optional] |
| **type** | **String** | Generated audience type to request. | [optional] |
| **scope** | **String** | Generated audience scope to request. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceDefinition.new(
  date: 2022-10-09,
  type: null,
  scope: null
)
```

