# PinterestSdkClient::CatalogsProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | ID of the catalog product group. |  |
| **name** | **String** | Name of catalog product group | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
| **type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] |
| **status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] |
| **feed_id** | **String** | id of the catalogs feed belonging to this catalog product group | [optional] |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **updated_at** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsProductGroup.new(
  id: 2680059592705,
  name: Most Popular,
  description: null,
  filters: null,
  type: null,
  status: null,
  feed_id: null,
  created_at: 1621350033000,
  updated_at: 1622742155000
)
```

