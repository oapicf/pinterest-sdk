# PinterestSdkClient::AudienceDemographicValue

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | Unique key for demographic item | [optional] |
| **name** | **String** | Display name for demographic | [optional] |
| **ratio** | **Float** | Value of demographic item as a percent of total audience | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceDemographicValue.new(
  key: us,
  name: United States,
  ratio: 0.551
)
```

