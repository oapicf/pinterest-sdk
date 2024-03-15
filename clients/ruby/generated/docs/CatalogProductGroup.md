# PinterestSdkClient::CatalogProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | ID of the catalog product group. | [optional] |
| **merchant_id** | **String** | Merchant ID pertaining to the owner of the catalog product group. | [optional] |
| **name** | **String** | Name of catalog product group | [optional] |
| **filters** | **Object** | Object holding a list of filters | [optional] |
| **filter_v2** | **Object** | Object holding a list of filters | [optional] |
| **type** | [**Board**](Board.md) |  | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **feed_profile_id** | **String** | id of the feed profile belonging to this catalog product group | [optional] |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **last_update** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |
| **product_count** | **Integer** | Amount of products in the catalog product group | [optional] |
| **featured_position** | **Integer** | index of the featured position of the catalog product group | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogProductGroup.new(
  id: 2680059592705,
  merchant_id: 2680059592705,
  name: Most Popular,
  filters: {&quot;1&quot;:[&quot;123chars_title&quot;]},
  filter_v2: {&quot;1&quot;:[&quot;123chars_title&quot;]},
  type: null,
  status: null,
  feed_profile_id: null,
  created_at: 1621350033000,
  last_update: 1622742155000,
  product_count: 6,
  featured_position: 2
)
```

