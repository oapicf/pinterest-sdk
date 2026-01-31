# PinterestSdkClient::RecordCounts

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **invalid** | **Integer** | Number of invalid records processed |  |
| **processed** | **Integer** | Number of records processed |  |
| **valid** | **Integer** | Number of valid records processed |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::RecordCounts.new(
  invalid: 50,
  processed: 1000,
  valid: 950
)
```

