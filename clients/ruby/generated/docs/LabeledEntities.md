# PinterestSdkClient::LabeledEntities

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entities_labels** | [**Array&lt;EntityLabel&gt;**](EntityLabel.md) |  | [optional][readonly] |
| **errors** | [**Array&lt;EntityLabelError&gt;**](EntityLabelError.md) | Labels that were not successfully applied. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabeledEntities.new(
  entities_labels: null,
  errors: null
)
```

