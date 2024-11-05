# CatalogsFeedValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **Int!** | Pinterest couldn&#39;t download your feed. | [optional] [default to null]
**FETCH_INACTIVE_FEED_ERROR** | **Int!** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] [default to null]
**ENCODING_ERROR** | **Int!** | Your feed includes data with an unsupported encoding format. | [optional] [default to null]
**DELIMITER_ERROR** | **Int!** | Your feed includes data with formatting errors. | [optional] [default to null]
**REQUIRED_COLUMNS_MISSING** | **Int!** | Your feed is missing some required column headers. | [optional] [default to null]
**DUPLICATE_PRODUCTS** | **Int!** | Some products are duplicated. | [optional] [default to null]
**IMAGE_LINK_INVALID** | **Int!** | Some image links are formatted incorrectly. | [optional] [default to null]
**ITEMID_MISSING** | **Int!** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to null]
**TITLE_MISSING** | **Int!** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to null]
**DESCRIPTION_MISSING** | **Int!** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to null]
**PRODUCT_LINK_MISSING** | **Int!** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to null]
**IMAGE_LINK_MISSING** | **Int!** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to null]
**AVAILABILITY_INVALID** | **Int!** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to null]
**PRODUCT_PRICE_INVALID** | **Int!** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to null]
**LINK_FORMAT_INVALID** | **Int!** | Some link values are formatted incorrectly. | [optional] [default to null]
**PARSE_LINE_ERROR** | **Int!** | Your feed contains formatting errors for some items. | [optional] [default to null]
**ADWORDS_FORMAT_INVALID** | **Int!** | Some adwords links contain too many characters. | [optional] [default to null]
**INTERNAL_SERVICE_ERROR** | **Int!** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to null]
**NO_VERIFIED_DOMAIN** | **Int!** | Your merchant domain needs to be claimed. | [optional] [default to null]
**ADULT_INVALID** | **Int!** | Some items have invalid adult values. | [optional] [default to null]
**IMAGE_LINK_LENGTH_TOO_LONG** | **Int!** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to null]
**INVALID_DOMAIN** | **Int!** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] [default to null]
**FEED_LENGTH_TOO_LONG** | **Int!** | Your feed contains too many items, some items will not be published. | [optional] [default to null]
**LINK_LENGTH_TOO_LONG** | **Int!** | Some product links contain too many characters, those items will not be published. | [optional] [default to null]
**MALFORMED_XML** | **Int!** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] [default to null]
**PRICE_MISSING** | **Int!** | Some products are missing a price, those items will not be published. | [optional] [default to null]
**FEED_TOO_SMALL** | **Int!** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] [default to null]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **Int!** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to null]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **Int!** | Some items&#39; main images can&#39;t be found. | [optional] [default to null]
**PINJOIN_CONTENT_UNSAFE** | **Int!** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null]
**BLOCKLISTED_IMAGE_SIGNATURE** | **Int!** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null]
**LIST_PRICE_INVALID** | **Int!** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to null]
**PRICE_CANNOT_BE_DETERMINED** | **Int!** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


