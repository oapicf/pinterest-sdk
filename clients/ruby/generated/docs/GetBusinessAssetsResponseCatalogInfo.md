# PinterestSdkClient::GetBusinessAssetsResponseCatalogInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** | Catalog type | [optional] |
| **id** | **String** | Catalog ID. | [optional] |
| **name** | **String** | Catalog name | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::GetBusinessAssetsResponseCatalogInfo.new(
  catalog_type: PRODUCT,
  id: 4836859046874,
  name: Canada Catalog
)
```

