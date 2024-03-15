package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedValidationErrors {
    /* Pinterest couldn't download your feed. */
    Integer FETCH_ERROR
    /* Your feed wasn't ingested because it hasn’t changed in the previous 90 days. */
    Integer FETCH_INACTIVE_FEED_ERROR
    /* Your feed includes data with an unsupported encoding format. */
    Integer ENCODING_ERROR
    /* Your feed includes data with formatting errors. */
    Integer DELIMITER_ERROR
    /* Your feed is missing some required column headers. */
    Integer REQUIRED_COLUMNS_MISSING
    /* Some products are duplicated. */
    Integer DUPLICATE_PRODUCTS
    /* Some image links are formatted incorrectly. */
    Integer IMAGE_LINK_INVALID
    /* Some items are missing an item id in their product metadata, those items will not be published. */
    Integer ITEMID_MISSING
    /* Some items are missing a title in their product metadata, those items will not be published. */
    Integer TITLE_MISSING
    /* Some items are missing a description in their product metadata, those items will not be published. */
    Integer DESCRIPTION_MISSING
    /* Some items are missing a link URL in their product metadata, those items will not be published. */
    Integer PRODUCT_LINK_MISSING
    /* Some items are missing an image link URL in their product metadata, those items will not be published. */
    Integer IMAGE_LINK_MISSING
    /* Some items are missing an availability value in their product metadata, those items will not be published. */
    Integer AVAILABILITY_INVALID
    /* Some items have price formatting errors in their product metadata, those items will not be published. */
    Integer PRODUCT_PRICE_INVALID
    /* Some link values are formatted incorrectly. */
    Integer LINK_FORMAT_INVALID
    /* Your feed contains formatting errors for some items. */
    Integer PARSE_LINE_ERROR
    /* Some adwords links contain too many characters. */
    Integer ADWORDS_FORMAT_INVALID
    /* We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. */
    Integer INTERNAL_SERVICE_ERROR
    /* Your merchant domain needs to be claimed. */
    Integer NO_VERIFIED_DOMAIN
    /* Some items have invalid adult values. */
    Integer ADULT_INVALID
    /* Some items have image_link URLs that contain too many characters, so those items will not be published. */
    Integer IMAGE_LINK_LENGTH_TOO_LONG
    /* Some of your product link values don't match the verified domain associated with this account. */
    Integer INVALID_DOMAIN
    /* Your feed contains too many items, some items will not be published. */
    Integer FEED_LENGTH_TOO_LONG
    /* Some product links contain too many characters, those items will not be published. */
    Integer LINK_LENGTH_TOO_LONG
    /* Your feed couldn't be validated because the xml file is formatted incorrectly. */
    Integer MALFORMED_XML
    /* Some products are missing a price, those items will not be published. */
    Integer PRICE_MISSING
    /* Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. */
    Integer FEED_TOO_SMALL
    /* Some items exceed the maximum number of items per item group, those items will not be published. */
    Integer MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
    /* Some items' main images can't be found. */
    Integer ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    Integer PINJOIN_CONTENT_UNSAFE
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    Integer BLOCKLISTED_IMAGE_SIGNATURE
    /* Some items have list price formatting errors in their product metadata, those items will not be published. */
    Integer LIST_PRICE_INVALID
    /* Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. */
    Integer PRICE_CANNOT_BE_DETERMINED
}
