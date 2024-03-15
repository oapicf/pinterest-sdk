# PinterestSdkClient::CatalogsItemValidationWarnings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_link_format_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **ad_link_same_as_link** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **additional_image_link_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **additional_image_link_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **adwords_format_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **adwords_same_as_link** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **age_group_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **size_system_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **android_deep_link_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **availability_date_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **country_does_not_map_to_currency** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **custom_label_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **description_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **expiration_date_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **gender_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **gtin_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **image_link_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **ios_deep_link_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **is_bundle_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **item_additional_image_download_failure** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **link_format_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **min_ad_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **mpn_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **multipack_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **optional_condition_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **optional_condition_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **optional_product_category_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **optional_product_category_missing** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **product_category_depth_warning** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **product_type_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **sales_price_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **sales_price_too_low** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **sales_price_too_high** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **sale_date_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **shipping_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **shipping_height_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **shipping_weight_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **shipping_width_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **size_type_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **tax_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **title_length_too_long** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **too_many_additional_image_links** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **utm_source_auto_corrected** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |
| **weight_unit_invalid** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsItemValidationWarnings.new(
  ad_link_format_warning: null,
  ad_link_same_as_link: null,
  additional_image_link_length_too_long: null,
  additional_image_link_warning: null,
  adwords_format_warning: null,
  adwords_same_as_link: null,
  age_group_invalid: null,
  size_system_invalid: null,
  android_deep_link_invalid: null,
  availability_date_invalid: null,
  country_does_not_map_to_currency: null,
  custom_label_length_too_long: null,
  description_length_too_long: null,
  expiration_date_invalid: null,
  gender_invalid: null,
  gtin_invalid: null,
  image_link_warning: null,
  ios_deep_link_invalid: null,
  is_bundle_invalid: null,
  item_additional_image_download_failure: null,
  link_format_warning: null,
  min_ad_price_invalid: null,
  mpn_invalid: null,
  multipack_invalid: null,
  optional_condition_invalid: null,
  optional_condition_missing: null,
  optional_product_category_invalid: null,
  optional_product_category_missing: null,
  product_category_depth_warning: null,
  product_type_length_too_long: null,
  sales_price_invalid: null,
  sales_price_too_low: null,
  sales_price_too_high: null,
  sale_date_invalid: null,
  shipping_invalid: null,
  shipping_height_invalid: null,
  shipping_weight_invalid: null,
  shipping_width_invalid: null,
  size_type_invalid: null,
  tax_invalid: null,
  title_length_too_long: null,
  too_many_additional_image_links: null,
  utm_source_auto_corrected: null,
  weight_unit_invalid: null
)
```

