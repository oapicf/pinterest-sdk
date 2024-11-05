# PinterestSdkClient::CatalogsRetailProductGroupCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. |  |
| **name** | **String** |  |  |
| **description** | **String** |  | [optional] |
| **filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  |  |
| **catalog_id** | **String** | Catalog id pertaining to the retail product group. |  |
| **country** | [**Country**](Country.md) |  |  |
| **locale** | [**CatalogsLocale**](CatalogsLocale.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailProductGroupCreateRequest.new(
  catalog_type: null,
  name: null,
  description: null,
  filters: null,
  catalog_id: 2680059592705,
  country: null,
  locale: null
)
```

