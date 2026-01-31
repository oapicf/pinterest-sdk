# PinterestSdkClient::AudienceDefinition

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **String** | Generation date | [optional] |
| **scope** | **String** |  | [optional] |
| **type** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceDefinition.new(
  date: 2022-10-09,
  scope: PARTNER,
  type: IMPRESSION_PLUS_ENGAGEMENT
)
```

