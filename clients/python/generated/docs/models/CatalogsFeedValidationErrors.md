# pinterestsdk.model.catalogs_feed_validation_errors.CatalogsFeedValidationErrors

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**FETCH_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Pinterest couldn&#x27;t download your feed. | [optional] 
**FETCH_INACTIVE_FEED_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed wasn&#x27;t ingested because it hasn’t changed in the previous 90 days. | [optional] 
**ENCODING_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed includes data with an unsupported encoding format. | [optional] 
**DELIMITER_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed includes data with formatting errors. | [optional] 
**REQUIRED_COLUMNS_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed is missing some required column headers. | [optional] 
**IMAGE_LINK_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some image links are formatted incorrectly. | [optional] 
**ITEMID_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**TITLE_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing a title in their product metadata, those items will not be published. | [optional] 
**DESCRIPTION_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**PRODUCT_LINK_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**IMAGE_LINK_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**AVAILABILITY_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**PRODUCT_PRICE_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**LINK_FORMAT_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some link values are formatted incorrectly. | [optional] 
**PARSE_LINE_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed contains formatting errors for some items. | [optional] 
**ADWORDS_FORMAT_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some adwords links contain too many characters. | [optional] 
**INTERNAL_SERVICE_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**NO_VERIFIED_DOMAIN** | decimal.Decimal, int,  | decimal.Decimal,  | Your merchant domain needs to be claimed. | [optional] 
**ADULT_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some items have invalid adult values. | [optional] 
**IMAGE_LINK_LENGTH_TOO_LONG** | decimal.Decimal, int,  | decimal.Decimal,  | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**INVALID_DOMAIN** | decimal.Decimal, int,  | decimal.Decimal,  | Some of your product link values don&#x27;t match the verified domain associated with this account. | [optional] 
**FEED_LENGTH_TOO_LONG** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed contains too many items, some items will not be published. | [optional] 
**LINK_LENGTH_TOO_LONG** | decimal.Decimal, int,  | decimal.Decimal,  | Some product links contain too many characters, those items will not be published. | [optional] 
**MALFORMED_XML** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed couldn&#x27;t be validated because the xml file is formatted incorrectly. | [optional] 
**PRICE_MISSING** | decimal.Decimal, int,  | decimal.Decimal,  | Some products are missing a price, those items will not be published. | [optional] 
**FEED_TOO_SMALL** | decimal.Decimal, int,  | decimal.Decimal,  | Your feed couldn&#x27;t be validated because the file doesn&#x27;t contain the minimum number of lines required. | [optional] 
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | decimal.Decimal, int,  | decimal.Decimal,  | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | decimal.Decimal, int,  | decimal.Decimal,  | Some items&#x27; main images can&#x27;t be found. | [optional] 
**PINJOIN_CONTENT_UNSAFE** | decimal.Decimal, int,  | decimal.Decimal,  | Some items were not published because they don&#x27;t meet Pinterest&#x27;s Merchant Guidelines. | [optional] 
**BLOCKLISTED_IMAGE_SIGNATURE** | decimal.Decimal, int,  | decimal.Decimal,  | Some items were not published because they don&#x27;t meet Pinterest&#x27;s Merchant Guidelines. | [optional] 
**LIST_PRICE_INVALID** | decimal.Decimal, int,  | decimal.Decimal,  | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] 
**PRICE_CANNOT_BE_DETERMINED** | decimal.Decimal, int,  | decimal.Decimal,  | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

