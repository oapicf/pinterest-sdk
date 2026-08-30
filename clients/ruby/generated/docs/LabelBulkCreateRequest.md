# PinterestSdkClient::LabelBulkCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **labels** | [**Array&lt;LabelCreateItem&gt;**](LabelCreateItem.md) | Labels that you are applying to the campaign. |  |
| **parent_id** | **String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelBulkCreateRequest.new(
  labels: null,
  parent_id: null
)
```

