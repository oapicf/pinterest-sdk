# openapi::CatalogsFeedValidationErrors


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **integer** | Pinterest couldn&#39;t download your feed. | [optional] 
**FETCH_INACTIVE_FEED_ERROR** | **integer** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] 
**ENCODING_ERROR** | **integer** | Your feed includes data with an unsupported encoding format. | [optional] 
**DELIMITER_ERROR** | **integer** | Your feed includes data with formatting errors. | [optional] 
**REQUIRED_COLUMNS_MISSING** | **integer** | Your feed is missing some required column headers. | [optional] 
**DUPLICATE_PRODUCTS** | **integer** | Some products are duplicated. | [optional] 
**IMAGE_LINK_INVALID** | **integer** | Some image links are formatted incorrectly. | [optional] 
**ITEMID_MISSING** | **integer** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**TITLE_MISSING** | **integer** | Some items are missing a title in their product metadata, those items will not be published. | [optional] 
**DESCRIPTION_MISSING** | **integer** | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**PRODUCT_LINK_MISSING** | **integer** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**IMAGE_LINK_MISSING** | **integer** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**AVAILABILITY_INVALID** | **integer** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**PRODUCT_PRICE_INVALID** | **integer** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**LINK_FORMAT_INVALID** | **integer** | Some link values are formatted incorrectly. | [optional] 
**PARSE_LINE_ERROR** | **integer** | Your feed contains formatting errors for some items. | [optional] 
**ADWORDS_FORMAT_INVALID** | **integer** | Some adwords links contain too many characters. | [optional] 
**INTERNAL_SERVICE_ERROR** | **integer** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**NO_VERIFIED_DOMAIN** | **integer** | Your merchant domain needs to be claimed. | [optional] 
**ADULT_INVALID** | **integer** | Some items have invalid adult values. | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | **integer** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**INVALID_DOMAIN** | **integer** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] 
**FEED_LENGTH_TOO_LONG** | **integer** | Your feed contains too many items, some items will not be published. | [optional] 
**LINK_LENGTH_TOO_LONG** | **integer** | Some product links contain too many characters, those items will not be published. | [optional] 
**MALFORMED_XML** | **integer** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] 
**PRICE_MISSING** | **integer** | Some products are missing a price, those items will not be published. | [optional] 
**FEED_TOO_SMALL** | **integer** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **integer** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **integer** | Some items&#39; main images can&#39;t be found. | [optional] 
**PINJOIN_CONTENT_UNSAFE** | **integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | **integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**LIST_PRICE_INVALID** | **integer** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] 
**PRICE_CANNOT_BE_DETERMINED** | **integer** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] 


