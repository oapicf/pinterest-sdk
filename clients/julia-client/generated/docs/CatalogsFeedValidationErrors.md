# CatalogsFeedValidationErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ADULT_INVALID`** | **`Int64`** | Some items have invalid adult values. | [optional] [default to nothing]
**`ADWORDS_FORMAT_INVALID`** | **`Int64`** | Some adwords links contain too many characters. | [optional] [default to nothing]
**`AVAILABILITY_INVALID`** | **`Int64`** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to nothing]
**`BLOCKLISTED_IMAGE_SIGNATURE`** | **`Int64`** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to nothing]
**`DELIMITER_ERROR`** | **`Int64`** | Your feed includes data with formatting errors. | [optional] [default to nothing]
**`DESCRIPTION_MISSING`** | **`Int64`** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to nothing]
**`DUPLICATE_PRODUCTS`** | **`Int64`** | Some products are duplicated. | [optional] [default to nothing]
**`ENCODING_ERROR`** | **`Int64`** | Your feed includes data with an unsupported encoding format. | [optional] [default to nothing]
**`FEED_LENGTH_TOO_LONG`** | **`Int64`** | Your feed contains too many items, some items will not be published. | [optional] [default to nothing]
**`FEED_TOO_SMALL`** | **`Int64`** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] [default to nothing]
**`FETCH_ERROR`** | **`Int64`** | Pinterest couldn&#39;t download your feed. | [optional] [default to nothing]
**`FETCH_INACTIVE_FEED_ERROR`** | **`Int64`** | Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days. | [optional] [default to nothing]
**`IMAGE_LINK_INVALID`** | **`Int64`** | Some image links are formatted incorrectly. | [optional] [default to nothing]
**`IMAGE_LINK_LENGTH_TOO_LONG`** | **`Int64`** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to nothing]
**`IMAGE_LINK_MISSING`** | **`Int64`** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to nothing]
**`INTERNAL_SERVICE_ERROR`** | **`Int64`** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to nothing]
**`INVALID_DOMAIN`** | **`Int64`** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] [default to nothing]
**`ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE`** | **`Int64`** | Some items&#39; main images can&#39;t be found. | [optional] [default to nothing]
**`ITEMID_MISSING`** | **`Int64`** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to nothing]
**`LINK_FORMAT_INVALID`** | **`Int64`** | Some link values are formatted incorrectly. | [optional] [default to nothing]
**`LINK_LENGTH_TOO_LONG`** | **`Int64`** | Some product links contain too many characters, those items will not be published. | [optional] [default to nothing]
**`LIST_PRICE_INVALID`** | **`Int64`** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to nothing]
**`MALFORMED_XML`** | **`Int64`** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] [default to nothing]
**`MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED`** | **`Int64`** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to nothing]
**`NO_VERIFIED_DOMAIN`** | **`Int64`** | Your merchant domain needs to be claimed. | [optional] [default to nothing]
**`PARSE_LINE_ERROR`** | **`Int64`** | Your feed contains formatting errors for some items. | [optional] [default to nothing]
**`PINJOIN_CONTENT_UNSAFE`** | **`Int64`** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to nothing]
**`PRICE_CANNOT_BE_DETERMINED`** | **`Int64`** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to nothing]
**`PRICE_MISSING`** | **`Int64`** | Some products are missing a price, those items will not be published. | [optional] [default to nothing]
**`PRODUCT_LINK_MISSING`** | **`Int64`** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to nothing]
**`PRODUCT_PRICE_INVALID`** | **`Int64`** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to nothing]
**`REQUIRED_COLUMNS_MISSING`** | **`Int64`** | Your feed is missing some required column headers. | [optional] [default to nothing]
**`TITLE_MISSING`** | **`Int64`** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


