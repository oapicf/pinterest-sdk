# CatalogsFeedValidationErrors
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **FETCH\_ERROR** | **Integer** | Pinterest couldn&#39;t download your feed. | [optional] [default to null] |
| **FETCH\_INACTIVE\_FEED\_ERROR** | **Integer** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] [default to null] |
| **ENCODING\_ERROR** | **Integer** | Your feed includes data with an unsupported encoding format. | [optional] [default to null] |
| **DELIMITER\_ERROR** | **Integer** | Your feed includes data with formatting errors. | [optional] [default to null] |
| **REQUIRED\_COLUMNS\_MISSING** | **Integer** | Your feed is missing some required column headers. | [optional] [default to null] |
| **IMAGE\_LINK\_INVALID** | **Integer** | Some image links are formatted incorrectly. | [optional] [default to null] |
| **ITEMID\_MISSING** | **Integer** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to null] |
| **TITLE\_MISSING** | **Integer** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to null] |
| **DESCRIPTION\_MISSING** | **Integer** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to null] |
| **PRODUCT\_LINK\_MISSING** | **Integer** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to null] |
| **IMAGE\_LINK\_MISSING** | **Integer** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to null] |
| **AVAILABILITY\_INVALID** | **Integer** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to null] |
| **PRODUCT\_PRICE\_INVALID** | **Integer** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to null] |
| **LINK\_FORMAT\_INVALID** | **Integer** | Some link values are formatted incorrectly. | [optional] [default to null] |
| **PARSE\_LINE\_ERROR** | **Integer** | Your feed contains formatting errors for some items. | [optional] [default to null] |
| **ADWORDS\_FORMAT\_INVALID** | **Integer** | Some adwords links contain too many characters. | [optional] [default to null] |
| **INTERNAL\_SERVICE\_ERROR** | **Integer** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to null] |
| **NO\_VERIFIED\_DOMAIN** | **Integer** | Your merchant domain needs to be claimed. | [optional] [default to null] |
| **ADULT\_INVALID** | **Integer** | Some items have invalid adult values. | [optional] [default to null] |
| **IMAGE\_LINK\_LENGTH\_TOO\_LONG** | **Integer** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to null] |
| **INVALID\_DOMAIN** | **Integer** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] [default to null] |
| **FEED\_LENGTH\_TOO\_LONG** | **Integer** | Your feed contains too many items, some items will not be published. | [optional] [default to null] |
| **LINK\_LENGTH\_TOO\_LONG** | **Integer** | Some product links contain too many characters, those items will not be published. | [optional] [default to null] |
| **MALFORMED\_XML** | **Integer** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] [default to null] |
| **PRICE\_MISSING** | **Integer** | Some products are missing a price, those items will not be published. | [optional] [default to null] |
| **FEED\_TOO\_SMALL** | **Integer** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] [default to null] |
| **MAX\_ITEMS\_PER\_ITEM\_GROUP\_EXCEEDED** | **Integer** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to null] |
| **ITEM\_MAIN\_IMAGE\_DOWNLOAD\_FAILURE** | **Integer** | Some items&#39; main images can&#39;t be found. | [optional] [default to null] |
| **PINJOIN\_CONTENT\_UNSAFE** | **Integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null] |
| **BLOCKLISTED\_IMAGE\_SIGNATURE** | **Integer** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] [default to null] |
| **LIST\_PRICE\_INVALID** | **Integer** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to null] |
| **PRICE\_CANNOT\_BE\_DETERMINED** | **Integer** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

