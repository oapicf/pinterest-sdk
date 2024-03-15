# PinterestSdkClient::CatalogsFeedValidationErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **fetch_error** | **Integer** | Pinterest couldn&#39;t download your feed. | [optional] |
| **fetch_inactive_feed_error** | **Integer** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] |
| **encoding_error** | **Integer** | Your feed includes data with an unsupported encoding format. | [optional] |
| **delimiter_error** | **Integer** | Your feed includes data with formatting errors. | [optional] |
| **required_columns_missing** | **Integer** | Your feed is missing some required column headers. | [optional] |
| **duplicate_products** | **Integer** | Some products are duplicated. | [optional] |
| **image_link_invalid** | **Integer** | Some image links are formatted incorrectly. | [optional] |
| **itemid_missing** | **Integer** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] |
| **title_missing** | **Integer** | Some items are missing a title in their product metadata, those items will not be published. | [optional] |
| **description_missing** | **Integer** | Some items are missing a description in their product metadata, those items will not be published. | [optional] |
| **product_link_missing** | **Integer** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] |
| **image_link_missing** | **Integer** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] |
| **availability_invalid** | **Integer** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] |
| **product_price_invalid** | **Integer** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] |
| **link_format_invalid** | **Integer** | Some link values are formatted incorrectly. | [optional] |
| **parse_line_error** | **Integer** | Your feed contains formatting errors for some items. | [optional] |
| **adwords_format_invalid** | **Integer** | Some adwords links contain too many characters. | [optional] |
| **internal_service_error** | **Integer** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] |
| **no_verified_domain** | **Integer** | Your merchant domain needs to be claimed. | [optional] |
| **adult_invalid** | **Integer** | Some items have invalid adult values. | [optional] |
| **image_link_length_too_long** | **Integer** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] |
| **invalid_domain** | **Integer** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] |
| **feed_length_too_long** | **Integer** | Your feed contains too many items, some items will not be published. | [optional] |
| **link_length_too_long** | **Integer** | Some product links contain too many characters, those items will not be published. | [optional] |
| **malformed_xml** | **Integer** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] |
| **price_missing** | **Integer** | Some products are missing a price, those items will not be published. | [optional] |
| **feed_too_small** | **Integer** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] |
| **max_items_per_item_group_exceeded** | **Integer** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] |
| **item_main_image_download_failure** | **Integer** | Some items&#39; main images can&#39;t be found. | [optional] |
| **pinjoin_content_unsafe** | **Integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] |
| **blocklisted_image_signature** | **Integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] |
| **list_price_invalid** | **Integer** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] |
| **price_cannot_be_determined** | **Integer** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedValidationErrors.new(
  fetch_error: null,
  fetch_inactive_feed_error: null,
  encoding_error: null,
  delimiter_error: null,
  required_columns_missing: null,
  duplicate_products: null,
  image_link_invalid: null,
  itemid_missing: null,
  title_missing: null,
  description_missing: null,
  product_link_missing: null,
  image_link_missing: null,
  availability_invalid: null,
  product_price_invalid: null,
  link_format_invalid: null,
  parse_line_error: null,
  adwords_format_invalid: null,
  internal_service_error: null,
  no_verified_domain: null,
  adult_invalid: null,
  image_link_length_too_long: null,
  invalid_domain: null,
  feed_length_too_long: null,
  link_length_too_long: null,
  malformed_xml: null,
  price_missing: null,
  feed_too_small: null,
  max_items_per_item_group_exceeded: null,
  item_main_image_download_failure: null,
  pinjoin_content_unsafe: null,
  blocklisted_image_signature: null,
  list_price_invalid: null,
  price_cannot_be_determined: null
)
```

