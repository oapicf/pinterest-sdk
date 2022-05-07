# PinterestSdkClient::CatalogsFeedValidationWarnings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **title_length_too_long** | **Integer** |  | [optional] |
| **description_length_too_long** | **Integer** |  | [optional] |
| **gender_invalid** | **Integer** |  | [optional] |
| **age_group_invalid** | **Integer** |  | [optional] |
| **size_type_invalid** | **Integer** |  | [optional] |
| **link_format_warning** | **Integer** |  | [optional] |
| **duplicate_products** | **Integer** |  | [optional] |
| **duplicate_links** | **Integer** |  | [optional] |
| **sales_price_invalid** | **Integer** |  | [optional] |
| **product_category_depth_warning** | **Integer** |  | [optional] |
| **adwords_same_as_link** | **Integer** |  | [optional] |
| **duplicate_headers** | **Integer** |  | [optional] |
| **fetch_same_signature** | **Integer** |  | [optional] |
| **adwords_format_warning** | **Integer** |  | [optional] |
| **additional_image_link_warning** | **Integer** |  | [optional] |
| **image_link_warning** | **Integer** |  | [optional] |
| **shipping_invalid** | **Integer** |  | [optional] |
| **tax_invalid** | **Integer** |  | [optional] |
| **shipping_weight_invalid** | **Integer** |  | [optional] |
| **expiration_date_invalid** | **Integer** |  | [optional] |
| **availability_date_invalid** | **Integer** |  | [optional] |
| **sale_date_invalid** | **Integer** |  | [optional] |
| **weight_unit_invalid** | **Integer** |  | [optional] |
| **is_bundle_invalid** | **Integer** |  | [optional] |
| **updated_time_invalid** | **Integer** |  | [optional] |
| **custom_label_length_too_long** | **Integer** |  | [optional] |
| **product_type_length_too_long** | **Integer** |  | [optional] |
| **too_many_additional_image_links** | **Integer** |  | [optional] |
| **multipack_invalid** | **Integer** |  | [optional] |
| **indexed_product_count_large_delta** | **Integer** |  | [optional] |
| **item_additional_image_download_failure** | **Integer** |  | [optional] |
| **optional_product_category_missing** | **Integer** |  | [optional] |
| **optional_product_category_invalid** | **Integer** |  | [optional] |
| **optional_condition_missing** | **Integer** |  | [optional] |
| **optional_condition_invalid** | **Integer** |  | [optional] |
| **ios_deep_link_invalid** | **Integer** |  | [optional] |
| **android_deep_link_invalid** | **Integer** |  | [optional] |
| **availability_normalized** | **Integer** |  | [optional] |
| **condition_normalized** | **Integer** |  | [optional] |
| **gender_normalized** | **Integer** |  | [optional] |
| **size_type_normalized** | **Integer** |  | [optional] |
| **age_group_normalized** | **Integer** |  | [optional] |
| **utm_source_auto_corrected** | **Integer** |  | [optional] |
| **country_does_not_map_to_currency** | **Integer** |  | [optional] |
| **min_ad_price_invalid** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedValidationWarnings.new(
  title_length_too_long: null,
  description_length_too_long: null,
  gender_invalid: null,
  age_group_invalid: null,
  size_type_invalid: null,
  link_format_warning: null,
  duplicate_products: null,
  duplicate_links: null,
  sales_price_invalid: null,
  product_category_depth_warning: null,
  adwords_same_as_link: null,
  duplicate_headers: null,
  fetch_same_signature: null,
  adwords_format_warning: null,
  additional_image_link_warning: null,
  image_link_warning: null,
  shipping_invalid: null,
  tax_invalid: null,
  shipping_weight_invalid: null,
  expiration_date_invalid: null,
  availability_date_invalid: null,
  sale_date_invalid: null,
  weight_unit_invalid: null,
  is_bundle_invalid: null,
  updated_time_invalid: null,
  custom_label_length_too_long: null,
  product_type_length_too_long: null,
  too_many_additional_image_links: null,
  multipack_invalid: null,
  indexed_product_count_large_delta: null,
  item_additional_image_download_failure: null,
  optional_product_category_missing: null,
  optional_product_category_invalid: null,
  optional_condition_missing: null,
  optional_condition_invalid: null,
  ios_deep_link_invalid: null,
  android_deep_link_invalid: null,
  availability_normalized: null,
  condition_normalized: null,
  gender_normalized: null,
  size_type_normalized: null,
  age_group_normalized: null,
  utm_source_auto_corrected: null,
  country_does_not_map_to_currency: null,
  min_ad_price_invalid: null
)
```

