# PinterestSdkClient::LabelsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;LabelError&gt;**](LabelError.md) | Labels that were not successfully applied. | [optional] |
| **labels** | [**Array&lt;Label&gt;**](Label.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelsResponse.new(
  errors: null,
  labels: null
)
```

