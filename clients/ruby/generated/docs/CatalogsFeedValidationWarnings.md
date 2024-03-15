# PinterestSdkClient::CatalogsFeedValidationWarnings

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_link_format_warning** | **Integer** | Some items have ad links that are formatted incorrectly. | [optional] |
| **ad_link_same_as_link** | **Integer** | Some items have ad link URLs that are duplicates of the link URLs for those items. | [optional] |
| **title_length_too_long** | **Integer** | The title for some items were truncated because they contain too many characters. | [optional] |
| **description_length_too_long** | **Integer** | The description for some items were truncated because they contain too many characters. | [optional] |
| **gender_invalid** | **Integer** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **age_group_invalid** | **Integer** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **size_type_invalid** | **Integer** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **size_system_invalid** | **Integer** | Some items have size system values which are not one of the supported size systems. | [optional] |
| **link_format_warning** | **Integer** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] |
| **sales_price_invalid** | **Integer** | Some items have sale price values that are higher than the original price of the item. | [optional] |
| **product_category_depth_warning** | **Integer** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **adwords_format_warning** | **Integer** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] |
| **adwords_same_as_link** | **Integer** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] |
| **duplicate_headers** | **Integer** | Your feed contains duplicate headers. | [optional] |
| **fetch_same_signature** | **Integer** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] |
| **additional_image_link_length_too_long** | **Integer** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] |
| **additional_image_link_warning** | **Integer** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] |
| **image_link_warning** | **Integer** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] |
| **shipping_invalid** | **Integer** | Some items have shipping values that are formatted incorrectly. | [optional] |
| **tax_invalid** | **Integer** | Some items have tax values that are formatted incorrectly. | [optional] |
| **shipping_weight_invalid** | **Integer** | Some items have invalid shipping_weight values. | [optional] |
| **expiration_date_invalid** | **Integer** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] |
| **availability_date_invalid** | **Integer** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] |
| **sale_date_invalid** | **Integer** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] |
| **weight_unit_invalid** | **Integer** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] |
| **is_bundle_invalid** | **Integer** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] |
| **updated_time_invalid** | **Integer** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] |
| **custom_label_length_too_long** | **Integer** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] |
| **product_type_length_too_long** | **Integer** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] |
| **too_many_additional_image_links** | **Integer** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] |
| **multipack_invalid** | **Integer** | Some items have invalid multipack values. | [optional] |
| **indexed_product_count_large_delta** | **Integer** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] |
| **item_additional_image_download_failure** | **Integer** | Some items include additional_image_links that can&#39;t be found. | [optional] |
| **optional_product_category_missing** | **Integer** | Some items are missing a google_product_category. | [optional] |
| **optional_product_category_invalid** | **Integer** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] |
| **optional_condition_missing** | **Integer** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **optional_condition_invalid** | **Integer** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] |
| **ios_deep_link_invalid** | **Integer** | Some items include invalid ios_deep_link values. | [optional] |
| **android_deep_link_invalid** | **Integer** | Some items include invalid android_deep_link. | [optional] |
| **utm_source_auto_corrected** | **Integer** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] |
| **country_does_not_map_to_currency** | **Integer** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] |
| **min_ad_price_invalid** | **Integer** | Some items include min_ad_price values that are formatted incorrectly. | [optional] |
| **gtin_invalid** | **Integer** | Some items include incorrectly formatted GTINs. | [optional] |
| **inconsistent_currency_values** | **Integer** | Some items include inconsistent currencies in price fields. | [optional] |
| **sales_price_too_low** | **Integer** | Some items include sales price that is much lower than the list price. | [optional] |
| **shipping_width_invalid** | **Integer** | Some items include incorrectly formatted shipping_width. | [optional] |
| **shipping_height_invalid** | **Integer** | Some items include incorrectly formatted shipping_height. | [optional] |
| **sales_price_too_high** | **Integer** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. | [optional] |
| **mpn_invalid** | **Integer** | Some items include incorrectly formatted MPNs. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedValidationWarnings.new(
  ad_link_format_warning: null,
  ad_link_same_as_link: null,
  title_length_too_long: null,
  description_length_too_long: null,
  gender_invalid: null,
  age_group_invalid: null,
  size_type_invalid: null,
  size_system_invalid: null,
  link_format_warning: null,
  sales_price_invalid: null,
  product_category_depth_warning: null,
  adwords_format_warning: null,
  adwords_same_as_link: null,
  duplicate_headers: null,
  fetch_same_signature: null,
  additional_image_link_length_too_long: null,
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
  utm_source_auto_corrected: null,
  country_does_not_map_to_currency: null,
  min_ad_price_invalid: null,
  gtin_invalid: null,
  inconsistent_currency_values: null,
  sales_price_too_low: null,
  shipping_width_invalid: null,
  shipping_height_invalid: null,
  sales_price_too_high: null,
  mpn_invalid: null
)
```

