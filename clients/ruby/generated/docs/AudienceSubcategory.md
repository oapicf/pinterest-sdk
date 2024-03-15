# PinterestSdkClient::AudienceSubcategory

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key** | **String** | Interest unique key (same as ID). | [optional] |
| **name** | **String** | Subinterest name. | [optional] |
| **ratio** | **Float** | Subinterest&#39;s percent of category&#39;s total audience. | [optional] |
| **index** | **Float** | Subinterest affinity index. | [optional] |
| **id** | **String** | Subinterest ID. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AudienceSubcategory.new(
  key: 958862518888,
  name: travel destinations,
  ratio: 0.482,
  index: 1.2,
  id: 958862518888
)
```

