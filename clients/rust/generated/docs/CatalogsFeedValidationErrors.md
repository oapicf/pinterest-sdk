# CatalogsFeedValidationErrors

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fetch_error** | Option<**i32**> | Pinterest couldn't download your feed. | [optional]
**fetch_inactive_feed_error** | Option<**i32**> | Your feed wasn't ingested because it hasn’t changed in the previous 90 days. | [optional]
**encoding_error** | Option<**i32**> | Your feed includes data with an unsupported encoding format. | [optional]
**delimiter_error** | Option<**i32**> | Your feed includes data with formatting errors. | [optional]
**required_columns_missing** | Option<**i32**> | Your feed is missing some required column headers. | [optional]
**duplicate_products** | Option<**i32**> | Some products are duplicated. | [optional]
**image_link_invalid** | Option<**i32**> | Some image links are formatted incorrectly. | [optional]
**itemid_missing** | Option<**i32**> | Some items are missing an item id in their product metadata, those items will not be published. | [optional]
**title_missing** | Option<**i32**> | Some items are missing a title in their product metadata, those items will not be published. | [optional]
**description_missing** | Option<**i32**> | Some items are missing a description in their product metadata, those items will not be published. | [optional]
**product_link_missing** | Option<**i32**> | Some items are missing a link URL in their product metadata, those items will not be published. | [optional]
**image_link_missing** | Option<**i32**> | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional]
**availability_invalid** | Option<**i32**> | Some items are missing an availability value in their product metadata, those items will not be published. | [optional]
**product_price_invalid** | Option<**i32**> | Some items have price formatting errors in their product metadata, those items will not be published. | [optional]
**link_format_invalid** | Option<**i32**> | Some link values are formatted incorrectly. | [optional]
**parse_line_error** | Option<**i32**> | Your feed contains formatting errors for some items. | [optional]
**adwords_format_invalid** | Option<**i32**> | Some adwords links contain too many characters. | [optional]
**internal_service_error** | Option<**i32**> | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional]
**no_verified_domain** | Option<**i32**> | Your merchant domain needs to be claimed. | [optional]
**adult_invalid** | Option<**i32**> | Some items have invalid adult values. | [optional]
**image_link_length_too_long** | Option<**i32**> | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional]
**invalid_domain** | Option<**i32**> | Some of your product link values don't match the verified domain associated with this account. | [optional]
**feed_length_too_long** | Option<**i32**> | Your feed contains too many items, some items will not be published. | [optional]
**link_length_too_long** | Option<**i32**> | Some product links contain too many characters, those items will not be published. | [optional]
**malformed_xml** | Option<**i32**> | Your feed couldn't be validated because the xml file is formatted incorrectly. | [optional]
**price_missing** | Option<**i32**> | Some products are missing a price, those items will not be published. | [optional]
**feed_too_small** | Option<**i32**> | Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. | [optional]
**max_items_per_item_group_exceeded** | Option<**i32**> | Some items exceed the maximum number of items per item group, those items will not be published. | [optional]
**item_main_image_download_failure** | Option<**i32**> | Some items' main images can't be found. | [optional]
**pinjoin_content_unsafe** | Option<**i32**> | Some items were not published because they don't meet Pinterest's Merchant Guidelines. | [optional]
**blocklisted_image_signature** | Option<**i32**> | Some items were not published because they don't meet Pinterest's Merchant Guidelines. | [optional]
**list_price_invalid** | Option<**i32**> | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional]
**price_cannot_be_determined** | Option<**i32**> | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


