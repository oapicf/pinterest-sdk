# CatalogsFeedValidationErrors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FETCH_ERROR** | **number** | Pinterest couldn\&#39;t download your feed. | [optional] [default to undefined]
**FETCH_INACTIVE_FEED_ERROR** | **number** | Your feed wasn\&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] [default to undefined]
**ENCODING_ERROR** | **number** | Your feed includes data with an unsupported encoding format. | [optional] [default to undefined]
**DELIMITER_ERROR** | **number** | Your feed includes data with formatting errors. | [optional] [default to undefined]
**REQUIRED_COLUMNS_MISSING** | **number** | Your feed is missing some required column headers. | [optional] [default to undefined]
**DUPLICATE_PRODUCTS** | **number** | Some products are duplicated. | [optional] [default to undefined]
**IMAGE_LINK_INVALID** | **number** | Some image links are formatted incorrectly. | [optional] [default to undefined]
**ITEMID_MISSING** | **number** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] [default to undefined]
**TITLE_MISSING** | **number** | Some items are missing a title in their product metadata, those items will not be published. | [optional] [default to undefined]
**DESCRIPTION_MISSING** | **number** | Some items are missing a description in their product metadata, those items will not be published. | [optional] [default to undefined]
**PRODUCT_LINK_MISSING** | **number** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] [default to undefined]
**IMAGE_LINK_MISSING** | **number** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] [default to undefined]
**AVAILABILITY_INVALID** | **number** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] [default to undefined]
**PRODUCT_PRICE_INVALID** | **number** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] [default to undefined]
**LINK_FORMAT_INVALID** | **number** | Some link values are formatted incorrectly. | [optional] [default to undefined]
**PARSE_LINE_ERROR** | **number** | Your feed contains formatting errors for some items. | [optional] [default to undefined]
**ADWORDS_FORMAT_INVALID** | **number** | Some adwords links contain too many characters. | [optional] [default to undefined]
**INTERNAL_SERVICE_ERROR** | **number** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] [default to undefined]
**NO_VERIFIED_DOMAIN** | **number** | Your merchant domain needs to be claimed. | [optional] [default to undefined]
**ADULT_INVALID** | **number** | Some items have invalid adult values. | [optional] [default to undefined]
**IMAGE_LINK_LENGTH_TOO_LONG** | **number** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] [default to undefined]
**INVALID_DOMAIN** | **number** | Some of your product link values don\&#39;t match the verified domain associated with this account. | [optional] [default to undefined]
**FEED_LENGTH_TOO_LONG** | **number** | Your feed contains too many items, some items will not be published. | [optional] [default to undefined]
**LINK_LENGTH_TOO_LONG** | **number** | Some product links contain too many characters, those items will not be published. | [optional] [default to undefined]
**MALFORMED_XML** | **number** | Your feed couldn\&#39;t be validated because the xml file is formatted incorrectly. | [optional] [default to undefined]
**PRICE_MISSING** | **number** | Some products are missing a price, those items will not be published. | [optional] [default to undefined]
**FEED_TOO_SMALL** | **number** | Your feed couldn\&#39;t be validated because the file doesn\&#39;t contain the minimum number of lines required. | [optional] [default to undefined]
**MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED** | **number** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] [default to undefined]
**ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE** | **number** | Some items\&#39; main images can\&#39;t be found. | [optional] [default to undefined]
**PINJOIN_CONTENT_UNSAFE** | **number** | Some items were not published because they don\&#39;t meet Pinterest\&#39;s Merchant Guidelines. | [optional] [default to undefined]
**BLOCKLISTED_IMAGE_SIGNATURE** | **number** | Some items were not published because they don\&#39;t meet Pinterest\&#39;s Merchant Guidelines. | [optional] [default to undefined]
**LIST_PRICE_INVALID** | **number** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] [default to undefined]
**PRICE_CANNOT_BE_DETERMINED** | **number** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] [default to undefined]

## Example

```typescript
import { CatalogsFeedValidationErrors } from './api';

const instance: CatalogsFeedValidationErrors = {
    FETCH_ERROR,
    FETCH_INACTIVE_FEED_ERROR,
    ENCODING_ERROR,
    DELIMITER_ERROR,
    REQUIRED_COLUMNS_MISSING,
    DUPLICATE_PRODUCTS,
    IMAGE_LINK_INVALID,
    ITEMID_MISSING,
    TITLE_MISSING,
    DESCRIPTION_MISSING,
    PRODUCT_LINK_MISSING,
    IMAGE_LINK_MISSING,
    AVAILABILITY_INVALID,
    PRODUCT_PRICE_INVALID,
    LINK_FORMAT_INVALID,
    PARSE_LINE_ERROR,
    ADWORDS_FORMAT_INVALID,
    INTERNAL_SERVICE_ERROR,
    NO_VERIFIED_DOMAIN,
    ADULT_INVALID,
    IMAGE_LINK_LENGTH_TOO_LONG,
    INVALID_DOMAIN,
    FEED_LENGTH_TOO_LONG,
    LINK_LENGTH_TOO_LONG,
    MALFORMED_XML,
    PRICE_MISSING,
    FEED_TOO_SMALL,
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,
    PINJOIN_CONTENT_UNSAFE,
    BLOCKLISTED_IMAGE_SIGNATURE,
    LIST_PRICE_INVALID,
    PRICE_CANNOT_BE_DETERMINED,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
