# PinterestSdkClient::CatalogsFeedValidationErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fetch_error** | **Integer** |  | [optional] |
| **fetch_inactive_feed_error** | **Integer** |  | [optional] |
| **encoding_error** | **Integer** |  | [optional] |
| **delimiter_error** | **Integer** |  | [optional] |
| **required_columns_missing** | **Integer** |  | [optional] |
| **image_link_invalid** | **Integer** |  | [optional] |
| **itemid_missing** | **Integer** |  | [optional] |
| **title_missing** | **Integer** |  | [optional] |
| **description_missing** | **Integer** |  | [optional] |
| **product_category_invalid** | **Integer** |  | [optional] |
| **product_link_missing** | **Integer** |  | [optional] |
| **image_link_missing** | **Integer** |  | [optional] |
| **availability_invalid** | **Integer** |  | [optional] |
| **product_price_invalid** | **Integer** |  | [optional] |
| **link_format_invalid** | **Integer** |  | [optional] |
| **parse_line_error** | **Integer** |  | [optional] |
| **adwords_format_invalid** | **Integer** |  | [optional] |
| **product_category_missing** | **Integer** |  | [optional] |
| **internal_service_error** | **Integer** |  | [optional] |
| **no_verified_domain** | **Integer** |  | [optional] |
| **adult_invalid** | **Integer** |  | [optional] |
| **invalid_domain** | **Integer** |  | [optional] |
| **feed_length_too_long** | **Integer** |  | [optional] |
| **link_length_too_long** | **Integer** |  | [optional] |
| **malformed_xml** | **Integer** |  | [optional] |
| **redirect_invalid** | **Integer** |  | [optional] |
| **price_missing** | **Integer** |  | [optional] |
| **feed_too_small** | **Integer** |  | [optional] |
| **condition_invalid** | **Integer** |  | [optional] |
| **shopify_no_products** | **Integer** |  | [optional] |
| **max_items_per_item_group_exceeded** | **Integer** |  | [optional] |
| **item_main_image_download_failure** | **Integer** |  | [optional] |
| **pinjoin_content_unsafe** | **Integer** |  | [optional] |
| **blocklisted_image_signature** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedValidationErrors.new(
  fetch_error: null,
  fetch_inactive_feed_error: null,
  encoding_error: null,
  delimiter_error: null,
  required_columns_missing: null,
  image_link_invalid: null,
  itemid_missing: null,
  title_missing: null,
  description_missing: null,
  product_category_invalid: null,
  product_link_missing: null,
  image_link_missing: null,
  availability_invalid: null,
  product_price_invalid: null,
  link_format_invalid: null,
  parse_line_error: null,
  adwords_format_invalid: null,
  product_category_missing: null,
  internal_service_error: null,
  no_verified_domain: null,
  adult_invalid: null,
  invalid_domain: null,
  feed_length_too_long: null,
  link_length_too_long: null,
  malformed_xml: null,
  redirect_invalid: null,
  price_missing: null,
  feed_too_small: null,
  condition_invalid: null,
  shopify_no_products: null,
  max_items_per_item_group_exceeded: null,
  item_main_image_download_failure: null,
  pinjoin_content_unsafe: null,
  blocklisted_image_signature: null
)
```

