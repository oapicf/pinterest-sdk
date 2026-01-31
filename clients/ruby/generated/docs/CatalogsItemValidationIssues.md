# PinterestSdkClient::CatalogsItemValidationIssues

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**CatalogsItemValidationErrors**](CatalogsItemValidationErrors.md) |  |  |
| **item_id** | **String** | The merchant-created unique ID that represents the product. |  |
| **item_number** | **Integer** | Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. |  |
| **warnings** | [**CatalogsItemValidationWarnings**](CatalogsItemValidationWarnings.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemValidationIssues.new(
  errors: null,
  item_id: DS0294-L,
  item_number: 0,
  warnings: null
)
```

