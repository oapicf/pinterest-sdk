# PinterestSdkClient::AudienceCategory

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | Interest unique key (same as ID). | [optional] |
| **name** | **String** | Interest name. | [optional] |
| **ratio** | **Float** | Interest&#39;s percent of category&#39;s total audience. | [optional] |
| **index** | **Float** | Interest affinity index. | [optional] |
| **id** | **String** | Interest ID. | [optional] |
| **subcategories** | [**Array&lt;AudienceSubcategory&gt;**](AudienceSubcategory.md) | Subcategory interest distribution | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceCategory.new(
  key: 1234567,
  name: travel,
  ratio: 0.551,
  index: 1.2,
  id: 1234567,
  subcategories: null
)
```

