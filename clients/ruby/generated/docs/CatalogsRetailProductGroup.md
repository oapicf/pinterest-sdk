# PinterestSdkClient::CatalogsRetailProductGroup

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **id** | **String** | ID of the catalog product group. |  |
| **name** | **String** | Name of catalog product group | [optional] |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  |  |
| **is_featured** | **Boolean** | boolean indicator of whether the product group is being featured or not | [optional] |
| **type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] |
| **status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] |
| **created_at** | **Integer** | Unix timestamp in seconds of when catalog product group was created. | [optional] |
| **updated_at** | **Integer** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] |
| **catalog_id** | **String** | Catalog id pertaining to the retail product group. |  |
| **feed_id** | **String** | id of the catalogs feed belonging to this catalog product group |  |
| **country** | **String** |  | [optional] |
| **locale** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductGroup.new(
  catalog_type: null,
  id: 443727193917,
  name: Most Popular,
  description: null,
  filters: null,
  is_featured: null,
  type: null,
  status: null,
  created_at: 1621350033000,
  updated_at: 1622742155000,
  catalog_id: null,
  feed_id: 2680059592705,
  country: null,
  locale: null
)
```

