# PinterestSdkClient::DynamicTitlesProcessCSV

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;DynamicTitlesProcessCSVError&gt;**](DynamicTitlesProcessCSVError.md) | List of validation errors. Empty on success. | [optional][readonly] |
| **status** | **String** | Processing status. Present on success. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DynamicTitlesProcessCSV.new(
  errors: null,
  status: SUCCESS
)
```

