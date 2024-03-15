# CatalogsFeedValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fetch_error** | **i32** | Pinterest couldn't download your feed. | [optional] [default to None]
**fetch_inactive_feed_error** | **i32** | Your feed wasn't ingested because it hasn’t changed in the previous 90 days. | [optional] [default to None]
**encoding_error** | **i32** | Your feed includes data with an unsupported encoding format. | [optional] [default to None]
**delimiter_error** | **i32** | Your feed includes data with formatting errors. | [optional] [default to None]
**required_columns_missing** | **i32** | Your feed is missing some required column headers. | [optional] [default to None]
**duplicate_products** | **i32** | Some products are duplicated. | [optional] [default to None]
**image_link_invalid** | **i32** | Some image links are formatted incorrectly. | [optional] [default to None]
**itemid_missing** | **i32** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to None]
**title_missing** | **i32** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to None]
**description_missing** | **i32** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to None]
**product_link_missing** | **i32** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to None]
**image_link_missing** | **i32** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to None]
**availability_invalid** | **i32** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to None]
**product_price_invalid** | **i32** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to None]
**link_format_invalid** | **i32** | Some link values are formatted incorrectly. | [optional] [default to None]
**parse_line_error** | **i32** | Your feed contains formatting errors for some items. | [optional] [default to None]
**adwords_format_invalid** | **i32** | Some adwords links contain too many characters. | [optional] [default to None]
**internal_service_error** | **i32** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to None]
**no_verified_domain** | **i32** | Your merchant domain needs to be claimed. | [optional] [default to None]
**adult_invalid** | **i32** | Some items have invalid adult values. | [optional] [default to None]
**image_link_length_too_long** | **i32** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to None]
**invalid_domain** | **i32** | Some of your product link values don't match the verified domain associated with this account. | [optional] [default to None]
**feed_length_too_long** | **i32** | Your feed contains too many items, some items will not be published. | [optional] [default to None]
**link_length_too_long** | **i32** | Some product links contain too many characters, those items will not be published. | [optional] [default to None]
**malformed_xml** | **i32** | Your feed couldn't be validated because the xml file is formatted incorrectly. | [optional] [default to None]
**price_missing** | **i32** | Some products are missing a price, those items will not be published. | [optional] [default to None]
**feed_too_small** | **i32** | Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. | [optional] [default to None]
**max_items_per_item_group_exceeded** | **i32** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to None]
**item_main_image_download_failure** | **i32** | Some items' main images can't be found. | [optional] [default to None]
**pinjoin_content_unsafe** | **i32** | Some items were not published because they don't meet Pinterest's Merchant Guidelines. | [optional] [default to None]
**blocklisted_image_signature** | **i32** | Some items were not published because they don't meet Pinterest's Merchant Guidelines. | [optional] [default to None]
**list_price_invalid** | **i32** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to None]
**price_cannot_be_determined** | **i32** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


