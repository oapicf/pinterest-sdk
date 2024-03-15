# CATALOGS_FEED_VALIDATION_ERRORS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **INTEGER_32** | Pinterest couldn&#39;t download your feed. | [optional] [default to null]
**FETCH_INACTIVE_FEED_ERROR** | **INTEGER_32** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] [default to null]
**ENCODING_ERROR** | **INTEGER_32** | Your feed includes data with an unsupported encoding format. | [optional] [default to null]
**DELIMITER_ERROR** | **INTEGER_32** | Your feed includes data with formatting errors. | [optional] [default to null]
**REQUIRED_COLUMNS_MISSING** | **INTEGER_32** | Your feed is missing some required column headers. | [optional] [default to null]
**DUPLICATE_PRODUCTS** | **INTEGER_32** | Some products are duplicated. | [optional] [default to null]
**IMAGE_LINK_INVALID** | **INTEGER_32** | Some image links are formatted incorrectly. | [optional] [default to null]
**ITEMID_MISSING** | **INTEGER_32** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to null]
**TITLE_MISSING** | **INTEGER_32** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to null]
**DESCRIPTION_MISSING** | **INTEGER_32** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to null]
**PRODUCT_LINK_MISSING** | **INTEGER_32** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to null]
**IMAGE_LINK_MISSING** | **INTEGER_32** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to null]
**AVAILABILITY_INVALID** | **INTEGER_32** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to null]
**PRODUCT_PRICE_INVALID** | **INTEGER_32** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to null]
**LINK_FORMAT_INVALID** | **INTEGER_32** | Some link values are formatted incorrectly. | [optional] [default to null]
**PARSE_LINE_ERROR** | **INTEGER_32** | Your feed contains formatting errors for some items. | [optional] [default to null]
**ADWORDS_FORMAT_INVALID** | **INTEGER_32** | Some adwords links contain too many characters. | [optional] [default to null]
**INTERNAL_SERVICE_ERROR** | **INTEGER_32** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to null]
**NO_VERIFIED_DOMAIN** | **INTEGER_32** | Your merchant domain needs to be claimed. | [optional] [default to null]
**ADULT_INVALID** | **INTEGER_32** | Some items have invalid adult values. | [optional] [default to null]
**IMAGE_LINK_LENGTH_TOO_LONG** | **INTEGER_32** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to null]
**INVALID_DOMAIN** | **INTEGER_32** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] [default to null]
**FEED_LENGTH_TOO_LONG** | **INTEGER_32** | Your feed contains too many items, some items will not be published. | [optional] [default to null]
**LINK_LENGTH_TOO_LONG** | **INTEGER_32** | Some product links contain too many characters, those items will not be published. | [optional] [default to null]
**MALFORMED_XML** | **INTEGER_32** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] [default to null]
**PRICE_MISSING** | **INTEGER_32** | Some products are missing a price, those items will not be published. | [optional] [default to null]
**FEED_TOO_SMALL** | **INTEGER_32** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] [default to null]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **INTEGER_32** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to null]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **INTEGER_32** | Some items&#39; main images can&#39;t be found. | [optional] [default to null]
**PINJOIN_CONTENT_UNSAFE** | **INTEGER_32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null]
**BLOCKLISTED_IMAGE_SIGNATURE** | **INTEGER_32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null]
**LIST_PRICE_INVALID** | **INTEGER_32** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to null]
**PRICE_CANNOT_BE_DETERMINED** | **INTEGER_32** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


