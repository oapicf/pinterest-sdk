# PinterestSdkClient::LabelBulkUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. |  |
| **parent_id** | **String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. |  |
| **status** | [**LabelStatusBulkUpdate**](LabelStatusBulkUpdate.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelBulkUpdateRequest.new(
  id: null,
  parent_id: null,
  status: null
)
```

