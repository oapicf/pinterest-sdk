# PinterestSdkClient::TargetingTemplateKeyword

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **match_type** | [**MatchType**](MatchType.md) |  | [optional] |
| **value** | **String** | The keyword targeting (120 chars max). | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TargetingTemplateKeyword.new(
  match_type: null,
  value: couples halloween costumes
)
```

