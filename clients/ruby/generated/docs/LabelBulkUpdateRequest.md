# PinterestSdkClient::LabelBulkUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Label ID. |  |
| **status** | **String** | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. | [optional] |
| **value** | **String** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LabelBulkUpdateRequest.new(
  id: 1106385754497,
  status: ARCHIVED,
  value: null
)
```

