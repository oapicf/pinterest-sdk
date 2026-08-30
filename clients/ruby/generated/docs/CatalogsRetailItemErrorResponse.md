# PinterestSdkClient::CatalogsRetailItemErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **catalog_type** | **String** |  |  |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the errors for the item id requested |  |
| **item_id** | **String** | The catalog item id in the merchant namespace | [optional] |
| **item_response_kind** | **String** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsRetailItemErrorResponse.new(
  catalog_type: null,
  errors: null,
  item_id: DS0294-M,
  item_response_kind: null
)
```

