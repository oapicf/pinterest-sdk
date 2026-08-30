# PinterestSdkClient::CatalogUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [optional] |
| **name** | **String** | A human-friendly name associated to a catalog entity. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogUpdate.new(
  catalog_type: null,
  name: null
)
```

