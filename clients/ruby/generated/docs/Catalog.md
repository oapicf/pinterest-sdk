# PinterestSdkClient::Catalog

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional] |
| **id** | **String** | ID of the catalog entity. |  |
| **updated_at** | **Time** |  | [optional] |
| **name** | **String** | A human-friendly name associated to a catalog entity. |  |
| **catalog_type** | [**CatalogsType**](CatalogsType.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Catalog.new(
  created_at: 2022-03-14T15:15:22Z,
  id: 864344156814050986,
  updated_at: 2022-03-14T15:16:34Z,
  name: null,
  catalog_type: null
)
```

