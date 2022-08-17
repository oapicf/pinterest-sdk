# CatalogsFeedValidationErrors

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **int** | Pinterest couldn&#x27;t download your feed. | [optional] 
**FETCH_INACTIVE_FEED_ERROR** | **int** | Your feed wasn&#x27;t ingested because it hasn’t changed in the previous 90 days. | [optional] 
**ENCODING_ERROR** | **int** | Your feed includes data with an unsupported encoding format. | [optional] 
**DELIMITER_ERROR** | **int** | Your feed includes data with formatting errors. | [optional] 
**REQUIRED_COLUMNS_MISSING** | **int** | Your feed is missing some required column headers. | [optional] 
**IMAGE_LINK_INVALID** | **int** | Some image links are formatted incorrectly. | [optional] 
**ITEMID_MISSING** | **int** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**TITLE_MISSING** | **int** | Some items are missing a title in their product metadata, those items will not be published. | [optional] 
**DESCRIPTION_MISSING** | **int** | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**PRODUCT_LINK_MISSING** | **int** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**IMAGE_LINK_MISSING** | **int** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**AVAILABILITY_INVALID** | **int** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**PRODUCT_PRICE_INVALID** | **int** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**LINK_FORMAT_INVALID** | **int** | Some link values are formatted incorrectly. | [optional] 
**PARSE_LINE_ERROR** | **int** | Your feed contains formatting errors for some items. | [optional] 
**ADWORDS_FORMAT_INVALID** | **int** | Some adwords links contain too many characters. | [optional] 
**INTERNAL_SERVICE_ERROR** | **int** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**NO_VERIFIED_DOMAIN** | **int** | Your merchant domain needs to be claimed. | [optional] 
**ADULT_INVALID** | **int** | Some items have invalid adult values. | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | **int** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**INVALID_DOMAIN** | **int** | Some of your product link values don&#x27;t match the verified domain associated with this account. | [optional] 
**FEED_LENGTH_TOO_LONG** | **int** | Your feed contains too many items, some items will not be published. | [optional] 
**LINK_LENGTH_TOO_LONG** | **int** | Some product links contain too many characters, those items will not be published. | [optional] 
**MALFORMED_XML** | **int** | Your feed couldn&#x27;t be validated because the xml file is formatted incorrectly. | [optional] 
**PRICE_MISSING** | **int** | Some products are missing a price, those items will not be published. | [optional] 
**FEED_TOO_SMALL** | **int** | Your feed couldn&#x27;t be validated because the file doesn&#x27;t contain the minimum number of lines required. | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **int** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **int** | Some items&#x27; main images can&#x27;t be found. | [optional] 
**PINJOIN_CONTENT_UNSAFE** | **int** | Some items were not published because they don&#x27;t meet Pinterest&#x27;s Merchant Guidelines. | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | **int** | Some items were not published because they don&#x27;t meet Pinterest&#x27;s Merchant Guidelines. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

