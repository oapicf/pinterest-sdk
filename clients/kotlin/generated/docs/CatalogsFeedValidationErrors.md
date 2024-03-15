
# CatalogsFeedValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **kotlin.Int** | Pinterest couldn&#39;t download your feed. |  [optional]
**FETCH_INACTIVE_FEED_ERROR** | **kotlin.Int** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. |  [optional]
**ENCODING_ERROR** | **kotlin.Int** | Your feed includes data with an unsupported encoding format. |  [optional]
**DELIMITER_ERROR** | **kotlin.Int** | Your feed includes data with formatting errors. |  [optional]
**REQUIRED_COLUMNS_MISSING** | **kotlin.Int** | Your feed is missing some required column headers. |  [optional]
**DUPLICATE_PRODUCTS** | **kotlin.Int** | Some products are duplicated. |  [optional]
**IMAGE_LINK_INVALID** | **kotlin.Int** | Some image links are formatted incorrectly. |  [optional]
**ITEMID_MISSING** | **kotlin.Int** | Some items are missing an item id in their product metadata, those items will not be published. |  [optional]
**TITLE_MISSING** | **kotlin.Int** | Some items are missing a title in their product metadata, those items will not be published. |  [optional]
**DESCRIPTION_MISSING** | **kotlin.Int** | Some items are missing a description in their product metadata, those items will not be published. |  [optional]
**PRODUCT_LINK_MISSING** | **kotlin.Int** | Some items are missing a link URL in their product metadata, those items will not be published. |  [optional]
**IMAGE_LINK_MISSING** | **kotlin.Int** | Some items are missing an image link URL in their product metadata, those items will not be published. |  [optional]
**AVAILABILITY_INVALID** | **kotlin.Int** | Some items are missing an availability value in their product metadata, those items will not be published. |  [optional]
**PRODUCT_PRICE_INVALID** | **kotlin.Int** | Some items have price formatting errors in their product metadata, those items will not be published. |  [optional]
**LINK_FORMAT_INVALID** | **kotlin.Int** | Some link values are formatted incorrectly. |  [optional]
**PARSE_LINE_ERROR** | **kotlin.Int** | Your feed contains formatting errors for some items. |  [optional]
**ADWORDS_FORMAT_INVALID** | **kotlin.Int** | Some adwords links contain too many characters. |  [optional]
**INTERNAL_SERVICE_ERROR** | **kotlin.Int** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. |  [optional]
**NO_VERIFIED_DOMAIN** | **kotlin.Int** | Your merchant domain needs to be claimed. |  [optional]
**ADULT_INVALID** | **kotlin.Int** | Some items have invalid adult values. |  [optional]
**IMAGE_LINK_LENGTH_TOO_LONG** | **kotlin.Int** | Some items have image_link URLs that contain too many characters, so those items will not be published. |  [optional]
**INVALID_DOMAIN** | **kotlin.Int** | Some of your product link values don&#39;t match the verified domain associated with this account. |  [optional]
**FEED_LENGTH_TOO_LONG** | **kotlin.Int** | Your feed contains too many items, some items will not be published. |  [optional]
**LINK_LENGTH_TOO_LONG** | **kotlin.Int** | Some product links contain too many characters, those items will not be published. |  [optional]
**MALFORMED_XML** | **kotlin.Int** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. |  [optional]
**PRICE_MISSING** | **kotlin.Int** | Some products are missing a price, those items will not be published. |  [optional]
**FEED_TOO_SMALL** | **kotlin.Int** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. |  [optional]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **kotlin.Int** | Some items exceed the maximum number of items per item group, those items will not be published. |  [optional]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **kotlin.Int** | Some items&#39; main images can&#39;t be found. |  [optional]
**PINJOIN_CONTENT_UNSAFE** | **kotlin.Int** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. |  [optional]
**BLOCKLISTED_IMAGE_SIGNATURE** | **kotlin.Int** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. |  [optional]
**LIST_PRICE_INVALID** | **kotlin.Int** | Some items have list price formatting errors in their product metadata, those items will not be published. |  [optional]
**PRICE_CANNOT_BE_DETERMINED** | **kotlin.Int** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. |  [optional]



