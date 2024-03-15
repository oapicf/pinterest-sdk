# PinterestSdkClient::CatalogsItemValidationIssues

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **item_number** | **Integer** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. |  |
| **item_id** | **String** | The merchant-created unique ID that represents the product. |  |
| **errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  |  |
| **warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemValidationIssues.new(
  item_number: 0,
  item_id: DS0294-L,
  errors: null,
  warnings: null
)
```

