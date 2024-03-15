# PinterestSdkClient::CatalogsItemValidationErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **adult_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **adwords_format_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **availability_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **blocklisted_image_signature** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **description_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **duplicate_products** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **image_link_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **image_link_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **image_link_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **invalid_domain** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **itemid_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **item_main_image_download_failure** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **link_format_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **link_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **list_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **max_items_per_item_group_exceeded** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **parse_line_error** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **pinjoin_content_unsafe** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **price_cannot_be_determined** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **price_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **product_link_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **product_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **title_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemValidationErrors.new(
  adult_invalid: null,
  adwords_format_invalid: null,
  availability_invalid: null,
  blocklisted_image_signature: null,
  description_missing: null,
  duplicate_products: null,
  image_link_invalid: null,
  image_link_length_too_long: null,
  image_link_missing: null,
  invalid_domain: null,
  itemid_missing: null,
  item_main_image_download_failure: null,
  link_format_invalid: null,
  link_length_too_long: null,
  list_price_invalid: null,
  max_items_per_item_group_exceeded: null,
  parse_line_error: null,
  pinjoin_content_unsafe: null,
  price_cannot_be_determined: null,
  price_missing: null,
  product_link_missing: null,
  product_price_invalid: null,
  title_missing: null
)
```

